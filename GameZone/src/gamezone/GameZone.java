/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamezone;

import javax.swing.JOptionPane;

/**
 *
 * @author sadeeqwilliams
 */
public class GameZone {
public static final int PASSWORD_LENGTH = 8;
    private static boolean is_Valid_Password;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        
        //JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10");
        //JOptionPane.showMessageDialog(null, "the number is " + (1 + (int)(Math.random() * 10 ) ));
        
        String result ;
        String resul ;
        String password ;
        result = JOptionPane.showInputDialog(null, "What is your name?");
         resul = JOptionPane.showInputDialog(null, "What is your surname?");
          password = JOptionPane.showInputDialog(null, "What is your age?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + " " + resul + " and you are " + password + "years old");
        
        if (is_Valid_Password) {
          JOptionPane.showMessageDialog(null,"Account Created", "valid Username or Password", JOptionPane.OK_OPTION);   
        } else {
           JOptionPane.showMessageDialog(null,"Incorrect password", "invalid Username or Password", JOptionPane.ERROR_MESSAGE);
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
        
        
        
        //JOptionPane.showInputDialog(null, "what is your area code?", "area code information",JOptionPane.QUESTION_MESSAGE);
    }
    
}

    }
        //  if(fname.trim().equals("") || Sname.trim().equals("") || usname.trim().equals("") 
         //  || password.trim().equals("") || passc.trim().equals(""))
       // {
      //      JOptionPane.showMessageDialog(null,"One or more fields are empty","Empty Fields",2);
       //     return false;
       // }
     //   else if(password.equals(passc))
        
       // {
        //       JOptionPane.showMessageDialog(null,"Passwords Doesn't match","Confirm Password",2);
       //        return false;
       // }
        
       // else {
       //     return true;
       // }

        JOptionPane.showMessageDialog(null,"account created");
         systemExit();





 //String fname = jTextField_name.getText();
       // String Sname = jTextField_surname.getText();
       // String usname = jTextField_uname.getText();
        //String pass = String.valueOf(jPassword.getPassword());
        //String passc = String.valueOf(jPasswordC.getPassword());
       // String password = jPassword.getText();
       // String username = jTextField_uname.getText();
       // String Gender = "Male";
        
       if(Valid_Password) {
            
           JOptionPane.showMessageDialog(null,"Passwords Doesn't match","Confirm Password",2);
              return false;
           //System.out.println("Password is valid: " + s);
        } 
       else 
       {
           return true;
           //JOptionPane.showMessageDialog(null,"Passwords Doesn't match","Confirm Password",2);
          
            //System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean Valid_Password(String jPassword) {
       
            if(password.length() < PASSWORD_LENGTH) return false;
        
            int charCount = 0;
            int numCount = 0;
            for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
    }
    
             //else 
    {
        return (charCount >= 2 && numCount >= 2);
            }
    }
        //  if(fname.trim().equals("") || Sname.trim().equals("") || usname.trim().equals("") 
         //  || password.trim().equals("") || passc.trim().equals(""))
       // {
      //      JOptionPane.showMessageDialog(null,"One or more fields are empty","Empty Fields",2);
       //     return false;
       // }
     //   else if(password.equals(passc))
        
       // {
        //       JOptionPane.showMessageDialog(null,"Passwords Doesn't match","Confirm Password",2);
       //        return false;
       // }
        
       // else {
       //     return true;
       // }

        JOptionPane.showMessageDialog(null,"account created");
         systemExit();








String password = jPassword.getText();
    String username = jtxtUserName.getText();
    
    if (password.contains(is_Valid_Password) && (username.contains(is_Letter)));
        
            {
            jtxtUserName.setText(null);
            jPassword.setText(null);
            systemExit();
             
            Login_s Info = new Login_s();
            Info.setVisible(true);
             }
    else 
        
        {
                
        JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
        jtxtUserName.setText(null);
        jPassword.setText(null);
                }