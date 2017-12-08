package com.springboot.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HotelController {
	@RequestMapping("/hotelSearch")
	public String getHotelName(){
		return "hotelSearch";
		
	}
	
	@RequestMapping("/hotelList")
	public String fetchHotelDetails(@RequestParam("hotelName") String hotelName,Map<String,String> hotelInfoMap){
		if(hotelName.equalsIgnoreCase("Holiday")){
			hotelInfoMap.put("hotelName", "Holiday INN oxford, London");
			hotelInfoMap.put("roomType","Double deluxe");
			hotelInfoMap.put("price","110.00");
			hotelInfoMap.put("currency","GBP");
		}
		return "hotelSearch";
	}

}
