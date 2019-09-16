package com.java.web;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.web.daointerface;

@Repository
public class dao implements daointerface {
	
	@Autowired
	SqlSession session;

	@Override
	public List<HashMap<String, Object>> getData() {
		System.out.println(session.selectList("test.select"));
		return session.selectList("test.select");
	}

	@Override
	public void insert(HashMap<String, Object> data) {
		session.insert("test.insert", data);
	}

	@Override
	public int update(HashMap<String, Object> data) {
		return session.update("test.update", data);
	}
	
	@Override
	public int delete(HashMap<String, Object> data) {
		return session.update("test.delete", data);
	}

	@Override
	public List<HashMap<String, Object>> userCheck(HashMap<String, Object> params) {
//		session.selectOne("sql.userCheck");
		List<HashMap<String, Object>> check = session.selectList("test.userCheck", params);
		HashMap<String, Object> result = new HashMap<String, Object>();
		System.out.println(check.size());
		return check;
	
	}
}
