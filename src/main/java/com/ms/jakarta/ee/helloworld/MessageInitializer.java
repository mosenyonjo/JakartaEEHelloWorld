package com.ms.jakarta.ee.helloworld;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebListener
public class MessageInitializer implements ServletContextListener {
    private String message;

    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        String configFile = context.getInitParameter("configFile");
        try (InputStream is = context.getResourceAsStream(configFile)) {
            Properties props = new Properties();
            props.load(is);
            message = props.getProperty("message");
        } catch (IOException e) {
            throw new RuntimeException("Error loading configuration file", e);
        }
    }

    public void contextDestroyed(ServletContextEvent event) {
        // Do nothing
    }

    public String getMessage() {
        return message;
    }
}