package com.example.institute.model;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

@Entity
@Table (name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "enrollmentDate")
    private LocalDate enrollmentDate;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
    
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }
    public void setEnrollmentDate(LocalDate enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }

    public Course getCourse(){
        return course;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    
}