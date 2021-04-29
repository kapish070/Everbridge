package com.example.Everbridge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.modal.User;

@SpringBootApplication
@ComponentScan({ "com.example.controller, com.example.modal,modal,controller,com.example.Everbridge,com.example.dao" })

public class EverbridgeApplication  {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(EverbridgeApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { String sql =
	 * "SELECT * FROM WORKDAY.WORKER_DETAILS_COMM";
	 * 
	 * List<User> students = jdbcTemplate.query(sql,
	 * BeanPropertyRowMapper.newInstance(User.class));
	 * 
	 * students.forEach(System.out :: println); }
	 */
}
