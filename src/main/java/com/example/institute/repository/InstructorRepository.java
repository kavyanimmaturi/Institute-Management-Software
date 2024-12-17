package com.example.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.institute.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}

