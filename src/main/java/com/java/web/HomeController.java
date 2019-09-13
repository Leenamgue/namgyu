package com.java.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
	
	
	@Autowired
	SqlSession sql;
	
	ListBean[] list = new ListBean[8];
	
	public HomeController() {
		list[0] = new ListBean(1, "어렵 :)" , "이남규");
		list[1] = new ListBean(2, "후 :)", "히");
		
	}
	
	public void listBean() {
		
	}
	
	@RequestMapping("/")
	public String notice(Model m) {
		List<ListBean> list = sql.selectList("test.select");
		m.addAttribute("list", list);
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
