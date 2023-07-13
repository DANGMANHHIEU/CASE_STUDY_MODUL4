package com.example.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/images/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		registry.addResourceHandler("/Frontend/img/**").addResourceLocations("classpath:/static/Frontend/images/");
		registry.addResourceHandler("/Frontend/css/**").addResourceLocations("classpath:/static/Frontend/css/");
		registry.addResourceHandler("/Frontend/js/**").addResourceLocations("classpath:/static/Frontend/js/");
	}
	
	
	
	
}
