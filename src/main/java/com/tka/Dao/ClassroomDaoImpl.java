package com.tka.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Classroom;

@Repository
public class ClassroomDaoImpl implements ClassroomDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override

	public List<Classroom> getAllClassrooms() {
		// TODO Auto-generated method stub
		Session session = null;
		List<Classroom> Classrooms;
		try
		{
			session = sessionFactory.openSession();
			Classrooms = session.createQuery("From Classroom",Classroom.class).getResultList();

		} finally
		{
			if(session != null)
			{
				session.close();
			}
		}

		return Classrooms;
	}

	@Override

	public Classroom getClassroomById(Long Id) {
		// TODO Auto-generated method stub
		Session session = null;
		Classroom Classroom = null;
		try
		{
			session = sessionFactory.openSession();
			Classroom = session.get(Classroom.class,Id);

		} finally
		{
			if(session != null)
			{
				session.close();
			}
		}

		return Classroom;
	}

	@Override
	public void saveClassroom(Classroom classroom) {
		// TODO Auto-generated method stub

		Session session = null;
		Classroom Classroom = null;
		try
		{
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(Classroom);
			session.getTransaction().commit();
		} finally
		{
			if(session != null)
			{
				session.close();
			}
		}


	}

//	@Override
//	public void deleteClassroom(Long id) {
//		// TODO Auto-generated method stub
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		Classroom classroom = session.get(Classroom.class, id);
//		session.delete(classroom);
//		tx.commit();
	
	public void deleteClassroom(Long id) {
		Session session = null;
        try {
        	session = sessionFactory.openSession();
        	session.beginTransaction();
        	Classroom classroom = session.get(Classroom.class,id);
        	session.delete(classroom);
        	session.getTransaction().commit();
        }
        finally {
        	
        	if(session != null)
			{
				session.close();
			}

        }
	}
	
	

	}




