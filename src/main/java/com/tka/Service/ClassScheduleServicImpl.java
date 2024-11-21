package com.tka.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.ClassScheduleDao;
import com.tka.Dao.ClassroomDao;
import com.tka.Entity.Classschedule;

@Service
public class ClassScheduleServicImpl implements ClassScheduleService {
	 @Autowired
	 private ClassScheduleDao ClassScheduleDao;
	
	
	@Override
	@Transactional
	public List<Classschedule> getAllClassSchedule() {
		// TODO Auto-generated method stub
		return ClassScheduleDao.getAllClassSchedule();
	}


	@Override
	@Transactional
	public Classschedule getClassScheduleById(Long Id) {
		// TODO Auto-generated method stub
		return ClassScheduleDao.getClassScheduleById(Id);
	}


//	@Override
//	public Classschedule deleteClassScheduleById(Long id) {
//		// TODO Auto-generated method stub
//		return ClassScheduleDao.deleteClassScheduleById(id);
//	}


	@Override
	public String deleteById(Long Id) {
		// TODO Auto-generated method stub
		return ClassScheduleDao.deleteClassScheduleById(Id);
	}

}
