package com.npf.listener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringMVCListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		WebApplicationContext rootContext1 = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
		WebApplicationContext rootContext2 = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext(),"org.springframework.web.context.WebApplicationContext.ROOT");
		System.out.println(rootContext1==rootContext2);
	}

}
