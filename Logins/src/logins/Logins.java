/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins;

/**
 *
 * @author sadeeqwilliams
 */
public class Logins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

    public String username;
    public String password;
    
    public Logins(){
        
    }
    public void doLogin(String username, String password){
        String response = registerUser(username, password);
        System.out.println(response);
        response = returnLoginStatus();
        System.out.println(response);
    }
    
    public String returnLoginStatus(){
        String response = "A failed login";
        if (loginUser(this.username, this.password))
                return "A succesful login";
        return response;
    }
    
    public boolean loginUser(String _username, String _password){
        if (this.password == null || this.username == null)
            return false;
        
        return (this.password.equals(_password) && this.username.equals(_username));
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
        boolean contains_upper = false;
        boolean contains_lower = false;
        boolean contains_digit = false;
        boolean contains_special = false;
        for (int i=0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i)))
               contains_upper = true;
   
            if (Character.isLowerCase(word.charAt(i)))
               contains_lower = true;
            
            if (Character.isDigit(word.charAt(i)))
                contains_digit = true;
            
            if ( ! ((Character.getNumericValue(word.charAt(i)) > -1) && 
                    (Character.getNumericValue(word.charAt(i)) < 36)))
                contains_special = true;
        }
        return (contains_upper && contains_lower && contains_digit && contains_special);
    }
}

