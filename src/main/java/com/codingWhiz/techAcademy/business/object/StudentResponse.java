package com.codingWhiz.techAcademy.business.object;

import java.util.List;

public class StudentResponse extends StudentBaseObjectBO {
	public static int SUCCESS = 1;
	public static int FAILURE = 0;
	private int executionStatus;
	private int updatedRows;
	private List<StudentBaseObjectBO> responseList;
	private String errorMessage;
	
	public int getExecutionStatus() {
		return executionStatus;
	}
	public void setExecutionStatus(int executionStatus) {
		this.executionStatus = executionStatus;
	}
	public int getUpdatedRows() {
		return updatedRows;
	}
	public void setUpdatedRows(int updatedRows) {
		this.updatedRows = updatedRows;
	}
	public List<StudentBaseObjectBO> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<StudentBaseObjectBO> responseList) {
		this.responseList = responseList;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
