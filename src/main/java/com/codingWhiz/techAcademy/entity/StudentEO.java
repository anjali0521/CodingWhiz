package com.codingWhiz.techAcademy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentEO {
	
	@Id @GeneratedValue
	@Column(name = "STUDENT_ID")
	public Long studentId;
	
	@Column(name ="STUDENT_NAME")
	public String studentName;
	
	@Column(name ="STUDENT_EMAIL")
	public String studentEmail;
	
	@Column(name ="STUDENT_PHONE")
	public String studentPhone;
	
	@Column(name ="USER_NAME")
	public String userName;
	
	@Column(name ="PASSWORD")
	public String password;
	
	@Column(name ="CREATED_BY")
	public String createUserId;
	
	@Column(name ="CREATED_TIME")
	public Date createdTime;	
	
	@Column(name ="LAST_UPDATED_BY")
	public String lastChangeUserId;
	
	@Column(name ="LAST_UPDATED_TIME")
	public Date lastChangeTime;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastChangeUserId() {
		return lastChangeUserId;
	}

	public void setLastChangeUserId(String lastChangeUserId) {
		this.lastChangeUserId = lastChangeUserId;
	}

	public Date getLastChangeTime() {
		return lastChangeTime;
	}

	public void setLastChangeTime(Date lastChangeTime) {
		this.lastChangeTime = lastChangeTime;
	}
	
	
	
}
