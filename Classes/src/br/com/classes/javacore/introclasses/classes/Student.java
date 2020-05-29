package br.com.classes.javacore.introclasses.classes;

public class Student {
	public String name;
	public String registration;
	public int age;
	public float [] grades;
	public float media;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float[] getGrades() {
		return grades;
	}
	public void setGrades(float... grades) {
		float mediaTemp = 0;
		this.grades = new float[grades.length];		
		
		for(int index=0; index < grades.length; index++ ) {
			this.grades[index] = grades[index];
			mediaTemp += grades[index];
		}		
		
		this.setMedia(mediaTemp/grades.length);
	}
	public float getMedia() {
		return media;
	}	
	private void setMedia(float media) {
		this.media = media;
	}	
	
	
}
