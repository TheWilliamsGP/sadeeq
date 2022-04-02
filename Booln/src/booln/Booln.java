/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booln;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class Booln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
    Scanner Compare = new Scanner(System.in);//Scanner allows keyboard input
    {
    int fnum ;
    int snum ;
   
    System.out.println("Enter the first number");
    fnum = Compare.nextInt();
    
    System.out.println("Enter the second number");
    snum = Compare.nextInt();
    
    boolean b1 = (fnum<snum);// Testing if the first number is less than the second number.
        System.out.println("Is " + fnum + " less than " + snum + "? " + b1);
    
    boolean b2 = (fnum>snum);// Testing if the first number is more than the second number. 
        System.out.println("Is " + fnum + " greater than " + snum + "? " + b2);
    
    boolean b3 = (fnum==snum);// Testing if the first number is equal to the second number.
        System.out.println("Is " + fnum + " equal to " + snum + "? " + b3);
    
    boolean b4 = (fnum<=snum);// Testing if the first number is less than equal to the second number.
        System.out.println("Is " + fnum + " less than equal to " + snum + "? " + b4);
    
    boolean b5 = (fnum!=snum);// Testing if the first number and the second number are not equal.
        System.out.println("Is " + fnum + " not equal to " + snum + "? " + b5);
    
    boolean b6 = (fnum>=snum);// Testing if the first number is greater than equal to the second number.
        System.out.println("Is " + fnum + " greater than equal to " + snum + "? " + b6);
    }
    
}
}