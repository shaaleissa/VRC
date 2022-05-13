/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author maryam
 */
public class account extends User{

    public account( String password) {
      
        this.password = password;
       
    }
     private String userName;


    private String accountType;
    private String password;
    private String email;
    private String PIN;

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

      //constructor
    public account() {
    }
     //constructor
    public account(String userName, String password, String email, String accountType) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.accountType=accountType;
    }
      // setter & getter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public String accountType() {
        return accountType;
    }

    public void setaccountType(String accountType) {
        this.accountType = accountType;
    }
    
 
    
    
}
