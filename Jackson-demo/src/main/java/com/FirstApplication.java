package com;
import java.io.IOException;  
import java.util.List;  
import com.fasterxml.jackson.core.JsonParseException;  
import com.fasterxml.jackson.databind.JsonMappingException;  
import com.fasterxml.jackson.databind.ObjectMapper;  
public class FirstApplication {  
    
    // main() method start  
    public static void main(String args[]){       
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
        // create a JSON string of employee details to deserilized object  
        String empString = "{\n\"employees\" : [\n{\n\"empId\":\"001\",\n\"jobTitleName\":\"Developer\","  
                + "\n\"firstName\":\"Nicholas\",\n\"lastName\":\"Clemens\",\n\"preferredFullName\":\"Nicholas Clemens\","  
                + "\n\"employeeCode\":\"E010\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1234567\",\n\"emailAddress\""  
                + ":\"nicholas.clemens@gmail.com\"\n},\n{\n\"empId\":\"002\",\n\"jobTitleName\":\"Developer\","  
                + "\n\"firstName\":\"Sharon\",\n\"lastName\":\"Lorenz\",\n\"preferredFullName\":\"Sharon Lorenz\","  
                + "\n\"employeeCode\":\"E011\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1111111\",\n\"emailAddress\""  
                + ":\"sharon.lorenz@gmail.com\"\n},\n{\n\"empId\":\"thanks\",\n\"jobTitleName\":\"Program Directory\","  
                + "\n\"firstName\":\"Brittany\",\n\"lastName\":\"Hart\",\n\"preferredFullName\":\"Brittany Hart\",\n\""  
                + "employeeCode\":\"E012\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-2222222\",\n\"emailAddress\":\"brittany.hart@gmail.com\"\n}\n]\n}";  
        
        try{  
            // use ObjectMapper for mapping JSON to Employee  
            Employees employees = mapper.readValue(empString, Employees.class);  
            // print employees  
            System.out.println(employees);  
            // serialize employees into json string  
            empString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);  
            System.out.println(empString);  
        }catch (JsonParseException e) {  
            e.printStackTrace();  
        }catch (JsonMappingException e) {  
            e.printStackTrace();   
        }catch (IOException e) {  
            e.printStackTrace();   
        }  
    }  
}   
// create Employees class   
class Employees {  
    private List<Employee> employees;  
    // getter and setter  
    public List<Employee> getEmployees() {  
        return employees;  
    }  
    public void setEmployees(List<Employee> employees) {  
        this.employees = employees;  
    }  
}  
class Employee {      
    // declare variables  
    private String empId;  
    private String jobTitleName;  
    private String firstName;  
    private String lastName;  
    private String preferredFullName;  
    private String employeeCode;  
    private String region;  
    private String phoneNumber;  
    private String emailAddress;  
     
    public Employee(){  
         
    }  
     
    // getter/setters for all variables  
    public String getEmpId() {  
            return empId;  
    }  
    public void setEmpId(String empId) {  
            this.empId = empId;  
    }  
     
    public String getJobTitleName() {  
            return jobTitleName;  
    }  
    public void setJobTitleName(String jobTitleName) {  
            this.jobTitleName = jobTitleName;  
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
    public String getPreferredFullName() {  
            return preferredFullName;  
    }  
    public void setPreferredFullName(String preferredFullName) {  
            this.preferredFullName = preferredFullName;  
    }  
    public String getEmployeeCode() {  
            return employeeCode;  
    }  
    public void setEmployeeCode(String employeeCode) {  
            this.employeeCode = employeeCode;  
    }  
    public String getRegion() {  
            return region;  
    }  
    public void setRegion(String region) {  
            this.region = region;  
    }  
    public String getPhoneNumber() {  
            return phoneNumber;  
    }  
    public void setPhoneNumber(String phoneNumber) {  
            this.phoneNumber = phoneNumber;  
    }  
     
    public String getEmailAddress() {  
            return emailAddress;  
    }  
    public void setEmailAddress(String emailAddress) {  
            this.emailAddress = emailAddress;  
    }   
    public String toString(){  
            return "Employee [ Employee Id: "+empId+", Job Title: "+jobTitleName+ ""  
                + ", First Name: \"+firstName+ \", Last Name: \"+lastName+ \""  
                + ", Name: \"+preferredFullName+ \", Employee Code: \"+employeeCode+ \""  
                + ", Region: \"+region+ \", Phone Number: \"+phoneNumber+ \""  
                + ", Email Address: \"+emailAddress+ \" ]";  
    }  
}  