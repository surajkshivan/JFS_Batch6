package com.cg.model;

public class Student {
	
	private int id;
	private String studentName;
	private String Phno;
	public Student(int id,String name,String phno) {
		
		this.id = id;
		this.studentName = name;
		this.Phno = phno;
	}
	public void displayStudentInfo() {
		System.out.println("student name is " +studentName +" and the id is:"+id + "  phono is: "  +Phno);
	}
	
	

}
