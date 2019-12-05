package org.tutorial.spring.solr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class UserConfig extends WebMvcConfigurationSupport{// 
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver jspViewResolver=new InternalResourceViewResolver();
		jspViewResolver.setPrefix("/WEB-INF/view/");
		jspViewResolver.setSuffix(".jsp");
		jspViewResolver.setViewClass(JstlView.class);
		return jspViewResolver;
	}
	
    @Bean
    public View jsonTemplate() {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
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
