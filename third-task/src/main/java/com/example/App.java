package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        UserAccount user = new UserAccount(10000);
        ATM atm = new ATM(user);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome User!!!\n");
        while(true)
        {
            System.out.println("\nWhat do you want to do, select the option:-");
            System.out.println("1) Check Balance");
            System.out.println("2) Withdraw Cash");
            System.out.println("3) Deposit Cash");
            System.out.println("4) Exit");
            System.out.print("Enter Choice:");
            String i = sc.next();
            switch (i) {
                case "1":
                    atm.checkBalance();
                    break;
                case "2":
                    System.out.print("\nEnter amount:");
                    atm.withdraw(sc.nextInt());
                    break;
                case "3":
                    System.out.print("\nEnter amount:");
                    atm.deposit(sc.nextInt());
                    break;
                default:
                    System.out.println("\nThanks For Visiting!!!");
                    break;
            }
            if("123".indexOf(i)==-1)
                break;
            System.out.print("\nDo you want to continue?");
            if(sc.next().equalsIgnoreCase("no"))
            {
                System.out.println("\nThanks For Visiting!!!");
                break;
            }
        }
        sc.close();
    }
}
