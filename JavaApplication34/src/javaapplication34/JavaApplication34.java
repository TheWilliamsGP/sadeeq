/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.util.regex.*;
import javax.swing.*;
/**
 *
 * @author sadeeqwilliams
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
        private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        T_UserName = new javax.swing.JTextField();
        jPassword1 = new javax.swing.JPasswordField();
        ulab = new javax.swing.JLabel();
        jReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        Jlogin.setText("Login");

        jLabel2.setText("Password");

        jLabel1.setText("Username");

        T_UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T_UserNameKeyReleased(evt);
            }
        });

        ulab.setText("jLabel3");
        ulab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ulabKeyReleased(evt);
            }
        });

        jReg.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jlogin)
                        .addGap(136, 136, 136)
                        .addComponent(jReg)
                        .addGap(329, 329, 329))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPassword1)
                            .addComponent(T_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(ulab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ulab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>                        

    private void ulabKeyReleased(java.awt.event.KeyEvent evt) {                                 
        String PATTERN ="^[a-zA-Z0-9](0,30)[,][@] [!][a-zA-Z0-9](0,10)$";
       Pattern patt=Pattern.compile(PATTERN);
       Matcher match=patt.matcher(T_UserName.getText());
       if(!match.matches()){
           ulab.setText("password incorrect");
       }else{
           ulab.setText(null);
    }                                
    
    private void T_UserNameKeyReleased(java.awt.event.KeyEvent evt) {                                       
        
    }                                      
    
}

}public boolean checkValidUsername(String username){
       String Uname =  "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$;" //"^[A-Za-z]\\w{5,29}$";  //"^[a-zA-Z0-9](0,30)[,][@] [!][a-zA-Z0-9](0,10)$";
       Pattern patt=Pattern.compile(Uname);
      // if(usernameText == null){
           //return false;
       //}
       
       Matcher match = patt.matcher((CharSequence) usernameText);
      if(!match.matches()){
             JOptionPane.showMessageDialog(null,"correct usnerame ");
             return true;
         }else{
             JOptionPane.showMessageDialog(null,"Incorrect usnerame","error message",JOptionPane.ERROR_MESSAGE);
         }
       //return match.matches();
       return false;
        
boolean isUsername = name.matches();
    jsee.setText(Boolean.toString(isUsername));
    }          
    }
 }
     public boolean checkValidUsername(String Username)
    {
        int upC = 0; 
        int lwC = 0; 
        int num = 0;
        int spC = 0;
        //This function returns different values based on what is missing in the parameter 'password'
        if(Username.length < 8)
        {
            return false;
        }
        for(int i = 0; i < Username.length; i++)
        {
            char c = Username[i];
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





public static boolean valUsername(String Username)
{
    if (Username.length() > 5)
    {
        if(checkUser(username))
        {
            return true;
        }
        else 
        {
        return false;
        }
    }
    else
    {
    JOptionPane.showMessageDialog(null,"Invalid");
    }
}



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


{
            message = " username and password is valid.";
        }
        else
        {
            JOptionPane.showMessageDialog(null,"incorrect username or password");
        }

        Condition.setText(message);

        Arrays.fill(password, '0'); // Zero out the password, for security