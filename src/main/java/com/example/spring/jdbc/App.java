package com.example.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

import com.example.spring.jdbc.dao.EmpDao;
import com.example.spring.jdbc.entities.EmpInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	Scanner scn = new Scanner(System.in);
    	    	
    	String str = "Please Enter Your Choice -" + '\n' + "1. Insert Data " + '\n' + "2. Update Data " + '\n' + "3. Delete Data " + '\n' + "4. Display Info By ID " + '\n' + "5. Display the Table" + '\n'+ "6. Exit";
    	
    	int i;
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/jdbc/config.xml");

    	EmpDao empdao = (EmpDao) context.getBean("empDao");
    	
    	EmpInfo emp= new EmpInfo();
    	do{
    	//	if(i<6 && i>0) {
    		System.out.println(str);
    		i  = scn.nextInt();
    		
	        switch(i){
		        case 1:
		        	System.out.println("Enter the ID of the Employee: ");
		        	int id = scn.nextInt();
		        	System.out.println("Enter the Name of the Employee: ");
		        	String name = scn.next();
		        	System.out.println("Enter the City of the Employee: ");
		        	String city = scn.next();
		        	emp.setEmpid(id); emp.setEmpname(name); emp.setEmpcity(city);
		        	
		  		  	int result = empdao.insert(emp);
		  		  	System.out.println("Employee with id- "+ id + " has been added and number of rows affected- " + result);
		  		  	
		            break;
		            
		        case 2:
		        	System.out.println("Enter the Name of the Employee: ");
		        	String name1 = scn.next();
		        	System.out.println("Enter the City of the Employee: ");
		        	String city1 = scn.next();
		        	System.out.println("Enter the ID of the Employee: ");
		        	int id1 = scn.nextInt();
		        	emp.setEmpname(name1); emp.setEmpcity(city1); emp.setEmpid(id1);
				    
		  		  	int result1 = empdao.update(emp);
		  		  	System.out.println("Employee with id- "+ id1 + " has been updated and number of rows affected- " + result1);
		  		  	
		            break;
		            
		        case 3:
		        	System.out.println("Enter the ID of the Employee: ");
		        	int id2 = scn.nextInt();
		        	
		            int result2 = empdao.delete(id2);
		            System.out.println("Employee with id- "+ id2 + " has been deleted and number of rows affected- " + result2);
		        	
		            break;
		            
		        case 4:
		        	System.out.println("Enter the ID of the Employee: ");
		            int id3 = scn.nextInt();
		            EmpInfo result3 = empdao.select(id3);
		            System.out.println(result3);
		            break;
		        
		        case 5:
		            List<EmpInfo> result4 = empdao.display();
		            for(EmpInfo e: result4) {
		            	System.out.println(e);
		            }
		            
		            break;    
		        
		        case 6:
		        	System.out.println("Exiting");
		        	System.exit(0);
	        }
    //	}
		/*
		 * else { System.out.println("Invalid Selection" + '\n' + "Exiting"); }
		 */
    	}while(i!=6);
    	//JdbcTemplate jdbctemp = (JdbcTemplate) context.getBean("jdbcTemplate");
    	
       	//String query = "insert into empinfo(empid,empname,empcity) values(?,?,?)";
    	
    	//int result = jdbctemp.update(query, 2,"Daya", "Pune");
    	//System.out.println("number of records inserted: " +result);
    	
    }
}
