package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	JdbcTemplate jdbcTemplate;
	
	private  String insertQry  = "insert into student values(?,?,?)";
	private  String updateQry  = "update student set name =?,city=? where id=?";
	private  String deleteQry  = "delete from student where id=?";
	private  String selectQry  = "select * from student where id=?";
	private  String selectAllQry  = "select * from student";
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {

	}

	public int insert(Student student) {

		int result = jdbcTemplate.update(insertQry,student.getId(),student.getName(),student.getAddress());

		return result;
	}

	public int update(Student student) {
		int result = jdbcTemplate.update(updateQry,student.getName(),student.getAddress(),student.getId());

		return result;
	}

	public int delete(int studentId) {
		int result = jdbcTemplate.update(deleteQry,studentId);

		return result;
	}

	public Student selectOne(int studentId) {
		
		RowMapperImpl rowMapper = new RowMapperImpl();
		
		Student s= jdbcTemplate.queryForObject(selectQry, rowMapper, studentId);
		
		return s;
	}

	public List<Student> getAll() {
		//I've used Anonymous class and we can use above approach also for RowMapperImpl
		ArrayList<Student> listOfStudents= (ArrayList<Student>) jdbcTemplate.query(selectAllQry, new RowMapper<Student>() {
			//Anonymous class implementation
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setAddress(rs.getString(3));

				return stu;
			}
			
		});
		
		return listOfStudents;
	}

}