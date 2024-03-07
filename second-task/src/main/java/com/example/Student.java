package com.example;

import java.util.*;

public class Student {
  int[] marks;

  public void getResult()
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter number of Subject:");
    int n = sc.nextInt();
    marks = new int[n];
    for(int i=0; i<n; i++)
    {
      System.out.print("Enter marks of subject "+(i+1)+":");
      marks[i] = sc.nextInt();
    }
    double totalmarks = calTotal(marks);
    double percentage = calPercentage(totalmarks,n);
    System.out.println("Total Marks obtained: "+totalmarks+"/"+(n*100));
    System.out.println("Average Percentage obtained: "+String.format("%.2f", percentage)+"%");
    System.out.println("Grades obtained: "+calGrade(percentage));
    sc.close();
  }

  private double calTotal(int[] a)
  {
    double ct = 0;
    for(int i:a)
      ct+=i;
    return ct;
  }

  private double calPercentage(double t, int n)
  {
    return (t/(n*100))*100;
  }

  private String calGrade(double p)
  {
    if(p>90)
      return "A+";
    else if(p>80 && p<=90)
      return "A";
    else if(p>70 && p<=80)
      return "B";
    else if(p>60 && p<=70)
      return "C";
    else if(p>50 && p<=60)
      return "D";
    else if(p>40 && p<=50)
      return "E";
    else
      return "F";
  }
}
