/**
 * 
 */
package com.springboot.SpringBootExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paga17
 *
 */
@RestController
public class HelloWorldController {
	
@RequestMapping("/")
	String home(){
		return "Hello World  using Spring Boot";
	
	}

}
