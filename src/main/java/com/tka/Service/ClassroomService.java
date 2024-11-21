package com.tka.Service;

import java.util.List;

import com.tka.Entity.Classroom;

public interface ClassroomService {
	List<Classroom>getAllClassrooms();
    Classroom getClassroomById(Long id);
    void saveClassroom(Classroom classroom);
    void deleteClassroom(Long id);
}
