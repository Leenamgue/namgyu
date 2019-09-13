package com.java.web;



public class ListBean {
	
//	`n_no` INT(11) NOT NULL AUTO_INCREMENT,
//	`u_no` INT(11) NOT NULL,
//	`title` VARCHAR(255) NOT NULL,
//	`name` VARCHAR(50) NOT NULL,
//	`deYln` CHAR(1) NOT NULL DEFAULT 'N',

	private int n_no;	
	private String title;
	private String name;
	
	public ListBean() {
		
	}
		
	
	public ListBean(int n_no, String title,String name) {
		this.n_no = n_no;
		this.title = title;
		this.name = name;
	}
	
	public int getN_no() {
		return n_no;
	}
	public void setN_no(int n_no) {
		this.n_no = n_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ListBean [n_no=" + n_no + ", title=" + title + ", name=" + name + "]";
	}
 }
