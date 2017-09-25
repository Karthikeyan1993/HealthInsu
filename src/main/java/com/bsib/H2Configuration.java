package com.bsib;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2Configuration {

	@Bean
	ServletRegistrationBean h2Registration() {
		ServletRegistrationBean h2Registration = new ServletRegistrationBean(new WebServlet());
		h2Registration.addUrlMappings("/console/*");
		return h2Registration;
	}

}
