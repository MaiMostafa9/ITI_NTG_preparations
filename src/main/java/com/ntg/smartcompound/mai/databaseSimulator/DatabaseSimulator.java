package  com.ntg.smartcompound.mai.databaseSimulator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ntg.smartcompound.mai.entity.Department;
import com.ntg.smartcompound.mai.entity.Employee;


public class DatabaseSimulator implements Serializable {

    static List<Department> departments = new ArrayList<Department>();
  

    public static List<Department> getDepartments() {
        return departments;
    }

    public static void setDepartments(List<Department> departments) {
        DatabaseSimulator.departments = departments;
    }

    static {

        departments.add(new Department(1, "IT"));
        departments.add(new Department(2, "Marketing"));
        departments.add(new Department(3, "HR"));
    }

    public List<Department> getAllDepartments() {

        return departments;
    }

    public Department getDepartment(Integer id) {
        if (id != null) {
            for (Department department : departments) {
                 System.out.println("ids= "+department.getId());
                Integer deptId =department.getId();
                if (deptId.equals(id)) {
                       System.out.println("exists");
                    return department;
                }
                 System.out.println("Not Exists");
            }
        }
        return null;
    }
//    public Department getDepartment(Integer id) {
//		if (id != null) {
//			for (Department department : departments) {
//				if (department.getId().equals(id)) {
//					return department;
//				}
//			}
//		}
//		return null;
//	}

   
}
