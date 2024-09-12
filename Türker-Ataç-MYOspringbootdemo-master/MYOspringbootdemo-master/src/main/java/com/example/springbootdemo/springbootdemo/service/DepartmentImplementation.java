package com.example.springbootdemo.springbootdemo.service;

import com.example.springbootdemo.springbootdemo.model.Department;
import org.springframework.stereotype.Service;
import com.example.springbootdemo.springbootdemo.error.DepartmentNotFoundException;
import com.example.springbootdemo.springbootdemo.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
@Service
public class DepartmentImplementation implements DepartmentService{
    List<Department> deptList=new ArrayList<>();

    @Override
    public Department deptSave(Department d) {
        if (d.getDeptId() == null) {
            d.setDeptId(UUID.randomUUID().toString());
        }
        deptList.add(d);
        return d;
    }

    @Override
    public List<Department> getDepartments() {
        return deptList;
    }

    @Override
    public Department getDepartmentById (String id) {
        Department d = deptList
                .stream()
                .filter(t -> t.getDeptId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(
                        () ->
                                new DepartmentNotFoundException("there is no " +
                                        "mathcing Record with id  :" + id));
        return d;
    }
    @Override
    public String deleteDepartmentById(String id) {
        Department d =deptList
                .stream()
                .filter(t -> t.getDeptId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(
                        () ->
                                new DepartmentNotFoundException("there is no " +
                                        "mathcing Record with id  :" + id));
        deptList.remove(d);
        return "the department Record with id :" + id + " is deleted";
    }


}
