package com.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
  Question[] q;
  String[] opStrings;
  String ip;
  String s;
  Timer t;
  int i;

  public Quiz()
  {
    q = questions();
    ip="";
  }

  public void playQuiz()
  {
    Scanner sc = new Scanner(System.in);
    opStrings = new String[q.length];
    System.out.println("Welcome To the Quiz!!!");
    System.out.println("You will get 10 seconds to answer the questions.\nSelect options from a,b,c,d.\nIf no option seleted within time then it will go to next question");
    for(int i=0; i<q.length; i++)
    {
      System.out.println("\n"+q[i].question);
      System.out.print("Enter your option:");
      ip = input(sc);
      if("abcd".indexOf(ip)==-1)
        opStrings[i] = "";
      else
        opStrings[i] = ip;
      if("abcd".indexOf(ip)!=-1)
      {
        System.out.print("To move next, press 'n':");
        sc.next();
      }
    }
    score();
    sc.close();
  }

  private void score()
  {
    int sum = 0;
    for(int i=0; i<q.length; i++)
    {
      if(q[i].option.equalsIgnoreCase(opStrings[i]))
      {
        sum++;
        System.out.println("\nQ"+(i+1)+":\nCorrect option:"+q[i].option+", Your selected option:"+opStrings[i]+"\nYour Answer is correct :)");
      }
      else
      {
        System.out.println("\nQ"+(i+1)+":\nCorrect option:"+q[i].option+", Your selected option:"+opStrings[i]+"\nYour Answer is incorrect :(");
      }
    }
    System.out.println("\nTotal Score:"+sum);
  }

  private Question[] questions()
  {
    Question[] questions = new Question[5];
    questions[0] = new Question("Q1) What is the capital of Australia?\na) Sydney\nb) Melbourne\nc) Canberra\nd) Perth", "c");
    questions[1] = new Question("Q2) Who painted the Mona Lisa?\na) Vincent van Gogh\nb) Pablo Picasso\nc) Leonardo da Vinci\nd) Michelangelo", "c");
    questions[2] = new Question("Q3) What is the largest ocean in the world?\na) Atlantic Ocean\nb) Indian Ocean\nc) Arctic Ocean\nd) Pacific Ocean", "d");
    questions[3] = new Question("Q4) Which planet is known as the 'Red Planet'?\na) Venus\nb) Mars\nc) Jupiter\nd) Saturn", "b");
    questions[4] = new Question("Q5) Who wrote the play 'Romeo and Juliet'?\na) William Shakespeare\nb) Jane Austen\nc) Charles Dickens\nd) F. Scott Fitzgerald", "a");
    return questions;
  }

  private String input(Scanner sc)
  {
    s = "";
    TimerTask task = new TimerTask() {
      public void run()
      {
        if(s.equals(""))
        {
          System.out.println("\nDid not enter I/P.");
          System.out.print("To move next, press 'n':");
        }
      }
    };
    t = new Timer();
    t.schedule(task, 10000);
    s = sc.next().toLowerCase();
    t.cancel();
    return s;
  }
}