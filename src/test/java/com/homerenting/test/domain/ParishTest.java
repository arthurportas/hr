package com.homerenting.test.domain;

import com.google.common.collect.ImmutableList;
import com.homerenting.domain.Parish;
import com.homerenting.domain.Region;
import groovy.lang.Immutable;
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

import static com.homerenting.domain.modules.header.search.Parishes.RAMALDE;
import static junit.framework.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml",
        "classpath:/META-INF/spring/applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class ParishTest extends TestStub implements ParishMethods{

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ParishTest.class);

    private Parish ramalde;

    @Qualifier("sharedEntityManager")
    @Autowired
    private EntityManager em;

    private final String PARISH_NAME = "Ramalde";
    private final String UPDATED_PARISH_NAME = "Aldoar";

    @Before
    public void init() throws Exception {
        /*Parish*/
       ramalde = new Parish();
    }

    @Override
    @Test
    public void create() {
        try{
            this.ramalde.setParishName(RAMALDE.getValue());//name is not unique
            this.ramalde.setRegion(null);
            em.persist(this.ramalde);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
    }

    @Override
    @Test
    public void read() {
        create();
        final Parish parish = em.find(Parish.class, this.ramalde.getParishId());
        assertNotNull("ramalde(parish) should not be null", parish);
        assertEquals("name should be->" + PARISH_NAME, PARISH_NAME, parish.getParishName());
        return;
    }

    @Override
    @Test
    public void update() {
        create();
        final Parish parish = em.find(Parish.class, this.ramalde.getParishId());
        assertNotNull("ramalde(parish) should not be null", parish);
        parish.setParishName(UPDATED_PARISH_NAME);
        em.merge(parish);
        assertEquals("name should be" + UPDATED_PARISH_NAME, UPDATED_PARISH_NAME, parish.getParishName());
        return;
    }

    @Override
    @Test
    public void delete() {
        create();
        final Parish parish = em.find(Parish.class, this.ramalde.getParishId());
        assertNotNull("ramalde(parish) should not be null", parish);
        em.remove(parish);
        assertNull("ramalde(parish) should be null", em.find(Parish.class, parish.getParishId()));
        return;
    }

    @Override
    @Test
    public void createWithBuilder() {
        try{
            this.ramalde =  new Parish().getBuilder()
                    .withName(RAMALDE.getValue())
                    .withRegion(null)
                    .build();
            em.persist(this.ramalde);
        }catch (Exception e) {
            slf4jLogger.debug(e.getMessage());
            Assert.fail("Error persisting entity");
        }
        return;
    }

    @Override
    @Test
    public void readFromDataset() {
        List<Parish> parishes = (List<Parish>) em.createNamedQuery(Parish.FIND_ALL).getResultList();
        assertNotNull("parishes list should not be empty", parishes);
        assertEquals("should exist 418 parishes on dataset", parishes.size(), 418);
        return;
    }

    @Override
    @Test
    public void testParishWithRegionAssociation() {


    }
}
