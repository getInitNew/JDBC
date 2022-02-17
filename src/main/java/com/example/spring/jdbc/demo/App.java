package com.example.spring.jdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/jdbc/demo/config.xml");
    	
    	JdbcTemplate jdbctemp = (JdbcTemplate) context.getBean("jdbcTemplate");
    	
    	String query1 = "insert into empinfo(empid,empname,empcity) values(?,?,?)";
    	
    	int result = jdbctemp.update(query1, 4,"ACP", "Hyderabad");
    	System.out.println("number of records inserted: " +result);

    	

    	
    }
}
