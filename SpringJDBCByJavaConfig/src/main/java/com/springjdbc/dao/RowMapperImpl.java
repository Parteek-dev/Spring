package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu = new Student();
		
		stu.setId(rs.getInt(1));
		stu.setName(rs.getString(2));
		stu.setAddress(rs.getString(3));

		System.out.println("Nbr of rows returned: 1");
		return stu;
	}

}
