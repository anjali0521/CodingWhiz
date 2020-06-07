package com.codingWhiz.techAcademy.command;

import com.codingWhiz.techAcademy.business.object.StudentResponse;
import com.codingWhiz.techAcademy.operations.CrudOperations;

public interface Command {
	
	
	public StudentResponse execute();
	
	public void setOperations(CrudOperations operations);

}
