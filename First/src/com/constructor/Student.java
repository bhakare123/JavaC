package com.constructor;

public class Student 
{
  String name;
  String course;
  
  Student(String name)
  {
	  this(name, "Java");
  }
  
  Student(String name, String course)
  {
	  this.name = name ;
	  this.course = course;
  }
  
  public void studentDetails()
  {
	  System.out.println("Student Name :- "+name);
	  System.out.println("Student course :- "+course);
  }
  
  public static void main(String[] args) 
  {
	Student s = new Student("Tejas");
	s.studentDetails();
	System.out.println("-----------------------------");
	
	Student s1 = new Student("Shri");
	s1.studentDetails();
	System.out.println("------------------------------");
	
	Student s2 = new Student("Deve", "Python");
    s2.studentDetails();
  }
}
