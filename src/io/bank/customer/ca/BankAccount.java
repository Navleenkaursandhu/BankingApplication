package io.bank.customer.ca;

import java.util.Scanner;

public class BankAccount {

    int balance;
    int previous_transaction;
    String customer_name;
    String customer_id;

    public BankAccount(String customer_name, String customer_id) {
        this.customer_name = customer_name;
        this.customer_id = customer_id;
    }

    void deposit(int amount) {
        if(amount!=0) {
            balance = balance + amount;
            previous_transaction = amount;
        }
    }

    void withdrawal(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previous_transaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previous_transaction > 0) {
            System.out.println("Deposited: " + previous_transaction);
        } else if (previous_transaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previous_transaction));
        } else {
            System.out.println("No transaction happened");
        }

    }

    void menu(){
        char option= '\0';
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome B" + customer_name);
        System.out.println("ID: " + customer_id);
        System.out.println("\n");
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

     do
     {
         System.out.println("*********************************************************************");
         System.out.println("Enter the option");
         System.out.println("*********************************************************************");
         option = input.next().charAt(0);
         System.out.println("\n");

         switch(option)
         {
             case 'A':
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("Balance= " + balance);
                 System.out.println("---------------------------------------------------------------");
                 System.out.println("\n");
                 break;
             case 'B':
                 System.out.println("--------------------------------------------------------------");
                 System.out.println("Enter the amount to deposit");
                 System.out.println("--------------------------------------------------------------");
                 int amount= input.nextInt();
                 deposit(amount);
                 System.out.println("\n");
                 break;
             case 'C':
                 System.out.println("-----------------------------------------------------------");
                 System.out.println("Enter an amount to withdraw");
                 System.out.println("-----------------------------------------------------------");
                 int amount1= input.nextInt();
                 withdrawal(amount1);
                 System.out.println('\n');
                 break;
             case 'D':
                 System.out.println("-----------------------------------------------------------");
                 getPreviousTransaction();
                 System.out.println("-----------------------------------------------------------");
                 System.out.println("\n");
                 break;

             case 'E':
                 System.out.println("***************************EXIT***************************");
             default:
                 System.out.println("Invalid Option!! Please select  a valid option");
                 break;
         }
     }while(option!='E');
        System.out.println("\n");
        System.out.println("Thank You for using our service");
    }
}