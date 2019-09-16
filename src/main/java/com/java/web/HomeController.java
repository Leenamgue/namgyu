package com.java.web;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
	
	@Autowired
	SqlSession sql;
	
//	ListBean[] list = new ListBean[8];
//	
//	public HomeController() {
//		list[0] = new ListBean(1, "어렵 :)" , "이남규");
//		list[1] = new ListBean(2, "후 :)", "히");
		
//	}
	
	public void listBean() {
		
	}
	
	@RequestMapping("/")
	public String notice(Model m) {
		List<ListBean> list = sql.selectList("test.select");
		m.addAttribute("list", list);
		
		return "main";
	}
	
	@RequestMapping(value = "/tr")
	public String create(ListBean b) {
	
		return "create";
		
	}
	@RequestMapping(value = "/create")
	public String insert(HttpServletRequest req,ListBean b) {
		int create =  sql.insert("test.insert", b);
		
		String title = b.getTitle();
		String name = b.getName();
		
		System.out.println(title);
		System.out.println(name);
//		b.setTitle(title);
//		b.setName(name);
		title = b.getTitle();
		System.out.println(title);
		System.out.println(b.toString());
//		System.out.println(sql.insert("test.insert", b));
		return "redirect:/";
		
	}
	
	@RequestMapping(value = "/update")
	public String update(ListBean b) {
	
		return "redirect:/";
		
	}
	
	@RequestMapping(value = "/delete")
	public String delete(ListBean b) {
	
		return "redirect:/";
		
	}
	
	
	
	
//	@RequestMapping(value = "/create")
//	public String insert(HttpServletRequest req,ListBean b) {
//		HashMap<String, Object> data = new HashMap<String, Object>();
//		
//		String title = req.getParameter("title");
//		String name = req.getParameter("name");
//	
//		data.put("title", title);
//		data.put("name", name);
//		System.out.println(title);
//		System.out.println(name);
//		
//		System.out.println(data.put("title", title));
//		System.out.println(data.put("name", name));
//	return "redirect:/";
//	}	
//	
//	 @RequestMapping(value="/create",method=RequestMethod.GET)
//    public  String createGET(ListBean b, Model m) throws Exception{
//        System.out.println(" /create 입니다. GET방식");
//        
//        return "create";
//        
//    }
//    
//    @RequestMapping(value = "/insert",method=RequestMethod.POST )
//    public String createPOST(ListBean b, Model m) throws Exception{
//        System.out.println("/create POST방식 입니다.");
//        System.out.println(b.toString());
//        
//        int create = sql.insert("test.insert", b);
//        m.addAttribute("result", "성공");
//        
//        return "create";
//    }
    
	
	
	
	
}
