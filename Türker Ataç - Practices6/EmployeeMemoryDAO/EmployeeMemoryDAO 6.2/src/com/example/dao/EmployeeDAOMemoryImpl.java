package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {
    private static Employee[] employeeArray = new Employee[10];
    public EmployeeDAOMemoryImpl() {
        // Default constructor implementation
        // Here, you can initialize or perform any necessary setup
    }

    public void add(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }
    public void update(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }
    public void delete(int id) {
        employeeArray[id] = null;
    }
    public Employee findById(int id) {
        return employeeArray[id];
    }
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}