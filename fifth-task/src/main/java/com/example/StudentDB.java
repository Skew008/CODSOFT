package com.example;

import java.util.ArrayList;

public class StudentDB {
  ArrayList<Student> students;
  
  public StudentDB()
  {
    students();
  }

  private void students()
  {
    students = new ArrayList<>();
    students.add(new Student("Alice"));
    students.add(new Student("Bob"));
    students.add(new Student("Charlie"));
  }

  public void register(Course cc,String stid)
  {
    for(Student s:students)
    {
      if(s.stid.equalsIgnoreCase(stid))
      {
        s.c.add(cc);
        cc.cap--;
        break;
      }
    }
  }

  public void taken(String stid)
  {
    for(Student s:students)
    {
      if(s.stid.equalsIgnoreCase(stid))
      {
        if(s.c.isEmpty())
          System.out.println("No Courses taken till now.");
        else
        {
          s.listCourses(s.c);
        }
      }
    }
  }
  public void delete(Course cc,String stid)
  {
    for(Student s:students)
    {
      if(s.stid.equalsIgnoreCase(stid))
      {
        s.c.remove(cc);
        cc.cap++;
        break;
      }
    }
  }
}
