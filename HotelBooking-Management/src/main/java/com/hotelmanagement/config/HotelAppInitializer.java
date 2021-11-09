package com.hotelmanagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HotelAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		
		Class[] configFiles = {HotelAppConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		
		String[] mappings = {"/"};
		
		return mappings;
	}

}
