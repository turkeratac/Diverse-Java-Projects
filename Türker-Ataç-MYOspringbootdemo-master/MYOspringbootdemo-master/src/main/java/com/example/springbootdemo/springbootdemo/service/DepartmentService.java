package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.model.Department;
import java.util.List;

public interface DepartmentService {
    public Department deptSave(Department d);
    public List<Department> getDepartments();
    public Department getDepartmentById(String id);
    public String deleteDepartmentById(String id);
}
