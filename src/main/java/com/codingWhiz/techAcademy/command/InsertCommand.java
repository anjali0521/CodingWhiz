package com.codingWhiz.techAcademy.command;

import com.codingWhiz.techAcademy.business.object.StudentResponse;
import com.codingWhiz.techAcademy.operations.CrudOperations;

public class InsertCommand implements Command {
	CrudOperations operations = null;

	//@Override
	public StudentResponse execute() {
		// TODO Insert Operation should be called
		return operations.create();
	}

	//@Override
	public void setOperations(CrudOperations operations) {
		// TODO Auto-generated method stub
		this.operations = operations;
	}

}
