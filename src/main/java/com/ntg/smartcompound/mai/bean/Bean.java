package com.ntg.smartcompound.mai.bean;

import com.ntg.smartcompound.mai.databaseSimulator.DatabaseSimulator;
import com.ntg.smartcompound.mai.entity.Department;
import com.ntg.smartcompound.mai.entity.Employee;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * 
 * @author Mai
 */
@ManagedBean(name = "Bean")
@ViewScoped
public class Bean implements Serializable {
	private Employee employee;

	@PostConstruct
	public void init() {
		DatabaseSimulator databaseSimulator = new DatabaseSimulator();
		initEmployee();
		
	}
	public void initEmployee(){
		employee = new Employee();
	}
	
	public Bean() {
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Department> getAllDepartments() {

		return DatabaseSimulator.getDepartments();
	}

	public void read() {
		// System.out.println("department id=  " +selected);
		// System.out.println("int"+Integer.parseInt(selected));
		// department = getDepartment(Integer.parseInt(selected));
		// System.out.println("dept  "+department);
		// employee.setDepartment(department);
		System.out.println(employee);
	}
}
