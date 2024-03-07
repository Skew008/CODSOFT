package com.example;

public class ATM {
  UserAccount u;

  public ATM(UserAccount u)
  {
    this.u = u;
  }

  public void withdraw(double amt)
  {
    if(u.balance>=amt)
    {
      System.out.println("\nTransaction successfull.");
      System.out.println("Amount of "+amt+" has been withdrawn.");
      u.balance -= amt;
      checkBalance();
    }
    else
    {
      System.out.println("\nNot Enough Balance in account :(");
      System.out.println("Transaction failed.");
    }
  }

  public void deposit(double amt)
  {
    System.out.println("\nTransaction successfull.");
    System.out.println("Amount of "+amt+" has been deposited.");
    u.balance += amt;
    checkBalance();
  }

  public void checkBalance()
  {
    System.out.println("Available balance "+u.balance+".");
  }
}
