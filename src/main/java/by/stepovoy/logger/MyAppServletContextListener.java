package by.stepovoy.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//read about it
//https://docs.oracle.com/javaee/6/api/javax/servlet/ServletContextListener.html

public class MyAppServletContextListener
        implements ServletContextListener {

    private static Logger logger = LogManager.getLogger();

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

//this method Receives notification that the ServletContext is about to be shut down.
        logger.info("ServletContextListener destroyed");
    }

    //Run this before web application is started
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        logger.info("ServletContextListener started");

    }
}