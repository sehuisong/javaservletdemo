package com.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	/**
	 * Filter 초기화
	 * 실행순서(2)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter init");
	}
	
	/**
	 * Filter 호출
	 * 실행순서(4)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter");
		chain.doFilter(request, response);
	}
	
	/**
	 * Filter 종료
	 * 실행순서(7)
	 */
	@Override
	public void destroy() {
		System.out.println("Filter destroy");
	}

}
