/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentages2;

import java.util.Scanner;

/**
 *
 * @author sadeeqwilliams
 */
public class Percentages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner PERCEN  = new Scanner(System.in);//Scanner allows keyboard input.
        
        double first;
        double second;
        
        System.out.println("Enter the first number");
        first = PERCEN.nextDouble();
       
        System.out.println("Enter the second number");
        second = PERCEN.nextDouble();
        
        
        computePercent(first,second);
        
    }
    //Method will work out % of the number and then reverse the order of the calulation. 
    public static void computePercent(double num, double num1)
    {
        double PER = num/num1*100;
        double PERC = num1/num*100;
        
        System.out.println(num + " is "+ PER  +" percent of " + num1);
        System.out.println(num1 + " is "+ PERC  +" percent of " + num);

    }
}
