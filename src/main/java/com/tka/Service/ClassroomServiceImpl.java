package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tka.Dao.ClassroomDao;
import com.tka.Entity.Classroom;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
	 private ClassroomDao ClassroomDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Classroom> getAllClassrooms() {
		return ClassroomDao.getAllClassrooms();
	}

	@Override
	public Classroom getClassroomById(Long Id) {
		// TODO Auto-generated method stub
		return ClassroomDao.getClassroomById(Id);
	}

	@Override
	public void saveClassroom(Classroom classroom) {
		// TODO Auto-generated method stub
		  ClassroomDao.saveClassroom(classroom);
	}
	
	

	@Override
	public void deleteClassroom(Long id) {
		// TODO Auto-generated method stub
		ClassroomDao.deleteClassroom(id);
	}

}
