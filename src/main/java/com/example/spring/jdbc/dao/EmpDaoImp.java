package com.example.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.spring.jdbc.entities.EmpInfo;

public class EmpDaoImp implements EmpDao{

	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
			//insert query
	
	public int insert(EmpInfo empinfo) {
		// TODO Auto-generated method stub
    	String query = "insert into empinfo(empid,empname,empcity) values(?,?,?)";
    	int res = this.jdbctemplate.update(query, empinfo.getEmpid(),empinfo.getEmpname(),empinfo.getEmpcity());

		return res;
	}
			//update query
	
	public int update(EmpInfo empinfo) {
		// TODO Auto-generated method stub
    	String query = "update empinfo set empname=? , empcity= ? where empid= ?";
    	int ans = this.jdbctemplate.update(query,empinfo.getEmpname(),empinfo.getEmpcity(),empinfo.getEmpid());

		return ans;
	}
			//delete query
	
	public int delete(int empid) {
		// TODO Auto-generated method stub
		String query = "delete from empinfo where empid= ?";
    	int soln = this.jdbctemplate.update(query,empid);

		return soln;
	}

			//select single object query based on a parameter
	
	public EmpInfo select(int empid) {
		// TODO Auto-generated method stub
		String query = "select * from empinfo where empid= ?";
		RowMapper<EmpInfo> rowMapper = new RowMapperImp();
		EmpInfo empinfo = this.jdbctemplate.queryForObject(query, rowMapper, empid);
		return empinfo;
	}
	
			//select multiple objects query
	
	public List<EmpInfo> display() {
		// TODO Auto-generated method stub
		String query = "select * from empinfo";
		List<EmpInfo> disp = this.jdbctemplate.query(query, new RowMapperImp());
		return disp;
	}

}
