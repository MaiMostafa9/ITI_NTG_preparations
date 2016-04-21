/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntg.smartcompound.mai.converter;

import  com.ntg.smartcompound.mai.databaseSimulator.DatabaseSimulator;
import com.ntg.smartcompound.mai.entity.Department;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Dell
 */
@ManagedBean(name="departmentConverter")
@ApplicationScoped
//@FacesConverter("departmentConverter")
public class DepartmentConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        DatabaseSimulator databaseSimulator = new DatabaseSimulator();
        Department d= databaseSimulator.getDepartment(Integer.parseInt(string));
        System.out.println("dept1  "+d);
        return d;

    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Department department = (Department) o;
        return department.getId().toString();
    }

}
