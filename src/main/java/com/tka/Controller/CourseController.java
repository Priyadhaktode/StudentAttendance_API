package com.tka.Controller;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Course;
import com.tka.Service.CourseService;
@RestController
public class CourseController {
	@Autowired
	CourseService Service;
	  
 public List<Course>getAllCourses()
 {
	 return Service.getAllcourses();
 }
	


}
