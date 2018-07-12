package com.prathamesh.customannotationdemo.CustomAnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestCustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
	Student s = new Student();
	s.testAnnotation();
	} 
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
     String studentName();
}

class Student{
	@CustomAnnotation( studentName="Prathamesh")
	 public void testAnnotation() throws NoSuchMethodException, SecurityException {
System.out.println("Name: "+ this.getClass().getMethod("testAnnotation").getAnnotation(CustomAnnotation.class).studentName());

		   }
}