package com.homerenting.test.domain;

import com.homerenting.domain.District;
import com.homerenting.domain.Parish;
import com.homerenting.domain.Region;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.homerenting.domain.modules.header.search.Regions.PORTO;
import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml",
        "classpath:/META-INF/spring/applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class RegionTest extends TestStub implements RegionMethods{

    private static final Logger slf4jLogger = LoggerFactory.getLogger(RegionTest.class);

    private Region porto;

    @Qualifier("sharedEntityManager")
    @Autowired
    private EntityManager em;

    private final String REGION_NAME = "Porto";
    private final String UPDATED_REGION_NAME = "Aveiro";

    @Before
    public void init() throws Exception {
        /*Parish*/
       porto = new Region();
    }

    @Override
    @Test
    public void create() {
        try{
            this.porto.setRegionName(REGION_NAME);
            this.porto.setParishes(null);
            this.porto.setProperties(null);
            this.porto.setDistrict(null);
            em.persist(this.porto);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
    }

    @Override
    @Test
    public void read() {
        create();
        final Region region = em.find(Region.class, this.porto.getRegionId());
        assertNotNull("porto(region) should not be null", region);
        assertEquals("name should be->" + REGION_NAME, REGION_NAME, region.getRegionName());
        return;
    }

    @Override
    @Test
    public void update() {
        create();
        final Region region = em.find(Region.class, this.porto.getRegionId());
        assertNotNull("porto(region) should not be null", region);
        region.setRegionName(UPDATED_REGION_NAME);
        em.merge(region);
        assertEquals("name should be" + UPDATED_REGION_NAME, UPDATED_REGION_NAME, region.getRegionName());
        return;
    }

    @Override
    @Test
    public void delete() {
        create();
        final Region region = em.find(Region.class, this.porto.getRegionId());
        assertNotNull("porto(region) should not be null", region);
        em.remove(region);
        assertNull("porto(regin) should be null", em.find(Region.class, region.getRegionId()));
        return;
    }

    @Override
    @Test
    public void createWithBuilder() {
        try{
            this.porto =  new Region().getBuilder()
                    .withName(REGION_NAME)
                    .withDistrict(null)
                    .withParishes(null)
                    .withProperties(null)
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
        List<Region> regions = (List<Region>) em.createNamedQuery(Region.FIND_ALL).getResultList();
        assertNotNull("regions list should not be empty", regions);
        assertEquals("should exist 275 regions on dataset", regions.size(), 418);
        return;
    }

    @Override
    public void testRegionWithParishesAssociation() {

    }

    @Override
    public void testRegionWithDistrictAssociation() {

    }

    @Override
    public void testRegionWithPropertiesAssociation() {

    }

    @Override
    @Test
    public void testRegionWithParishesAssociationFromDataset() {
        final District district = getDistrict();
        assertNotNull(district);
        try{
            this.porto =  new Region().getBuilder()
                    .withName(REGION_NAME)
                    .withDistrict(getDistrict())
                    .withParishes(getParishesCollection(district))
                    .withProperties(null)
                    .build();
            em.persist(this.porto);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
        return;
    }

    @Override
    public void testRegionWithDistrictAssociationFromDataset() {

    }

    @Override
    public void testRegionWithPropertiesAssociationFromDataset() {

    }

    private Set<Parish> getParishesCollection(District district){
        return null;//TODO:
    }

    private District getDistrict(){
        final District district = (District) em.createNamedQuery(District.FIND_BY_NAME)
                .setParameter("districtName", "Porto")
                .getSingleResult();
        return district;
    }
}
