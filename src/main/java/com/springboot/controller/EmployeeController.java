package com.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employee-service")
	public  Employee getEmployeeDetails(){
		return new Employee(1001,"ABC","Kuoni");
	}
	
	@RequestMapping("/list")
	public  List getEmployeeIDList(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1001);
		list.add(1002);
		list.add(1003);
		return list;
	}
	@RequestMapping("/employee-map")
	public  Map getEmployeeIDMap(){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("empId",1001);
		map.put("code",1001);
		return map;
	}
	

}
