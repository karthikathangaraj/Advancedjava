package com.Eureka.studentservice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Eureka.studentservice.Model.student_info;
@Repository
public interface studentrep extends JpaRepository<student_info,Long> {

}
