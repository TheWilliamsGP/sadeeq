/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner.a;
import java.util.Scanner;


/**
 *
 * @author sadeeqwilliams
 */
public class ScannerA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Tree = new Scanner (System.in);
        System.out.println("What is your name?");
        String Name = Tree.next();
        System.out.println("What is your Age?");
        int Age= Tree.nextInt();
        System.out.println("Which area do you stay in?");
        String Area = Tree.next();
        Area = Area + Tree.nextLine();
        System.out.println("And your motto is.");
        String Motto = Tree.nextLine ();
        
        
        System.out.println("Shukran " + Name + " you're " + Age + " years old " + "the area you stay in is " + Area);
        System.out.println(" and your motto is " + Motto);
        
        
        
        
    
        
        
        
    }
    
}
