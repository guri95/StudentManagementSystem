package com.guri.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guri.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
