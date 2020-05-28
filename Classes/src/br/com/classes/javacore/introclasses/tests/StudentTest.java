package br.com.classes.javacore.introclasses.tests;

import br.com.classes.javacore.introclasses.classes.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Marcus");
		student.setRegistration("BR123456");
		student.setAge(10);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Registration: " + student.getRegistration());
		System.out.println("Age: " + student.getAge());
	}
}
