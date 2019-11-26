package org.tutorial.spring.mvc.tuto.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * This class being used to register the DelegatingFilterProxy to use the SpringSecurityFilterChain.
 * Its avoid writing the Filter Configuration in web.xml file
 * 
 * ex:
 * 
 * 	<!-- Enables Spring Security -->
    <filter>
        <filter-name>springSecurityFilterChain</filter-name>
        <filter-class>
            org.springframework.web.filter.DelegatingFilterProxy
        </filter-class>
    </filter>
    <filter-mapping>
        <filter-name>springSecurityFilterChain</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
*/
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer{//{ 

	public SpringSecurityInitializer() {
		super(LoginSecurityConfig.class);
	}
	
}
