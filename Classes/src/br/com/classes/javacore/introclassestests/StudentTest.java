package br.com.classes.javacore.introclassestests;

import br.com.classes.javacore.introclasses.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "Marcus";
		student.registration = "BR123456";
		student.age = 10;
		
		System.out.println("Name: " + student.name);
		System.out.println("Registration: " + student.registration);
		System.out.println("Age: " + student.age);
	}
}
