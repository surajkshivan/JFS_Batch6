package com.cg.model;


public class Testcircle {

	public static void main(String[] args) {
		circle c1 = new circle(2.0,"Blue");
		System.out.println("The radius is:" +c1.getradius());
		System.out.println("The color is:" +c1.getcolor());
		System.out.println("The area is: %.2f%n" +c1.getarea());
		
		circle c2 =new circle(2.0,"Red");
		System.out.println("The radius is:" +c2.getradius());
		System.out.println("The color is:" +c2.getcolor());
		System.out.println("The area is: %.2f%n" +c2.getarea());
		
		circle c3 =new circle(1.0,"Yellow");
		System.out.println("The radius is:" +c3.getradius());
		System.out.println("The color is:" +c3.getcolor());
		System.out.println("The area is: %.2f%n" +c3.getarea());
		
		

	}
	

}
