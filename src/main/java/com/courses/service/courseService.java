package com.courses.service;

import com.courses.model.Course;
import com.courses.repo.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class courseService {

    @Autowired
    private courseRepo repo;

    public Course addCourse(Course course){
       String s= UUID.randomUUID().toString();
       course.setCourseId(s);
      return repo.save(course);
    }

    public List<Course> getAllCourses(){
        return repo.findAll();
    }

    public Course getCourseById(String id){
        Course course= repo.findByCourseId(id);

        return  course;
    }

    public List<Course> getCourseByuserId(String id){
        List<Course> course= repo.findByStudentId(id);

        return  course;
    }

    public List<Course> getCourseByuserName(String name){
        List<Course> course= repo.findByStudentName(name);
        return  course;
    }
}

