package com.springjdbc.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.StudentDaoImpl;

@SuppressWarnings("unused")
@Configuration
//@ComponentScan(basePackages = "com.springjdbc.dao")
public class JavaConfig {

	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_db?autoReconnect=true&amp;useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("root");
		
		return datasource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
	/**
	 * we are using @Bean so no need of @Component and @ComponentScan
	 * @return
	 */
	@Bean(name = {"studentDaoImpl"})
	public StudentDaoImpl getStudentDaoImpl() {
		
		return new StudentDaoImpl();
		
	}
	
}
