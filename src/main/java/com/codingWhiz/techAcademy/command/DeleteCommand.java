package com.codingWhiz.techAcademy.command;

import com.codingWhiz.techAcademy.business.object.StudentResponse;
import com.codingWhiz.techAcademy.operations.CrudOperations;

public class DeleteCommand implements Command {
	CrudOperations operations = null;

	
	public StudentResponse execute() {
		// TODO Delete Operation should be called
		return this.operations.delete();
	}

	
	public void setOperations(CrudOperations operations) {
		// TODO Auto-generated method stub
		this.operations = operations;
	}

}
