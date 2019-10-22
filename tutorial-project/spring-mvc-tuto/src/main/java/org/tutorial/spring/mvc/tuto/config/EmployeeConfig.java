package org.tutorial.spring.mvc.tuto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class EmployeeConfig extends WebMvcConfigurationSupport{

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver jspViewResolver=new InternalResourceViewResolver();
		jspViewResolver.setPrefix("/WEB-INF/view/");
		jspViewResolver.setSuffix(".jsp");
		jspViewResolver.setViewClass(JstlView.class);
		return jspViewResolver;
	}
	
	@Bean
	public DefaultAnnotationHandlerMapping defaultHandlerMapping() {
		DefaultAnnotationHandlerMapping handler=new DefaultAnnotationHandlerMapping();
		return handler;
	}
	
	@Bean
	public AnnotationMethodHandlerAdapter annotationHandlerMapping() {
		AnnotationMethodHandlerAdapter handler=new AnnotationMethodHandlerAdapter();
		return handler;
	}
	
	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(jspViewResolver());
	}
	
}
