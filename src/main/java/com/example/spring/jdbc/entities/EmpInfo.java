package com.example.spring.jdbc.entities;

public class EmpInfo {
	private int empid;
	private String empname;
	private String empcity;
	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpInfo(int empid, String empname, String empcity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	@Override
	public String toString() {
		return "EmpInfo [empid=" + empid + ", empname=" + empname + ", empcity=" + empcity + "]";
	}
	
	
}
