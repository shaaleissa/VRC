/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/**
 *
 * @author shahadaleissa
 */
public class AccountSignUp extends javax.swing.JFrame {
    
    account user= new account();
    private boolean hasSpecial;
    private boolean hasUpper;
    private boolean hasLower;
    private boolean hasNumbers;
    private boolean length;
    private Set<Character> set = new HashSet<Character>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                          '*', '(', ')', '-', '+'));
    private boolean validPass;
     private boolean validUsername;
       private boolean validEmail;
     
     SignIn login= new SignIn();
    

       Connection con;
    public AccountSignUp() {
        initComponents();
       
     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root", "Sh$123456");
              
        } catch (SQLException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnBox = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        EmailBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JLabel();
        lengthNum = new javax.swing.JLabel();
        specialChar = new javax.swing.JLabel();
        PINBox = new javax.swing.JPasswordField();
        passBox = new javax.swing.JPasswordField();
        PINLabel = new javax.swing.JLabel();
        pinText = new javax.swing.JLabel();
        pinText1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 246, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/shahadaleissa/Downloads/logo_2_100x100.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 13)); // NOI18N
        jLabel3.setText("Account Information");

        ssnLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        ssnLabel.setText("Username/SSN");

        ssnBox.setToolTipText("Enter SSN/Iqama");

        emailLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        emailLabel.setText("Email");

        passLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        passLabel.setText("Password");

        EmailBox.setToolTipText("Enter Email");
        EmailBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        combo.setForeground(java.awt.Color.red);
        combo.setText("Combonation of upper and lower case letters");

        lengthNum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lengthNum.setForeground(java.awt.Color.red);
        lengthNum.setText("has numbers and length is > 8");

        specialChar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        specialChar.setForeground(java.awt.Color.red);
        specialChar.setText("Has special characters");

        PINBox.setToolTipText("Enter Password");

        passBox.setToolTipText("Enter Password");

        PINLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        PINLabel.setText("PIN");

        pinText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        pinText.setText("4 numbers only");

        pinText1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        pinText1.setText("Password Conditions");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel4.setText("ex username@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(ssnLabel)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(PINLabel)
                                                .addGap(57, 57, 57))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(passLabel)
                                                .addGap(42, 42, 42))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(emailLabel)
                                                .addGap(56, 56, 56)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PINBox, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ssnBox)
                                        .addComponent(passBox, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                        .addComponent(EmailBox)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pinText)
                                .addGap(99, 99, 99)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo)
                                    .addComponent(lengthNum)
                                    .addComponent(pinText1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(specialChar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssnLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(pinText1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lengthNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specialChar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PINBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PINLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pinText)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))))
        );

        jPanel2.setBackground(new java.awt.Color(193, 244, 197));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailBoxActionPerformed
public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
            user.setUserName(ssnBox.getText());
            user.setEmail(EmailBox.getText());
            user.setPassword(passBox.getText());
            user.setPIN(PINBox.getText());
            
            for(char i : passBox.getPassword()){
                
                if (Character.isLowerCase(i))
                    hasLower = true;
                if (Character.isUpperCase(i))
                    hasUpper = true;
                if (Character.isDigit(i))
                    hasNumbers = true;
                if (set.contains(i))
                    hasSpecial = true;
            }
                   if(hasLower&& hasUpper)
                combo.setForeground(Color.green);
            else
                 combo.setForeground(Color.red);
                
            if(user.getPassword().length()>8&& hasNumbers){
                length=true;
               lengthNum.setForeground(Color.green);
            }
            else
                 lengthNum.setForeground(Color.red);
                
            if(hasSpecial)
               specialChar.setForeground(Color.green);
            else
                 specialChar.setForeground(Color.red);
                
            
            if( hasLower&&hasUpper&&hasNumbers&&length&&hasSpecial)
                validPass=true;
            else
                  validPass=false;
            
            if(isValid(user.getEmail())){
                validEmail=true;
            }
       
            PreparedStatement ps;
            String checkUsernameQuery="SELECT SSN FROM User WHERE SSN = ?";
            ResultSet rs;
                try {
            ps= con.prepareStatement(checkUsernameQuery);
            ps.setString(1, user.getUserName());
            rs=ps.executeQuery();
            
            if(rs.next())
                validUsername=true;
            else
                validUsername=false;
            
        
                
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
      if(validUsername&&validPass&&validEmail){
             PreparedStatement ps1;
             String createAccountQuery="INSERT INTO Account (userName,password,Email,PIN,accountType) VALUES(?,?,?,?,?)";
             
                try {
                    ps1= con.prepareStatement(createAccountQuery);
                    
                    ps1.setString(1,user.getUserName());
                    ps1.setString(2,user.getPassword());
                    ps1.setString(3, user.getEmail());
                    ps1.setString(4, user.getPIN());
                    ps1.setString(5, "User");
                    
               
                    
                       if(ps1.executeUpdate()>0){
                           JOptionPane.showMessageDialog(null, "Account has been created, you can login now");
                           login.setVisible(true);
                       this.setVisible(false);
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "Error, Try Again");
                               
                               }
                       
                    
                } catch (SQLException ex) {
                    Logger.getLogger(AccountSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
      } else if(validPass&&validEmail) {
          JOptionPane.showMessageDialog(null, "error with username");
      }
      else if(validUsername&&validEmail){
           JOptionPane.showMessageDialog(null, "error with password");  
      }
      else if(validUsername&&validPass){
           JOptionPane.showMessageDialog(null, "error with email");  
      }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       UserSignUp u= new UserSignUp();
       u.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailBox;
    private javax.swing.JPasswordField PINBox;
    private javax.swing.JLabel PINLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel combo;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lengthNum;
    private javax.swing.JPasswordField passBox;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel pinText;
    private javax.swing.JLabel pinText1;
    private javax.swing.JLabel specialChar;
    private javax.swing.JTextField ssnBox;
    private javax.swing.JLabel ssnLabel;
    // End of variables declaration//GEN-END:variables
}
