package com.example.demojavasql.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "course_name")
    private String name;
    @Column (name = "course_timeline")
    private LocalDate timeLine;
    @Column(name = "description")
    private String description;
    @Column(name = "course_price")
    private BigDecimal price;
    @Column(name = "type_course")
    private String typeCourse;
    @Column(name = "course_vote")
    private int vote;
}
