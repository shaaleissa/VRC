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

public class Healthcare_Professionals extends Medical_Center {

    public Healthcare_Professionals(String pfname, String surname, String location, int phoneNumber) {
        this.pfname = pfname;
        this.surname = surname;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
 private String medId;
    private String centerName;
    private String pfname;
    private String surname;
    private String location;
    int phoneNumber;
    public String getMedId() {
        return medId;
    }

    public void setMedId(String medId) {
        this.medId = medId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getPfname() {
        return pfname;
    }

    public void setPfname(String pfname) {
        this.pfname = pfname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public Healthcare_Professionals(){
       
   }
    
}
  
   
 

 
