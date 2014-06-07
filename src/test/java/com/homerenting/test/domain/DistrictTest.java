package com.homerenting.test.domain;

import com.homerenting.domain.District;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

import static com.homerenting.domain.modules.header.search.Districts.PORTO;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml",
        "classpath:/META-INF/spring/applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class DistrictTest extends TestStub implements DistricMethods{

    private static final Logger slf4jLogger = LoggerFactory.getLogger(DistrictTest.class);

    private District porto;

    @Qualifier("sharedEntityManager")
    @Autowired
    private EntityManager em;

    private final String DISTRICT_NAME = "TestPorto";
    private final String UPDATED_DISTRICT_NAME = "TestBraga";

    @Before
    public void init() throws Exception {
        /*District*/
        porto = new District();
    }

    @Override
    @Test
    public void create() {
        try{
            this.porto.setDistrictName(DISTRICT_NAME);
            this.porto.setRegions(null);
            this.porto.setProperties(null);
            em.persist(this.porto);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
    }

    @Override
    public void read() {
        create();
        final District district = em.find(District.class, this.porto.getDistrictId());
        assertNotNull("porto(district) should not be null", district);
        assertEquals("name should be->" + DISTRICT_NAME, DISTRICT_NAME, district.getDistrictName());
        return;
    }

    @Override
    public void update() {
        create();
        final District district = em.find(District.class, this.porto.getDistrictId());
        assertNotNull("porto(district) should not be null", district);
        district.setDistrictName(UPDATED_DISTRICT_NAME);
        em.merge(district);
        assertEquals("name should be" + UPDATED_DISTRICT_NAME, UPDATED_DISTRICT_NAME, district.getDistrictName());
        return;
    }

    @Override
    @Test
    public void delete() {
        create();
        final District district = em.find(District.class, this.porto.getDistrictId());
        assertNotNull("porto(district) should not be null", district);
        em.remove(district);
        assertNull("porto(district) should be null", em.find(District.class, district.getDistrictId()));
        return;
    }

    @Override
    @Test
    public void createWithBuilder() {
        try{
            this.porto =  new District().getBuilder()
                    .withName(DISTRICT_NAME)
                    .withProperties(null)
                    .withRegions(null)
                    .build();
            em.persist(this.porto);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
        return;

    }

    @Override
    @Test
    public void readFromDataset() {
        List<District> districts = (List<District>) em.createNamedQuery(District.FIND_ALL).getResultList();
        assertNotNull("districts list should not be empty", districts);
        assertEquals("should exist 418 parishes on dataset", districts.size(), 29);
        return;

    }

    @Override
    public void testDistricWithRegionsAssociation() {

    }

    @Override
    public void testDistricWithPropertiesAssociation() {

    }
}
