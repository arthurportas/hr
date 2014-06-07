package com.homerenting.test.domain;

import com.homerenting.domain.*;
import com.homerenting.domain.PropertyKind;
import com.homerenting.domain.modules.header.search.*;
import com.homerenting.repo.IPropertyDao;
import com.homerenting.repo.PropertyDaoImpl;
import com.neovisionaries.i18n.CountryCode;
import static com.homerenting.domain.modules.header.search.PropertyKind.APARTMENT;
import static com.homerenting.domain.modules.header.search.Parishes.RAMALDE;
import static com.homerenting.domain.modules.header.search.Regions.PORTO;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class PropertyDaoTest {

    @Qualifier(PropertyDaoImpl.COMPONENT_NAME)
	@Autowired
	private IPropertyDao propertyDao;

    private final String PROPERTY_NAME = "id_name_1000";
    private final String PROPERTY_TITLE = "Fantástico apartamento com  vista para o rio Douro";
    private final String PROPERTY_DESCRIPTION = "Apartamento localizado no 10º andar com fantásticas vistas sobre o rio Douro, em zona sossegada e com óptimos acessos";
    private final float PROPERTY_PRICE = 220.000F;
    private final int USEFULL_AREA = 150;
    private final int BRUTE_AREA = 190;
    private final int YEAR_OF_CONSTRUCTION = 1910;
    private final String COUNTRY = CountryCode.PT.getName();
    private final double latitude = 0D;
    private final double longitude = 0D;

    /*entity relationship dependencies*/
    private District portoDistrict;
    private Region portoRegion;
    private Parish ramalde;
    private PropertyKind propertyKind;

    @Before
    public void init() {

        this.propertyKind = new PropertyKind().getBuilder()
                .withName(APARTMENT.getValue())
                .build();
        /*--------------------------*/

        /*Parish*/
        this.ramalde = new Parish().getBuilder()
                .withName(RAMALDE.getValue())
                .build();

        /*Regions per District*/
        this.portoRegion = new Region().getBuilder()
                .withName(PORTO.getValue())
                .build();

        /*Parishes per Region*/
        Set<Parish> parishes = this.portoRegion.getParishes();
        parishes.add(this.ramalde);

        this.portoRegion.setParishes(parishes);

        this.ramalde.setRegion(this.portoRegion);
        /*--------------------------*/

        /*District*/
        this.portoDistrict.getBuilder()//TODO: why is this null pointer??
                .withName(Districts.PORTO.getValue())
                .build();
        /*Regions collection*/
        Set<Region> regions = this.portoDistrict.getRegions();
        regions.add(portoRegion);

        portoRegion.setDistrict(this.portoDistrict);
        portoRegion.setParishes(parishes);
        portoDistrict.setRegions(regions);


    }
    /*INSERT INTO PROPERTY(PROPERTY_ID, PROPERTY_NAME, PROPERTY_KIND_ID,
                         PROPERTY_TIPOLOGY,PROPERTY_VILLAGE_TIPOLOGY, PROPERTY_TITLE,
                         PROPERTY_DESCRIPTION, PROPERTY_PRICE, PROPERTY_PRICE_NEGOTIABLE,
                         PROPERTY_POSSIBLE_EXCHANGE, PROPERTY_BUSINESS_TYPE, PROPERTY_STATUS,
                         PROPERTY_USEFULL_AREA, PROPERTY_BRUTE_AREA, PROPERTY_YEAR_OF_CONSTRUCTION,
                         PROPERTY_COUNTRY, DISTRICT_ID_FK, REGION_ID_FK, PROPERTY_PARISH, PROPERTY_ENERGY_EFFICIENCY,
                         PROPERTY_IS_HIGHLIGHTED, PROPERTY_LATITUDE, PROPERTY_LONGITUDE)
    VALUES (1000, 'id_name_1000', 1000, 'T4', NULL,'Fantástico apartamento com  vista para o rio Douro',
            'Apartamento localizado no 10º andar com fantásticas vistas sobre o rio Douro, em zona sossegada e com óptimos acessos',
            220.000, 't',  't', 'RENTAL', 'USED', 150, 190, 1910, 'portugal', 13, 11, 'ramalde', 'F', 't', NULL, NULL);*/

    @Test
    public void testPersist(){

        /*test dependencies*/
        Assert.assertNotNull("propertyKind should not be null", this.propertyKind);
        Assert.assertNotNull("portoRegion(region) should not be null", this.portoRegion);
        Assert.assertNotNull("district(District) should not be null", this.portoDistrict);
        Assert.assertNotNull("ramalde(parish) should not be null", this.ramalde);

       /* final Property property = Property.getBuilder()
                .withName(this.PROPERTY_NAME)
                .withKind(this.propertyKind)
                .withTipology(Tipologies.T4)
                .withVillageTipology(null)
                .withTitle(this.PROPERTY_TITLE)
                .withDescription(this.PROPERTY_DESCRIPTION)
                .withPrice(this.PROPERTY_PRICE)
                .isPriceNegotiable(Boolean.TRUE)
                .possibleExchange(Boolean.TRUE)
                .withBusinessType(BusinessType.RENTAL)
                .withStatus(PropertyStatus.USED)
                .withUsefullArea(this.USEFULL_AREA)
                .withBruteArea(this.BRUTE_AREA)
                .withYearOfConstruction(this.YEAR_OF_CONSTRUCTION)
                .withCountry(this.COUNTRY)
                .withDistrict(this.portoDistrict)
                .withRegion(this.porto)
                .withParish(Parishes.RAMALDE.getValue())
                .withEnergyEfficiency(EnergyEfficiency.A)
                .isHighlighted(Boolean.TRUE)
                .withLatitude(this.latitude)
                .withLongitude(this.longitude)
                .build();
*/
    }
}
