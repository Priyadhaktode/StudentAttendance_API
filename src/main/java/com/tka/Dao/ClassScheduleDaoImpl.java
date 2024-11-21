package com.tka.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Classschedule;

import com.tka.Entity.Classroom;
@Repository
public class ClassScheduleDaoImpl implements ClassScheduleDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Classschedule> getAllClassSchedule() {
		// TODO Auto-generated method stub

		Session session = null;
		List<Classschedule> ClassSchedule;
		try
		{
			session = sessionFactory.openSession();
			ClassSchedule = session.createQuery("From Classschedule",Classschedule.class).getResultList();

		} finally
		{
			if(session != null)
			{
				session.close();
			}
		}

		return ClassSchedule;
	}

	@Override
	public Classschedule getClassScheduleById(Long id) {
		// TODO Auto-generated method stub
		Session session = null;
		Classschedule Classschedule = null;
		try
		{
			session = sessionFactory.openSession();
			Classschedule = session.get(Classschedule.class,id);

		} finally
		{
			if(session != null)
			{
				session.close();
			}
		}

		return Classschedule;
	}

	@Override
	public String deleteClassScheduleById(Long id) {
		// TODO Auto-generated method stub
		
		 Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Classschedule b1 = session.get(Classschedule.class, id);
		session.delete(b1);
		tx.commit();
		return "Deleted Succesfully";
	}

//	@Override
//	public String deleteClassScheduleById(Long id) {
//		// TODO Auto-generated method stub
//		Session session = null;
//		Classschedule Classschedule = null;
//
//		try {
//			session = sessionFactory.openSession();
//			session.beginTransaction();
//			Classschedule classschedule= session.get(Classschedule.class,id);
//			session.delete(classschedule);
//			session.getTransaction().commit();
//		}
//		finally {
//
//			if(session != null)
//			{
//				session.close();
//			}
//		}
//		return "deleted Successfully";
//	}
	
	


}
