package com.tka.Dao;

import java.util.List;

import com.tka.Entity.Classroom;

public interface ClassroomDao {

	List<Classroom> getAllClassrooms();
	Classroom getClassroomById(Long id);
	void saveClassroom(Classroom classroom);
	void deleteClassroom(Long id);


}
