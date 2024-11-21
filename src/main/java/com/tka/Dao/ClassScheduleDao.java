package com.tka.Dao;

import java.util.List;

import com.tka.Entity.Classschedule;
import com.tka.Entity.Classroom;

public interface ClassScheduleDao {

	List<Classschedule>getAllClassSchedule();
	Classschedule getClassScheduleById(Long id);
	String deleteClassScheduleById(Long id);
	


}
