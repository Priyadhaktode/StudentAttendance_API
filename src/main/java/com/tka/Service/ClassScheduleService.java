package com.tka.Service;

import java.util.List;

import com.tka.Entity.Classschedule;

public interface ClassScheduleService {

	List<Classschedule> getAllClassSchedule();
	Classschedule getClassScheduleById(Long Id);
	//Classschedule deleteClassScheduleById(Long id);
	String deleteById(Long Id);

	
}
