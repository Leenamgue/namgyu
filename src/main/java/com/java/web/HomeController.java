package com.java.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
	
	
	@Autowired
	dao d;
	
	ListBean[] list = new ListBean[8];
	
	public HomeController() {
		list[0] = new ListBean(1, "어렵 :)" , "이남규");
		list[1] = new ListBean(2, "후 :)", "히");
		
	}
	
	public void listBean() {
		
	}
	
	@RequestMapping("/")
	public String notice(HttpServletRequest req) {
		req.setAttribute("list", list);
		d.select();
		return "main";
	}
	
	@RequestMapping("/create")
	public String notice1() {
		
		return "create";
	}
	
	@RequestMapping("/home2")
	public String notice2() {
		
		return "home2";
	}
	
	
	
	
	
}
