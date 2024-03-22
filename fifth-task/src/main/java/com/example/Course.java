package com.example;
public class Course {
  String cc;
  String title;
  String des;
  int cap;
  String schedule;
  static int i = 100;

  public Course(String title,String des,int cap, String schedule)
  {
    this.cc = "CC"+i;
    this.title= title;
    this.des = des;
    this.cap = cap;
    this.schedule = schedule;
    i++;
  }
}
