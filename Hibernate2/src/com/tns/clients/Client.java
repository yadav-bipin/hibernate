package com.tns.clients;


import com.tns.entities.Student;
import com.tns.services.StudentService;
import com.tns.services.StudentServiceImpl;


public class Client {
	
	public static void main(String[] args)
	{
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		// create operation
		student.setStudentId(100);
		student.setName("Bipin");
		student.setRollno(27);
		service.addStudent(student);
		
		
		// retrieve operation
		student = service.findtStudentById(100);
		System.out.println("ID :" + student.getStudentId());
		System.out.println("Name :" + student.getName());
		System.out.println("RollNo :" + student.getRollno());
		
		// update operation
		student = service.findtStudentById(100);
		student.setName("Steve Jobs");
		service.updateStudent(student);
		
		// retrieve operation
		student = service.findtStudentById(100);
		System.out.println("ID :" + student.getStudentId());
		System.out.println("Name :" + student.getName());
		System.out.println("RollNo :" + student.getRollno());
				
		// remove operation
		
		//student = service.findtStudentById(100);
		//service.removeStudent(student);
		
		System.out.println("End of Program Cycle");
		
		
		
		
		
		
		
		
		
	}
	
	

	// create operation
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
