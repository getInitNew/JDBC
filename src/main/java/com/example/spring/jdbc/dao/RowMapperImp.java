package com.example.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.spring.jdbc.entities.EmpInfo;

public class RowMapperImp implements RowMapper<EmpInfo>{

	public EmpInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmpInfo empinfo = new EmpInfo();
		empinfo.setEmpid(rs.getInt(1));
		empinfo.setEmpname(rs.getString(2));
		empinfo.setEmpcity(rs.getString(3));
		return empinfo;
	}

}
