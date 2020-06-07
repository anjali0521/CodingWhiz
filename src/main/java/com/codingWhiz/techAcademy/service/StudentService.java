package com.codingWhiz.techAcademy.service;

import com.codingWhiz.techAcademy.business.object.StudentBO;

	public interface StudentService {
		public Long createStudent(StudentBO studentModel);
		public StudentBO getstudentById(String username, String password);
	}