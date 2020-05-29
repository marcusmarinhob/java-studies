package br.com.classes.javacore.introclasses.tests;

import br.com.classes.javacore.introclasses.classes.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		float [] grades = new float[]{10.0f, 9.0f, 2.0f}; 
		
		student.setName("Marcus");
		student.setRegistration("BR123456");
		student.setAge(10);
		student.setGrades(grades);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Registration: " + student.getRegistration());
		System.out.println("Age: " + student.getAge());		
			
		printGrades(student.getGrades());	
		System.out.println("Media: " + student.getMedia());
		
		student.setGrades(8.0f, 7.5f, 8.5f, 9.5f, 6.5f);
		printGrades(student.getGrades());
		System.out.println("Media: " + student.getMedia());
	}
	
	static void printGrades(float[] grades) {
		System.out.printf("grades[%d:%d] = {", 0, (grades.length-1));
		for(int index = 0; index < grades.length; index++){
			System.out.print(grades[index]);
			
			if( index < (grades.length - 1))
			{
				System.out.print(", ");
			}			
		}
		System.out.println("}");
	}
}

