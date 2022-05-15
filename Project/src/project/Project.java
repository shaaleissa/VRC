/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahadaleissa
 */
public class Project {

    
    public static void main(String[] args) {
      try{
          new SignIn().setVisible(true);
      }
      catch(Exception e){
          e.printStackTrace();
      }
      finally{
          try {
              SignIn.con.close();
          } catch (SQLException ex) {
              Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
                
                
    

}
}

     
 
