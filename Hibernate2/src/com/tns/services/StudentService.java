package com.tns.services;

import com.tns.entities.Student;

public interface StudentService {
	
	public abstract Student findtStudentById(int id);
	
	public abstract void addStudent(Student student);
	
	public abstract void updateStudent(Student student);
	
	public abstract void removeStudent(Student student);
	
	
	
	
	
	
	
	
}
