/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentage;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class Percentage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner PERCEN  = new Scanner(System.in);
        
        double first;
        double second;
        
        System.out.println("Enter first number");
        first = PERCEN.nextDouble();
       
        System.out.println("Enter second number");
        second = PERCEN.nextDouble();
        
        
        computePercent(first,second);
        
    }
    public static void computePercent(double num, double num1){
        
        double PER = num*100/num1;
          double PERc = num1*100/num;
        
        System.out.println(num + " is "+ PER  +" percent of " + num1);
        System.out.println(num1 + " is "+ PERc  +" percent of " + num);
      
        
    }

    }
    

