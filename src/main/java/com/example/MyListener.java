package com.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	/**
	 * Context 초기화
	 * 실행순서(1)
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Initialized");
		sce.getServletContext().setAttribute("name", "sehui");
	}
	
	/**
	 * Context 종료
	 * 실행순서(8)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed");
	}
}
