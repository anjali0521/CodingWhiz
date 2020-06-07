package com.codingWhiz.techAcademy.command;

import com.codingWhiz.techAcademy.business.object.StudentBaseObjectBO;
import com.codingWhiz.techAcademy.business.object.StudentResponse;
import com.codingWhiz.techAcademy.operations.CrudOperations;

public class DBInvoker {

	Command command;
	CrudOperations operations;
	StudentBaseObjectBO baseObject;

	private DBInvoker(Command command, CrudOperations operations,
			StudentBaseObjectBO baseObject) {
		this.command = command;
		this.operations = operations;
		this.baseObject = baseObject;
	}

	public static DBInvoker getInstance(Command command,
			CrudOperations operations, StudentBaseObjectBO baseObject) {
		DBInvoker invokerInstance = new DBInvoker(command, operations,
				baseObject);
		invokerInstance.setOperationsData();
		return invokerInstance;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public CrudOperations getOperations() {
		return operations;
	}

	public void setOperations(CrudOperations operations) {
		this.operations = operations;
	}

	public StudentBaseObjectBO getBaseObject() {
		return baseObject;
	}

	public void setBaseObject(StudentBaseObjectBO baseObject) {
		this.baseObject = baseObject;
	}

	private void setOperationsData() {
		this.operations.setOperationsData(this.baseObject);
	}

	public StudentResponse execute() {
		command.setOperations(operations);
		return command.execute();
	}
}
