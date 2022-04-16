/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.JButton;

/**
 *
 * @author sadeeqwilliams
 */
public class Validator implements ActionListener
{
    private static JLabel NameLabel;
    private static JTextField NameText;
    private static JLabel SurnameLabel;
    private static JTextField SurnameText;
    private static JLabel UsernameLabel;
    private static JTextField usernameText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel info;
    private static JLabel Head;
    public static void main(String[] args) {
        /*
A simple password validator which validates passwords based on some simple rules.
Your password should be atleast 8 characters long and should contain atleast
one Uppercase letter, one Lowercase letter, one Number and one Special Character.
This was my first tryst with GUIs in Java.
*/
    
        
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(600, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Password Validator");
        frame.add(panel);
 
        panel.setLayout(null);
        
        Head = new JLabel("Create Account");
        Head.setBounds(260, 15, 500, 55);
        Head.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); 
        panel.add(Head);
        
        NameLabel = new JLabel("Name");
        NameLabel.setBounds(160, 70, 80, 25);
        panel.add(NameLabel);
 
        NameText = new JTextField(20);
        NameText.setBounds(260, 70, 165, 25);
        panel.add(NameText);
        
        SurnameLabel = new JLabel("Surname");
        SurnameLabel.setBounds(160,95, 80, 25);
        panel.add(SurnameLabel);
 
        SurnameText = new JTextField(20);
        SurnameText.setBounds(260, 95, 165, 25);
        panel.add(SurnameText);
        
        UsernameLabel = new JLabel("Username");
        UsernameLabel.setBounds(160, 120, 80, 25);
        panel.add(UsernameLabel);
 
        usernameText = new JTextField(20);
        usernameText.setBounds(260, 120, 165, 25);
        panel.add(usernameText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(160, 145, 80, 25);
        panel.add(passwordLabel);
 
        passwordText = new JPasswordField(20);
        passwordText.setBounds(260, 145, 165, 25);
        panel.add(passwordText);
 
        button = new JButton("Check");
        button.setBounds(250, 175, 80, 25);
        
        button.addActionListener(new Validator());
       panel.add(button);
 
        info = new JLabel("<html>Your password should be atleast 8 characters long<br/>and contain atleast one Uppercase letter,<br/>one Lowercase letter, one Number and one Special Character</html>");
        info.setBounds(150, 200, 500, 55);
        panel.add(info);
 
        frame.setVisible(true);
    }
    }
     public boolean checkValidPassword(char[] password)
    {
        int upC = 0; 
        int lwC = 0; 
        int num = 0;
        int spC = 0;
        //This function returns different values based on what is missing in the parameter 'password'
        if(password.length < 8)
        {
            return false;
        }
        for(int i = 0; i < password.length; i++)
        {
            char c = password[i];
            if(Character.isUpperCase(c))
            {
                upC = 1;
            }
            else if(Character.isLowerCase(c))
            {
                lwC = 1;
            }
            else if(Character.isDigit(c))
            {
                num = 1;
            }
            if(!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c))
            {
                spC = 1;
            }
        }
        if(upC == 1 && lwC == 1 && num == 1 && spC == 1)
        {
            return true;
        }
        return false;
    }
 
    public void actionPerformed(ActionEvent e)
    {
        String message = "";
        char[] password = passwordText.getPassword(); //getPassword() method returns the typed password as a character array
        if(checkValidPassword(password))
        {
            message = "The password is strong enough and valid.";
        }
        else
        {
            message = "The password is not strong enough.";
        }
        info.setText(message);
 
        Arrays.fill(password, '0'); // Zero out the password, for security
    }
}   
    
    

