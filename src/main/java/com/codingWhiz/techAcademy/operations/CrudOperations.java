package com.codingWhiz.techAcademy.operations;

import com.codingWhiz.techAcademy.business.object.StudentBaseObjectBO;
import com.codingWhiz.techAcademy.business.object.StudentQuery;
import com.codingWhiz.techAcademy.business.object.StudentResponse;

public interface CrudOperations {

	public StudentResponse create();

	public StudentResponse update();

	public StudentResponse delete();

	public StudentResponse fetch(StudentQuery query);

	public void setOperationsData(StudentBaseObjectBO baseObject);

	public StudentBaseObjectBO getOperationsData();

}
