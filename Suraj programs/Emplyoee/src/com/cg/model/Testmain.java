package com.cg.model;

public class Testmain {

	public static void main(String[] args) {
	    Testemploye e1 = new Testemploye (8, "Peter", "Tan", 2500);
	      System.out.println(e1); 
	      e1.setsalary(999);
	      System.out.println(e1);
	      System.out.println("id is: " + e1.getid());
	      System.out.println("firstname is: " + e1.getfirstName());
	      System.out.println("lastname is: " + e1.getlastName());
	      System.out.println("salary is: " + e1.getsalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualsalary());

	     
	      System.out.println();
	      System.out.println(e1);
	   }
	

	}


