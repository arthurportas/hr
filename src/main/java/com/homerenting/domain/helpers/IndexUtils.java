package com.homerenting.domain.helpers;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by Arthur on 23/05/14.
 */
@Repository(IndexUtils.COMPONENT_NAME)
public class IndexUtils {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(IndexUtils.class);

    public static final String COMPONENT_NAME = "indexUtils";

    /*@Qualifier("entityManager")
    @Autowired
    private EntityManager em;*/

    public void reindex() {
        slf4jLogger.info("==void reindex()==");
       /* FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(em);
        try {
            fullTextEntityManager.createIndexer().startAndWait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
