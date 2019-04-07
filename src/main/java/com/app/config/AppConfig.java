package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
public class AppConfig {
	@Bean
	 public InternalResourceViewResolver irs() {
		 InternalResourceViewResolver ii=new InternalResourceViewResolver();
		 ii.setPrefix("/WEB-INF/views/");
		 ii.setSuffix(".jsp");
		return ii;
	 }
}
