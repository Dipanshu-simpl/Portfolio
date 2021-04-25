package org.magoo.dao;

import org.magoo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class contactInsert {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int insertUser(Contact user)
	{
		String query="insert into user_login (name,email,contact,message) values (?,?,?,?)";
		int result= this.jdbcTemplate.update(query,user.getName(),user.getEmail(),user.getContactNo(),user.getMessage());
		return result;
	}

}
