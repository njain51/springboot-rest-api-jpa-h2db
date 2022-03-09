package com.nitin.demo.services;

import com.nitin.demo.dao.CourseDao;
import com.nitin.demo.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao1;
    //List<Course> list;


    public CourseServiceImpl() {
    super();

    }


    @Override
    public List<Course> getCourses() {

        return courseDao1.findAll();  // this automatically returns all contents from database in form of list.
    }

    @Override
    public Course getCourse(long id) {

        return courseDao1.getById(id);

    }

    @Override
    public Course addCourse(Course course) {
        courseDao1.save(course);
        //list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

        courseDao1.save(course); // same as save Course, if course exists it wil overwrite else will save new one.

        return course;
    }

    @Override
    public Course delCourse(long id) {

        Course course1 = courseDao1.getById(id);
        courseDao1.delete(course1);

        return course1;
    }




}

