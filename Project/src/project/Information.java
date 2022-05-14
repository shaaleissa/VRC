/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author M_A11
 */
public class Information extends Medical_Center {
   
    String pfname;
    String surname;
    String location;
    int phoneNumber;
    
    
     public Information( String pfname,  String surname, String location,int phoneNumber) {
        this.pfname=pfname;
        this.surname=surname;
        this.location=location;
        this.phoneNumber=phoneNumber;
     
}

    
}
