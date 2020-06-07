package com.codingWhiz.techAcademy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingWhiz.techAcademy.business.object.StudentBO;
import com.codingWhiz.techAcademy.business.object.StudentBaseObjectBO;
import com.codingWhiz.techAcademy.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Inject
	private StudentService studentService;
	
	

	/*For Adding Student*/
	@RequestMapping(value = "/register", method = RequestMethod.POST,headers="Accept=application/json")
	public @ResponseBody <StudentResponse> com.codingWhiz.techAcademy.business.object.StudentResponse createStudent(@RequestBody  StudentBO studentDetails)
	{
		System.out.println("create student id");
		final com.codingWhiz.techAcademy.business.object.StudentResponse studentResponse = new com.codingWhiz.techAcademy.business.object.StudentResponse();
		try
		{
			
			//StudentBO studentModel = studentDetails.getAdmin().getBusiness();
			StudentBO studentBO = new StudentBO();
			BeanUtils.copyProperties(studentBO , studentDetails); 
			System.out.println("studentBO : "+ studentBO);
			System.out.println(studentBO.getStudentEmail());
			System.out.println(studentBO.getStudentName());
			System.out.println(studentBO.getStudentPhone());
			Long studentId = studentService.createStudent(studentBO);
			System.out.println("studentId :fffffff : "+studentId);
			System.out.println("Bussiness Model as returned by businessunitservice"+studentId);
			if ( studentId == 0 || studentId == null ) 
			{
				studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.FAILURE);
				studentResponse.setErrorMessage("Student Registration Failed");
			}
			studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.SUCCESS);
			//System.out.println("Student Id : "+ studentBO.getStudentId());
		}
		catch(Exception ex ) 
		{
			studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.FAILURE);
			studentResponse.setErrorMessage("Student Registration Failed");
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return studentResponse;
	}
	
	/*To get the companyDetails as per passed companyId*/
	@RequestMapping(value = "/studentDetails/{username}/{password}", method = RequestMethod.GET,headers="Accept=application/json")
	public  @ResponseBody<SchedulerResponse> com.codingWhiz.techAcademy.business.object.StudentResponse getStudentById(@PathVariable("username") String username, @PathVariable("password") String password) 
	{
		final com.codingWhiz.techAcademy.business.object.StudentResponse studentResponse = new com.codingWhiz.techAcademy.business.object.StudentResponse();
		List<StudentBaseObjectBO>  responseList = new ArrayList<StudentBaseObjectBO>();
		try
		{
				StudentBO studentModel = studentService.getstudentById(username, password);
				if(studentModel == null )
				{
				 	studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.FAILURE);
					studentResponse.setErrorMessage("studentId is Incorrect");
				} 
				else 
				{
					
					responseList.add(studentModel);
					studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.SUCCESS);
					studentResponse.setResponseList(responseList);
				}
		} 
		catch(Exception ex)
		{
		
			studentResponse.setExecutionStatus(com.codingWhiz.techAcademy.business.object.StudentResponse.FAILURE);
			studentResponse.setErrorMessage("StudentId is Incorrect");
		}
		return studentResponse;
	}

}

