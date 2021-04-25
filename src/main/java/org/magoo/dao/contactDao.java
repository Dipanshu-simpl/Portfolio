package org.magoo.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="{org.magoo}")
public class contactDao {

	@Bean("ds")
	public DriverManagerDataSource getSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		// Oracle Db details.
		/*dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@DESKTOP-IV5I15C:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("Rohtak123#");*/
		
		// MySql Db details(Localhost)
		/*dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/portfolio");
		dataSource.setUsername("root");
		dataSource.setPassword("springstudent");*/
		
		// MySql AWS Db
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://springonaws-db.cpbpdwb1odpe.ap-south-1.rds.amazonaws.com:3306/Portfolio");
		dataSource.setUsername("springstudent");
		dataSource.setPassword("springstudent");
		
		
		return dataSource;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getSource());
		return jdbcTemplate;
	}
	
}
