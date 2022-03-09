package com.nitin.demo.services;

import com.nitin.demo.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long id);

    public Course addCourse(Course course);

    public Course delCourse(long id);

    public Course updateCourse(Course course);

}
