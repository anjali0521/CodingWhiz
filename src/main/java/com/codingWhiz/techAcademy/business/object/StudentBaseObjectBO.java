package com.codingWhiz.techAcademy.business.object;

import java.util.Date;

public class StudentBaseObjectBO {
	
	private String createUserId;
	private Date createdTime;
	private String lastChangeUserId;
	private Date lastChangeTime;

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastChangeUserId() {
		return this.lastChangeUserId;
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

	public String toString() {
		return "";
	}
}
