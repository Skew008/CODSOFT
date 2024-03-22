package com.example;
import java.util.ArrayList;

public class Student {
  String stid;
  String name;
  ArrayList<Course> c;
  static int i=1000;

  public Student(String name)
  {
    this.stid = "ST"+i;
    this.name = name;
    c = new ArrayList<>();
    i++;
  }

  public void listCourses(ArrayList<Course> courses)
  {
    int i=1;
    for(Course c:courses)
    {
      System.out.println();
      System.out.println(i);
      System.out.println("Course Code: "+c.cc);
      System.out.println("Course Name: "+c.title);
      System.out.println("Description: "+c.des);
      System.out.println("Schedule: "+c.schedule);
      System.out.println();
      i++;
    }
  }
}
