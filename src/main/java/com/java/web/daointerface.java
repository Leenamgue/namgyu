package com.java.web;

import java.util.HashMap;
import java.util.List;

public interface daointerface {
	public List<HashMap<String, Object>> getData();
	public void insert(HashMap<String, Object> data);
	public int update(HashMap<String, Object> data);
	public int delete(HashMap<String, Object> data);
	public List<HashMap<String, Object>> userCheck(HashMap<String, Object> params);
}
