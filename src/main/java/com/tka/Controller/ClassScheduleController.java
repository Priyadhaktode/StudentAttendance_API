package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Classschedule;
import com.tka.Entity.Classroom;
import com.tka.Service.ClassScheduleService;
import com.tka.Service.ClassroomService;

@RestController
public class ClassScheduleController {

	@Autowired
	ClassScheduleService Service;

	@GetMapping("/getAllClassSchedule")
	public List<Classschedule>getAllClassSchedule(){
		return Service.getAllClassSchedule();
	}

	@GetMapping("/getClassScheduleById/{Id}")
	public Classschedule getClassScheduleById(@PathVariable Long Id)
	{
		return Service.getClassScheduleById(Id);
	}
	
//	@DeleteMapping("/deleteClassScheduleById/{Id}")
//	public Classschedule deleteClassScheduleById(@PathVariable Long Id) {
//		return Service.deleteClassScheduleById(Id);
//	}
	
	@DeleteMapping("deleteClassScheduleById/{Id}")
	public String deleteById(@PathVariable Long Id)
	{
		return Service.deleteById(Id);
	}
	
}

