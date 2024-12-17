package com.example.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.institute.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student save(Student student);

    void deleteById(Long id);
}
