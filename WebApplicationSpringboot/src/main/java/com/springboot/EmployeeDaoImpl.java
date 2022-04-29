package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot2.jdbc.model.Employee;
import com.springboot2.jdbc.model.EmployeeRowMapper;



@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
 
 @Autowired
 private JdbcTemplate jdbcTemplate;

 @Override
 public List<Employee> getAllEmployees() {
  String query = "SELECT * from employees";
  RowMapper<Employee> rowMapper = new EmployeeRowMapper();
  List<Employee> list = jdbcTemplate.query(query, rowMapper);
  
  return list;
 }

 @Override
 public Employee findeEmployeeById(int id) {
  String query = "SELECT * FROM employees WHERE employee_id = ?";
  RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
  Employee employee = jdbcTemplate.queryForObject(query, rowMapper, id);
  
  return employee;
 }

 @Override
 public void addEmployee(Employee employee) {
  String query = "INSERT INTO employees(employee_id, first_name, last_name, email, phone, job_title) VALUES(?, ?, ?, ?, ?, ?)";
  jdbcTemplate.update(query, employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPhone(), employee.getJobTitle());
  
 }

 @Override
 public void updateEmployee(Employee employee) {
  String query = "UPDATE employees SET first_name=?, last_name=?, email=?, phone=?, job_title=? WHERE employee_id=?";
  jdbcTemplate.update(query, employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPhone(), employee.getJobTitle(), employee.getEmployeeId());
  
 }

 @Override
 public void deleteEmployee(int id) {
  String query = "DELETE FROM employees WHERE employee_id=?";
  jdbcTemplate.update(query, id);
 }

}