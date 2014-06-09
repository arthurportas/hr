package com.homerenting.mvc;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import com.homerenting.domain.District;
import com.homerenting.domain.modules.header.search.BusinessType;
import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.services.*;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

@Controller(RootController.COMPONENT_NAME)
public class RootController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(RootController.class);

    public static final String COMPONENT_NAME = "rootController";

    @Qualifier("districtServiceImpl")
    @Autowired
    private IDistrictService districtService;

    @Qualifier("regionServiceImpl")
    @Autowired
    private IRegionService regionService;

    @Qualifier("propertyServiceImpl")
    @Autowired
    private IPropertyService propertyService;//should act as a facade dor apartment service villas etc

    @Qualifier(ApartmentServiceImpl.COMPONENT_NAME)
    @Autowired
    private IApartmentService apartmentService;

    @Qualifier(CompanyMOTDServiceImpl.COMPONENT_NAME)
    @Autowired
    private ICompanyMOTDService motdService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public ModelAndView index(Model model, HttpServletRequest request,
                              HttpServletResponse response)  throws ServletException, IOException {
        slf4jLogger.info("==ModelAndView index(Model model)==");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        final List<District> districts = districtService.getAllOrderedByName();
        mav.addObject("districts", districts);
        mav.addObject("regions", districts.get(0).getRegions());//Todo fetch client district
        //mav.addObject("regions", regionService.getAllOrderedByName());
        mav.addObject("propertyKinds", Arrays.asList(PropertyKind.values()));
        mav.addObject("busynessType", Arrays.asList(BusinessType.values()));
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        mav.addObject("username", name);
        if(auth.isAuthenticated() && name!="anonymousUser") {
            mav.addObject("personalArea", "personal");
        }
        final List highlighted = propertyService.getAllHighLighted();
        List firstThreeHighlighted = highlighted.subList(0, 3);
        int hightlightedListSize = highlighted.size();

        List remaingHighlighted = highlighted.subList(3, hightlightedListSize);
        mav.addObject("highlightedProperties", firstThreeHighlighted);
        mav.addObject("remaingHighlightedProperties", remaingHighlighted);
        mav.addObject("motd", motdService.getById(1L));
		return mav;
	}

    @RequestMapping(value = "/qrcode", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void qrcode(Model model, HttpServletRequest request,
                              HttpServletResponse response)  throws ServletException, IOException {
        final int QRCODE_WIDTH = 125;
        final int QRCODE_HEIGHT = 125;

        Cloudinary cloudinary = Singleton.getCloudinary();




        ByteArrayOutputStream out = QRCode.from("http://www.google.pt")
                .to(ImageType.PNG)
                .withSize(QRCODE_WIDTH,QRCODE_HEIGHT)
                .stream();

        response.setContentType("image/png");
        response.setContentLength(out.size());

        OutputStream outStream = response.getOutputStream();

        outStream.write(out.toByteArray());

        outStream.flush();
        outStream.close();
    }
}
