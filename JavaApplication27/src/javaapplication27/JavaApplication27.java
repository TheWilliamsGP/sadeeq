/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;
import java.util.Scanner;

public class JavaApplication27 {
    
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}



import javax.swing.JOptionPane;
import java.util.*;

public class GasIndicator
{

     public static void main(String[] args)
     {
          String answer;
          String outputStr1;
          String outputStr2;

     answer =            
          JOptionPane.showInputDialog ( "Do you have at least an eighth tank of gas? yes or no " );



          outputStr1 = "You can drive straight to work";
          outputStr2 = "Stop and get gas!";

          if (answer == "yes")

              JOptionPane.showMessageDialog(null, outputStr1, "Gas", JOptionPane.INFORMATION_MESSAGE);


          else 
              JOptionPane.showMessageDialog(null, outputStr2, "Gas", JOptionPane.INFORMATION_MESSAGE);


         System.exit(0);            


     }
}