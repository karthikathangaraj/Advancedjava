package com.springboot2.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

 @Override
 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
  Employee employee = new Employee();
  employee.setEmployeeId(rs.getInt("employee_id"));
  employee.setFirstName(rs.getString("first_name"));
  employee.setLastName(rs.getString("last_name"));
  employee.setEmail(rs.getString("email"));
  employee.setPhone(rs.getString("phone"));
  employee.setJobTitle(rs.getString("job_title"));
  return employee;
 }

}