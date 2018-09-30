package by.stepovoy.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

    private static Logger logger = LogManager.getLogger();
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        //The request is about to go out of scope of the Web application.
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        logger.info("The request is about to go out of scope of the Web application " + servletRequest.getRemoteAddr());
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        logger.info("The request is about to come into scope of the Web application. " + servletRequest.getRemoteAddr());
    }
}