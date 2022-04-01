/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbersdemo;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class NumbersDemo {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner VAR = new Scanner(System.in);//Scanner allows keyboard input.
        int fnum ;
        int snum ;
        
        System.out.println("Enter first number");
        fnum = VAR.nextInt();
        
        System.out.println("Enter second number");
        snum = VAR.nextInt();
        
        //Method one
        displayTwiceTheNumber(fnum);
        displayTwiceTheNumber(snum);
        
        //Method two
        displayNumberPlusFive(fnum);
        displayNumberPlusFive(snum);
        
        //Method three
        displayNumberSquared(fnum);
        displayNumberSquared(snum);
        
    }  
       public static void displayTwiceTheNumber(int num) //Method one:The numbers given will be multiplied 2. 
       {
        int NUMT = 2;
     
        System.out.println(num + " multiplied by " + NUMT + " is " +(num * NUMT));      
    }
        public static void displayNumberPlusFive(int num) //Method two: Will add 5 to the numbers given.
        {
        int NUMF = 5;
     
        System.out.println (num + " plus " + NUMF + " is " +(num + NUMF)); 
        }
        public static void displayNumberSquared(int num) //Method three: will get the squared value of the numbers given.
        {                                                   
           
        System.out.println((num*num) + " is " + num + " squared");

        }
}
       

        
    

