package com.npf.listener;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.ext.spring.web.LogbackConfigListener;


public class SpringMVCLogbackConfigListener extends LogbackConfigListener{
	
	private final static Logger LOGGER = LoggerFactory.getLogger(SpringMVCLogbackConfigListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent paramServletContextEvent) {
		super.contextInitialized(paramServletContextEvent);
		LoggerContext localLoggerContext = (LoggerContext)StaticLoggerBinder.getSingleton().getLoggerFactory();
		String smtpHost = localLoggerContext.getProperty("smtpHost");
		LOGGER.info("this smtpHost is {}",smtpHost);
	}

}
