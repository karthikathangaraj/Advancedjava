package com.Eureka.studentservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class student_info {
	
	public student_info() {
		//super();
	}
	public student_info(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sno;
	@Column(name="sname")
	private String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}
