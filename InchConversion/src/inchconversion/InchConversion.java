/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inchconversion;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class InchConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         Scanner CON  = new Scanner(System.in);
        
        double first;
        
        System.out.println("Enter the amount of inches");
        first = CON.nextDouble();
        
        Conversion(first);   
        ConversionI(first);
    }
    public static void Conversion(double num)
    {
        double in = num/12;
        
        
        System.out.println(num + " inches is equal to "+ in  +" feet "  );
    }
    
     public static void ConversionI(double num)
    {
        
        double yards = num/36;
        
        System.out.println(num + " inches is equal to "+ yards  +" yards" );
    }
}
