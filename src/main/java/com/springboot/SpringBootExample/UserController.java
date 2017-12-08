package com.springboot.SpringBootExample;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/welcome")
	public String getWelcomeMessage(){
		return "welcome";
	}

	@RequestMapping("/user")
	public String getUserInfo(Map<String, Object> model){
		 model.put("message", "You are in User page !!");
	     return "user";
	}
}
