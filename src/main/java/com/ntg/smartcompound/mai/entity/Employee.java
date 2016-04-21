package  com.ntg.smartcompound.mai.entity;

import java.io.Serializable;

public class Employee implements Serializable{

	private Integer id;
	private String firstName;
	private String lastName;
	private Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	 public Employee(Integer id, String firstName, String lastName,Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + '}';
    }
         
    


	
	  
		
	        
}
