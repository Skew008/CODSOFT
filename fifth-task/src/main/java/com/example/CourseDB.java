package com.example;
import java.util.ArrayList;

public class CourseDB {
  ArrayList<Course> courses;

  public CourseDB()
  {
    courses();
  }
  public void listCourses()
  {
    int i=1;
    for(Course c:courses)
    {
      System.out.println();
      System.out.println(i);
      System.out.println("Course Code: "+c.cc);
      System.out.println("Course Name: "+c.title);
      System.out.println("Description: "+c.des);
      System.out.println("Remaining Seats: "+c.cap);
      System.out.println("Schedule: "+c.schedule);
      System.out.println();
      i++;
    }
  }

  private void courses()
  {
    courses = new ArrayList<>();
    courses.add(new Course("DBMS", "This course will give you knowledge of how databases work around us.", 10, "11:00 AM - 12:00 PM"));
    courses.add(new Course("CN", "This course will provide you knowledge about the network around us.", 10, "9:00 AM - 10:00 AM"));
  }
}
