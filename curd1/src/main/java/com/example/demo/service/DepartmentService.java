package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
    // save operation
    Department saveDepartment(Department department);
  
    // read operation
    List<Department> fetchDepartmentList();
  
    // update operation
    Department updateDepartment(Department department, Long departmentId);
  
    // delete operation
    void deleteDepartmentById(Long departmentId);

	Department saveDepartment1(Department department);
}