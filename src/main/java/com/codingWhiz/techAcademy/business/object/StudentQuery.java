package com.codingWhiz.techAcademy.business.object;

public class StudentQuery extends StudentBaseObjectBO {
	private String queryString;
	
	public StudentQuery() {
		
	}
	
	public StudentQuery(String queryString) {
		this.queryString = queryString;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

}
