package com.Prac_Maven;

public class Run_Class {
public static void main(String[] args) {
	Pojo_Class p=new Pojo_Class();
	p.setName("Abhinaya");
	p.setSubject("English");
	p.setMarks(82);
	p.setGrade('B');
	System.out.println(p.getName());
	System.out.println(p.getSubject());
	System.out.println(p.getMarks());
	System.out.println(p.getGrade());
}
}
