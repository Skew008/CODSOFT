package com.example;

import java.util.*;

public class Game {
  List<Integer> a;
  Random rd;

  public Game()
  {
    a = new ArrayList<>();
    rd = new Random();
  }

  public void playgame()
  {
    System.out.println("Game Start:");
    int round = 1;
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int r = rd.nextInt()%100;
      int score = 10;
      System.out.println("\nRound "+round+":");
      for(int i=10; i>0; i--)
      {
        System.out.print("\nEnter your guess:");
        int guess = sc.nextInt();
        if(guess==r)
        {
          System.out.println("You guessed it correctly!!!");
          break;
        }
        else if(guess<r)
          System.out.println("Guess is too low.");
        else if(guess>r)
        System.out.println("Guess is too high.");
        score--;
      }
      if(score==0)
        System.out.println("\nDid not win in this round :(");
      a.add(score);
      round++;
      System.out.print("Want to play Round "+round+"? ");
      String s = sc.next();
      if(s.equalsIgnoreCase("no"))
        break;
    }
    printresult(a);
    System.out.println("Happy Playing :)\nSee you again soon!!!");
    sc.close();
  }

  private void printresult(List<Integer> a)
  {
    System.out.println("\n\nScores of the game:");
    int round = 1;
    for(int i:a)
    {
      if(i==0)
        System.out.println("Round "+round+": Score:0, Lost");
      else
        System.out.println("Round "+round+" Score:"+i+", Won");
      round++;
    }
  }
}
