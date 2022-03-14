package com.cg.model;

public class Testemploye {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Testemploye(int id,String firstName,String lastName,int salary) {
		
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
		
	}
	public int getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getName() {
		return "firstName,lastName";
		
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int a){
		this.salary=a;
	}
	public int getAnnualsalary() {
		return salary*12;
	}
	public int  raisesalary(int percent)
	{
	salary=salary*12*percent/100-100;
	return salary;
	}
	public String toString() {
		return "employe[id="+this.id+",name="+this.firstName+" "+this.lastName+", salary="+this.salary+"]";
	}

}
