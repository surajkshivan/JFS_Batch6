package com.cg.model;

public class Student {
	
	private int id;

	private MathCheat mathCheat; 
	

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {

		mathCheat.MathCheat();
		System.out.println("hey my id is:" +id+ " take it Do whatever you want");



	}

} 
