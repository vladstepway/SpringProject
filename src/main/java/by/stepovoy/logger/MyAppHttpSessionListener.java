package by.stepovoy.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyAppHttpSessionListener implements HttpSessionListener {
    private Logger logger = LogManager.getLogger(this.getClass().getName());


    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.info("HTTP session has just been activated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        logger.info("HTTP session is about to be passivated");
    }
}
