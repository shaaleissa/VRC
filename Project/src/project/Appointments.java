/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author shahadaleissa
 */
public class Appointments {

    public Appointments() {
    }

    public Appointments(String App_num, String App_Date, String App_CenterID, String User_SSN, boolean Status) {
        this.App_num = App_num;
        this.App_Date = App_Date;
        this.App_CenterID = App_CenterID;
        this.User_SSN = User_SSN;
        this.Status = Status;
    }

    public String getApp_num() {
        return App_num;
    }

    public void setApp_num(String App_num) {
        this.App_num = App_num;
    }

    public String getApp_Date() {
        return App_Date;
    }

    public void setApp_Date(String App_Date) {
        this.App_Date = App_Date;
    }

    public String getApp_CenterID() {
        return App_CenterID;
    }

    public void setApp_CenterID(String App_CenterID) {
        this.App_CenterID = App_CenterID;
    }

    public String getUser_SSN() {
        return User_SSN;
    }

    public void setUser_SSN(String User_SSN) {
        this.User_SSN = User_SSN;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    private String App_num;
    private String App_Date;
    private String App_CenterID;
    private String User_SSN;
    private boolean Status;
    
}
