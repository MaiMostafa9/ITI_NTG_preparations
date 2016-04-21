package com.ntg.smartcompound.mai.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.providers.jackson.Formatted;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ntg.smartcompound.mai.entity.Department;
import com.ntg.smartcompound.mai.entity.Employee;
import com.ntg.smartcompound.mai.hibernateEntity.User;
import com.ntg.smartcompound.mai.interfaces.Controller;

@Path("/info")
public class EmployeeService {
	
	@GET
    @Path("/employeedetail")
    @Produces("application/json")
    @Formatted
    public Response employeeDetail() {
    	Employee employee = new Employee(1,"maii","mostafa",new Department(1,"it"));
    	User user=new User();
    	user.setFname(employee.getFirstName());
    	user.setLname(employee.getLastName());
    	
    	  BeanFactory factory = getBeanFactory();
    	  Controller controller = (Controller) factory.getBean("controller");
    	  controller.add(user);
    	System.out.println(employee);
    	return Response.ok(employee).build();
    }
	
	  private static ApplicationContext getBeanFactory() {  
	        ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
	        return factory;
	    }
 
}  
