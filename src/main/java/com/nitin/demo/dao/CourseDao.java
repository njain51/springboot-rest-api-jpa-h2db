package com.nitin.demo.dao;

/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/8/2022, Tuesday
 **/

import com.nitin.demo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


/**
 What this program snippet doing?
 **/

// add `Course` since it's defined as entity and `Long` is primary key in entity class
// this will automatically get all methods to fetch data from database

public interface CourseDao extends JpaRepository<Course,Long>  {


}
