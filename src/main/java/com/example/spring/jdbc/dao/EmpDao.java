package com.example.spring.jdbc.dao;

import java.util.List;

import com.example.spring.jdbc.entities.EmpInfo;

public interface EmpDao {
	public int insert(EmpInfo empinfo);
	public int update(EmpInfo empinfo);
	public int delete(int empid);
	public EmpInfo select(int empid);
	public List<EmpInfo> display();
	
}
