package com.springboot;

import java.util.List;

import com.springboot2.jdbc.model.Employee;



public interface EmployeeDao {
 
 public List<Employee> getAllEmployees();
 
 public Employee findeEmployeeById(int id);
 
 public void addEmployee(Employee employee);
 
 public void updateEmployee(Employee employee);
 
 public void deleteEmployee(int id);
}