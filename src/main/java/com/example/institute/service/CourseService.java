package com.example.institute.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.institute.model.Course;
import com.example.institute.repository.CourseRepository;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @SuppressWarnings("hiding")
    public <Course> List<com.example.institute.model.Course> getAllCourses() {
        return  courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}

