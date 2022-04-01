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
   
    System.out.println("Enter first number");
    fnum = Compare.nextInt();
    
    System.out.println("Enter second number");
    snum = Compare.nextInt();
    
    boolean b1 = (fnum<snum);// Testing if the numbers are less than 
        System.out.println("Is " + fnum + " less than " + snum + " " + b1);
    
    boolean b2 = (fnum>snum);// Testing if the numbers are more than 
        System.out.println("Is " + fnum + " greater than " + snum + " " + b2);
    
    boolean b3 = (fnum==snum);// Testing if the numbers are equal
        System.out.println("Is " + fnum + " equal to " + snum + " " + b3);
    
    boolean b4 = (fnum<=snum);// Testing if the numbers are less than equal
        System.out.println("Is " + fnum + " less than equal " + snum + " " + b4);
    
    boolean b5 = (fnum!=snum);// Testing if the numbers are not equal
        System.out.println("Is " + fnum + " not equal " + snum + " " + b5);
    
    boolean b6 = (fnum>=snum);// Testing if the numbers are less than equal
        System.out.println("Is " + fnum + " greater than equal " + snum + " " + b6);
    }
    
}
}