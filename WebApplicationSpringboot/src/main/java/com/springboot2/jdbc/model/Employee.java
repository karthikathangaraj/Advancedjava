package com.springboot2.jdbc.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "employee")
public class Employee {
	 private Integer employeeId;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String phone;
	 private String jobTitle;
	 public Integer getEmployeeId() {
	  return employeeId;
	 }
	 public void setEmployeeId(Integer employeeId) {
	  this.employeeId = employeeId;
	 }
	 public String getFirstName() {
	  return firstName;
	 }
	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }
	 public String getLastName() {
	  return lastName;
	 }
	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }
	 public String getEmail() {
	  return email;
	 }
	 public void setEmail(String email) {
	  this.email = email;
	 }
	 public String getPhone() {
	  return phone;
	 }
	 public void setPhone(String phone) {
	  this.phone = phone;
	 }
	 public String getJobTitle() {
	  return jobTitle;
	 }
	 public void setJobTitle(String jobTitle) {
	  this.jobTitle = jobTitle;
	 }
	}