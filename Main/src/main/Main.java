/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.HashMap;
/**
 *
 * @author sadeeqwilliams
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                IDandPasswords idandPasswords = new IDandPasswords();

				

		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());


    }
    
}
