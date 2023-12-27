package com.example.demojavasql.reponsitory;

import com.example.demojavasql.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseReponsitory extends JpaRepository<Course,Integer> {
    @Query(value = "select * from Course where price = 500000 and vote > 4",nativeQuery = true)
    List<Course>findCourseByPriceAndVote();
}
