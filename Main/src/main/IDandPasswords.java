/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sadeeqwilliams
 */
public class IDandPasswords implements ActionListener{
       public static final int UserName_LENGTH = 5;
    
   private static JLabel NameLabel;
    private static JTextField NameText;
    private static JLabel SurnameLabel;
    private static JTextField SurnameText;
    private static JLabel UsernameLabel;
    private static JTextField usernameText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton Confirm;
    private static JButton Check;
    private static JButton Cancel;
    private static JButton Exit; 
    private static JLabel condition;
    
    private static JLabel Head;
    String username;
    String password;
    
public static void main(String[] args) 
    {

         JPanel panel = new JPanel();
        
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        panel.setForeground(new java.awt.Color(0, 0, 0));
        
        JPanel panelT = new JPanel();
        panelT.setBounds(55, 23, 500, 110);
        panelT.setBackground(new java.awt.Color(255, 0, 0));
           
        JPanel line = new JPanel();
        line.setBounds(5, 150, 600, 15);
        line.setBackground(new java.awt.Color(0, 0, 0)); 
             
        JFrame frame = new JFrame();
        frame.setSize(600, 650);
        frame.setBackground(new java.awt.Color(204, 204, 204));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration");
        
        frame.add(panel);
        panel.add(panelT);
        frame.add(line);
        frame.add(panel);
        panel.setLayout(null);
        
        
       
        
     
       
        Head = new JLabel("Create Account");
        Head.setBounds(250, 55, 200, 25);
        Head.setFont(new java.awt.Font("Kannada MN", 3, 48)); 
        Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelT.add(Head);
        
        NameLabel = new JLabel("Name");
        NameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18)); 
        NameLabel.setBounds(160, 255, 80, 25);
        panel.add(NameLabel);
 
        NameText = new JTextField(20);
        NameText.setBounds(260, 250, 200, 29);
        panel.add(NameText);
        
        SurnameLabel = new JLabel("Surname");
        SurnameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        SurnameLabel.setBounds(160,290, 80, 25);
        panel.add(SurnameLabel);
 
        SurnameText = new JTextField(20);
        SurnameText.setBounds(260, 285, 200, 29);
        panel.add(SurnameText);
        
        UsernameLabel = new JLabel("Username");
        UsernameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        UsernameLabel.setBounds(160, 325, 80, 25);
        panel.add(UsernameLabel);
 
        usernameText = new JTextField(20);
        usernameText.setBounds(260, 320, 200, 29);
        panel.add(usernameText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        passwordLabel.setBounds(160, 365, 80, 25);
        panel.add(passwordLabel);
 
        passwordText = new JPasswordField(20);
        passwordText.setBounds(260, 360, 200, 29);
        panel.add(passwordText);
        
        Confirm = new JButton("Confirm");
        Confirm.setBounds(250, 400, 80, 25);
        Confirm.addActionListener(new IDandPasswords());
        panel.add(Confirm);
        
        Check = new JButton("Check");
        Check.setBounds(170, 400, 80, 25);
        Check.addActionListener(new IDandPasswords());
        panel.add(Check);
        
        Cancel = new JButton("Cancel");
        Cancel.setBounds(330, 400, 80, 25);
        Cancel.addActionListener(new IDandPasswords());
        panel.add(Cancel);
        
        condition = new JLabel("<html>Your Username should be no more than 5 charaters and password should be atleast 8 characters long and<br/> contain atleast one Uppercase letter,<br/>one Lowercase letter,<br/> one Number and<br/> one Special Character<br/>(the Username should contain a underscore)</html>");
        condition.setBounds(28, 450, 570, 150);
        panel.add(condition);
        frame.setVisible(true);
    }     
    public String registerUser(String _username, String _password){
        String response = "The two above conditions have been met and the user has been registered successfully.";
        if(!checkUsername(_username))
            return "Username is inccorectly formatted";
        this.username = _username;
        
        if(!checkPasswordComplexity(_password))
            return "The password does not meet the complexity requirements.";
        this.password = _password;
        
      return response;
    }
    
    public  boolean checkUsername(String username){
        // no need to have conditional statements
        return username.contains("_") && username.length() <= 5;
    
    }
    public boolean checkPasswordComplexity(String word){
        boolean UpperC = false;
        boolean LowerC = false;
        boolean Num = false;
        boolean SpecialC = false;
        for (int i=0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i)))
               UpperC = true;
   
            if (Character.isLowerCase(word.charAt(i)))
               LowerC = true;
            
            if (Character.isDigit(word.charAt(i)))
                Num = true;
            
            if ( ! ((Character.getNumericValue(word.charAt(i)) > -1) && 
                    (Character.getNumericValue(word.charAt(i)) < 36)))
                SpecialC = true;
        }
        return (UpperC && LowerC && Num && SpecialC);
    }
    
   HashMap<String,String> logininfo = new HashMap<String,String>();

	

	IDandPasswords(String word){

		

		logininfo.put(word,username);

		
	}

	

	public HashMap getLoginInfo(){

		return logininfo;
}
    public void actionPerformed(ActionEvent e){

      Object source = e.getSource();
        if(source == Confirm)
        {
        String Username =  usernameText.getText();
         if(checkUsername(Username))
         JOptionPane.showMessageDialog(null,"username correct");
        }
         else {
        JOptionPane.showMessageDialog(null,"username incorrect","error message",JOptionPane.ERROR_MESSAGE);
         }
    
   
        String password  = String.valueOf(passwordText.getPassword());
        

            if(checkPasswordComplexity(password))// && checkUser(Username))
             {
            JOptionPane.showMessageDialog(null,"password correct");
    
            }else{
        
            JOptionPane.showMessageDialog(null,"password incorrect","error message",JOptionPane.ERROR_MESSAGE);
            }
            
        
        }else if(source == Cancel)
        {
        char[] password  = passwordText.getPassword(); //getPassword() method returns the typed password as a character array
        String username =  usernameText.getText();
         
    }
    
}
