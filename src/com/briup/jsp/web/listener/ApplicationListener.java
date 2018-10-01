package com.briup.jsp.web.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 * 
 */
@WebListener
public class ApplicationListener implements ServletContextListener{

    /**
     * Default constructor. 
     */
    public ApplicationListener() {
    		System.out.println(".....ApplicationListener()......");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent paramServletContextEvent)  { 
    		System.out.println("....application...destoryed..");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent paramServletContextEvent)  { 
    		System.out.println("..application..init.....");
    		//.. //..//..
    }
	
}
