package com.tns.entities;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	
	private String name;
	
	private int rollno;

	public int getStudentId() {
		return id;
	}

	public void setStudentId(int studentId) {
		this.id = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
		
	
}
