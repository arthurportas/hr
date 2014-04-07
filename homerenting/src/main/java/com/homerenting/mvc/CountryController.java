package com.homerenting.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neovisionaries.i18n.CountryCode;

@Controller
public class CountryController {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(CountryController.class);
	

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	@ResponseBody
	public String displayCountries(Model model) {
		slf4jLogger.info("==String displayCountries(Model model)==");
		List<String> countries = new ArrayList<String>(1);
		countries.add(CountryCode.getByCode("PT").getName());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(countries);
			return json;
		} catch (JsonGenerationException jge) {
			slf4jLogger.debug("==JsonGenerationException jge==");
			slf4jLogger.debug(jge.getMessage());
		} catch (JsonMappingException jme) {
			slf4jLogger.debug("==JsonMappingException jme==");
			slf4jLogger.debug(jme.getMessage());
		} catch (IOException ioe) {
			slf4jLogger.debug("==IOException ioe==");
			slf4jLogger.debug(ioe.getMessage());
		}
		return "";
	}
}
