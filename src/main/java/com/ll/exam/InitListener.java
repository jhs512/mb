package com.ll.exam;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AppEnvContext.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
