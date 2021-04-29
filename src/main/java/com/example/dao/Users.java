package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

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
public class Users
{
	@Autowired
    private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Transactional
	public List<User> details()
	{
		 String sql = "SELECT * FROM WORKDAY.WORKER_DETAILS_COMM where rownum=1";
		 

		 return template.query(sql, new RowMapper<User>() {
				public User mapRowUser(ResultSet rs, int row) throws SQLException {
					User e = new User();
					e.setEmployee_id(rs.getInt(1));
				/*
				 * e.setFname(rs.getString(2)); e.setLname(rs.getString(3));
				 * e.setDob(rs.getString(4)); e.setPer10(rs.getString(5));
				 * e.setPer12(rs.getString(6)); e.setCourse(rs.getString(7));
				 * e.setCourseper(rs.getString(8)); e.setCollege(rs.getString(9));
				 * e.setEmails(rs.getString(10)); e.setContact(rs.getString(11));
				 * e.setLoginenabled(rs.getBoolean(12)); e.setTeststatus(rs.getBoolean(13));
				 * e.setUsername(rs.getString(14)); e.setPassword(rs.getString(15));
				 * e.setPassing_year(rs.getString(16)); e.setGender(rs.getString(17));
				 * e.setRole(rs.getString(18));
				 */

					return e;
				}

				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}
			});

	}
}