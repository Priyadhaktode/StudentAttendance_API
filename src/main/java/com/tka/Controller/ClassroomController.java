package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Classroom;
import com.tka.Service.ClassroomService;


@RestController
@RequestMapping("/api/classrooms")

public class ClassroomController {
	
	@Autowired
	ClassroomService Service;
	
	@GetMapping("/getAllClassrooms")
	public List<Classroom>getAllClassrooms(){
		return Service.getAllClassrooms();
	}
	
	@GetMapping("/getClassroomById/{Id}")
	public Classroom getClassroomById(@PathVariable Long Id )
	{
		return Service.getClassroomById(Id);
		
	}
	
	@PostMapping("/saveClassroom")
	public void createClassroom(@RequestBody Classroom classroom)
	{
		Service.saveClassroom(classroom);

	}

	@DeleteMapping("/deleteClassroomById/{Id}")
	public void deleteClassroom(@PathVariable Long id)
	{
	 Service.deleteClassroom(id);
	}
}
