package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.example.modal.User;

@ComponentScan({ "com.example.controller, com.example.modal,modal,controller,com.example.Everbridge,com.example.dao" })

@Component
public class Users {
	

	@Autowired
	private SessionFactory sessionfactory;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<User> details()
	{
	          String sql ="SELECT * FROM WORKDAY.WORKER_DETAILS_COMM where rownum=1";
			  
			  List<User> students = jdbcTemplate.query(sql,
			  BeanPropertyRowMapper.newInstance(User.class));
			  
			
			  return students;
	}
}