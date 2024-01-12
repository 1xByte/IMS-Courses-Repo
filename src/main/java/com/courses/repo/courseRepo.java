package com.courses.repo;

import com.courses.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface courseRepo extends MongoRepository<Course, String> {
    Course findByCourseId(String id);

    List<Course> findByStudentId(String id);

    List<Course> findByStudentName(String name);
}
