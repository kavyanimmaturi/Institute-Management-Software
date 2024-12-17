package com.example.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.institute.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Course save(Course course);

    void deleteById(Long id);
}
