package com.courses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Course {

    private  String courseId;
    private String courseName;
    private  String courseFee;
    private String studentId;
    private String studentName;

}
