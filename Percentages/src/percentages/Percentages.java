/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentages;

import java.util.Scanner;

/**
 *
 * @author sadeeqwilliams
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner PERCEN  = new Scanner(System.in);//Scanner allows keyboard input
        
        double first;
        double second;
        
        System.out.println("Enter first number");
        first = PERCEN.nextDouble();
       
        System.out.println("Enter second number");
        second = PERCEN.nextDouble();
        
        
        computePercent(first,second);
        
    }
    public static void computePercent(double num, double num1)//Method 
    {
        double PER = num/num1*100;
        double PERC = num1/num*100;
        
        System.out.println(num + " is "+ PER  +" percent of " + num1);
        System.out.println(num1 + " is "+ PERC  +" percent of " + num);

    }
}
