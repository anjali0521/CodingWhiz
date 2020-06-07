
package com.codingWhiz.techAcademy.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Named;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.codingWhiz.techAcademy.business.object.StudentBO;
import com.codingWhiz.techAcademy.entity.StudentEO;
import com.codingWhiz.techAcademy.persistence.HibernateUtil;

@Named

public class StudentServiceImpl implements StudentService {

	
	@Transactional(rollbackFor = Throwable.class, readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
	public StudentBO getstudentById(String username, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		StudentBO studentModel =null;
		try {
			List<StudentEO> studentList = (List<StudentEO>)session.createQuery("from StudentEO where userName='"+username+"' and password='"+password+"'").list();
			
			System.out.println("size = " + studentList.size());
			
			for (Iterator<StudentEO> iterator = studentList.iterator(); iterator.hasNext();) {
				StudentEO studentEntity = (StudentEO) iterator.next();
				studentModel =new StudentBO();
				BeanUtils.copyProperties(studentModel, studentEntity);
				System.out.println("student mode l value " +studentModel);
			} 

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.close();
		}
		return studentModel;
	}

	@Transactional(rollbackFor = Throwable.class, readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
	public Long createStudent(StudentBO studentModel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Long id = null;
		try {
				StudentEO studentEntity = new StudentEO();
				BeanUtils.copyProperties(studentEntity, studentModel);
				System.out.println(studentEntity.getStudentEmail());
				System.out.println(studentEntity.getStudentName());
				System.out.println(studentEntity.getStudentPhone());
				System.out.println("studentEntity : "+studentEntity);
				session.getTransaction().begin();
				id = (Long) session.save(studentEntity);
				session.getTransaction().commit();
				System.out.println("id returned anjali : "+id);

		} catch (HibernateException e) {
			//transaction.rollback();
			e.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			session.close();
		}
		return id;
	}
}


