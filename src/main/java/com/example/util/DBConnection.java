package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBConnection {
//	@Autowired
//	private static JdbcTemplate template;
  public static JdbcTemplate getConnection()
  {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	return (JdbcTemplate) context.getBean(JdbcTemplate.class);
//	  return template;
  }

}
