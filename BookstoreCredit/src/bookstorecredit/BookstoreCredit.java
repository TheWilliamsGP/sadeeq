/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstorecredit;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class BookstoreCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Scanner Book = new Scanner(System.in);
     
     String Name ;
     double GPA ;
     
     System.out.println("Enter your Name");
     Name = Book.nextLine();
     
     System.out.println("Enter your grade");
     GPA = Book.nextDouble();
     
     BookStoreCredit(Name, GPA);
    }
     public static void BookStoreCredit(String Name, double GPA )
     {
         double grade = GPA *10;
         
         System.out.println("My name is " + Name + " and my grade is " + GPA + " I have a credit of $" + grade);
     }
     
     
     
             
    }
    

