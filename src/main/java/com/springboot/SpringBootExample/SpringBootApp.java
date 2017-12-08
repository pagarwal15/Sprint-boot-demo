/**
 * 
 */
package com.springboot.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author prity
 *
 */


@SpringBootApplication(scanBasePackages="com.springboot")
public class SpringBootApp {
	
	public static void main(String[] args){
		SpringApplication.run(SpringBootApp.class, args);
		
	}
	@Bean
	public ViewResolver getViewresolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

}
