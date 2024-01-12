package com.courses.cont;

import com.courses.model.Course;
import com.courses.service.courseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
//@RequestMapping("/course")
public class courseCont {

    @Autowired
    private courseService service;


    @PostMapping(value = "/add-course")
    @ResponseStatus(HttpStatus.CREATED)
    public Course addCourse(@RequestBody Course course){
        return service.addCourse(course);
    }


    @GetMapping(value = "/get-all-courses")
   // @ResponseStatus(HttpStatus.OK)
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }


    @GetMapping(value = "/get-course-by-id/{courseId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Course getCourseByid(@PathVariable String courseId){

        return  service.getCourseById(courseId);
    }


    @GetMapping(value = "/get-course-by-student-id/{studentId}")
   // @ResponseStatus(HttpStatus.OK)
    public List<Course> getCourseByuserId(@PathVariable String studentId){
        log.info("In Course Service", studentId);
        return  service.getCourseByuserId(studentId);
    }


    @GetMapping(value = "/get-course-by-student-name/{studentName}")
   // @ResponseStatus(HttpStatus.FOUND)
    public List<Course> getcourseByuserName(@PathVariable("studentName") String studentName){
    log.info("fetching course details");
        return service.getCourseByuserName(studentName);
    }

    @GetMapping(value = "/test")
    public String forTest(){
        log.info("log for Test");
        return "is It Successfull";
    }

}
