package com.ntg.smartcompound.mai.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
public class EmployeeApplication extends Application {
    private Set<Class<?>> singletons = new HashSet<>();
    public EmployeeApplication() {
        singletons.add(EmployeeService.class);
    }
    @Override
    public Set<Class<?>> getClasses() {
        return singletons;
    }
} 