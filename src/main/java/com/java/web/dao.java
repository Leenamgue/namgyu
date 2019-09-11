package com.java.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class dao {
	
	@Autowired
	SqlSession sqlSession;
	
	public void select() {
		
		ListBean lb = sqlSession.selectOne("test.select");
		String name = lb.getName();
		int no = lb.getN_no();
		String ti =lb.getTitle();
		System.out.println(name);
		
		
	}
	

}
