/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannertut;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class Scannertut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Whats your name?");
        String name = scan.next();
        
        System.out.println("What is your age?");
        int age = scan.nextInt();
        
        System.out.println("Write a motto.");
        String motto = scan.next();
        motto = motto + scan.nextLine();
        
        
        System.out.println("Thank you " + name +  ", " + "you are " + age + "years old");
        System.out.println("and your motto is " + motto);
       
    }
    
}

