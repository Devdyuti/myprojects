package org.tutorial.spring.solr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class UserConfig extends WebMvcConfigurationSupport{
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver jspViewResolver=new InternalResourceViewResolver();
		jspViewResolver.setPrefix("/WEB-INF/view/");
		jspViewResolver.setSuffix(".jsp");
		jspViewResolver.setViewClass(JstlView.class);
		return jspViewResolver;
	}
	
	@Bean
	public RequestMappingHandlerMapping requestHandlerMapping() {
		RequestMappingHandlerMapping handlerMapping=new RequestMappingHandlerMapping();
		return handlerMapping;
	}
	@Bean
	public RequestMappingHandlerAdapter requestHandlerAdaptor() {
		RequestMappingHandlerAdapter handlerAdaptor=new RequestMappingHandlerAdapter();
		return handlerAdaptor;
	}
	
	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(jspViewResolver());
	}
}
