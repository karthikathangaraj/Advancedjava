package com.example.demo.controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
  
// Annotation
@RestController
  
// Class
public class DepartmentController {
  
    // Annotation
    @Autowired 
    private DepartmentService departmentService;
  
    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
        @Valid @RequestBody Department department)
    {
  
        return departmentService.saveDepartment(department);
    }
  
    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
  
        return departmentService.fetchDepartmentList();
    }
  
    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
  
        return departmentService.updateDepartment(
            department, departmentId);
    }
  
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
  
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
}