package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Arthur on 23/05/14.
 */
public class ContextLoadListener implements ServletContextListener {
    /**
     * * Notification that the web application initialization
     * * process is starting.
     * * All ServletContextListeners are notified of context
     * * initialization before any filter or servlet in the web
     * * application is initialized.
     *
     * @param sce
     */

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ContextLoadListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        slf4jLogger.info("==void contextInitialized(ServletContextEvent sce)==");
        IndexUtils iu = new IndexUtils();
        iu.reindex();
    }

    /**
     * * Notification that the servlet context is about to be shut down.
     * * All servlets and filters have been destroy()ed before any
     * * ServletContextListeners are notified of context
     * * destruction.
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
