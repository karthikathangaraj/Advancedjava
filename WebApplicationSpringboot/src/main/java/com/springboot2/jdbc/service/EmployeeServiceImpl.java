package com.springboot2.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.EmployeeDaoImpl;
import com.springboot2.jdbc.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
 
 @Autowired
 private EmployeeDaoImpl employeeDao;

 @Override
 public List<Employee> getAllEmployees() {
  return employeeDao.getAllEmployees();
 }

 @Override
 public Employee findEmployeeById(int id) {
  return employeeDao.findeEmployeeById(id);
 }

 @Override
 public void addEmployee(Employee employee) {
  employeeDao.addEmployee(employee);
 }

 @Override
 public void updateEmployee(Employee employee) {
  employeeDao.updateEmployee(employee);
 }

 @Override
 public void deleteEmployee(int id) {
  employeeDao.deleteEmployee(id);
 }

}
