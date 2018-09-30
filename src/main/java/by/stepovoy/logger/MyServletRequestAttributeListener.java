package by.stepovoy.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener
        implements ServletRequestAttributeListener {
    private static Logger logger = LogManager.getLogger();
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("new  attribute is added to the servlet request");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("attribute is removed from the servlet request");

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("attribute gets replaced on the servlet request");

    }
}
