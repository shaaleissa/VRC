
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @Noorah
 */
public class Appointment extends javax.swing.JFrame {

    Connection con;
    SignIn acc = new SignIn();
    
    private String currentUser= SignIn.acc.getUserName();
    int SNI = (int)(Math.random()*(999999-100000+1)+100000);
    private boolean validUsername;
        DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
   
    
    public Appointment() {
      
        Createconnection();
         
        username.setText(currentUser);
    }
     void Createconnection(){
         try {
             initComponents();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root", "Sh$123456");
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        profileIcon = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        appointment = new javax.swing.JButton();
        booking = new javax.swing.JButton();
        contacts = new javax.swing.JButton();
        FAQ = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        choosecity = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        choosedate = new javax.swing.JLabel();
        vd = new javax.swing.JLabel();
        dose1 = new javax.swing.JRadioButton();
        dose2 = new javax.swing.JRadioButton();
        dose3 = new javax.swing.JRadioButton();
        okbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        centerid = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        centerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 246, 240));

        jPanel2.setBackground(new java.awt.Color(193, 244, 204));

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/profile.png"))); // NOI18N

        home.setBackground(new java.awt.Color(244, 245, 239));
        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        appointment.setBackground(new java.awt.Color(244, 245, 239));
        appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 10)); // NOI18N
        appointment.setForeground(new java.awt.Color(51, 51, 51));
        appointment.setText("<html>\nMy \nAppointments");
        appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentActionPerformed(evt);
            }
        });

        booking.setBackground(new java.awt.Color(244, 245, 239));
        booking.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 10)); // NOI18N
        booking.setForeground(new java.awt.Color(51, 51, 51));
        booking.setText("<html>\nBook An  \nAppointment");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        contacts.setBackground(new java.awt.Color(244, 245, 239));
        contacts.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        contacts.setForeground(new java.awt.Color(51, 51, 51));
        contacts.setText("<html>\nHealthcare\nContacts");
        contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsActionPerformed(evt);
            }
        });

        FAQ.setBackground(new java.awt.Color(244, 245, 239));
        FAQ.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        FAQ.setForeground(new java.awt.Color(51, 51, 51));
        FAQ.setText("FAQ's");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(244, 245, 239));
        logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(51, 51, 51));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contacts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FAQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(profileIcon))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(profileIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Book an appointment");

        choosecity.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        choosecity.setText("Choose your city");

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dammam", "Khobar", "Dhahran" }));
        city.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        choosedate.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        choosedate.setText("Date");

        vd.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        vd.setText("Vaccine Dose");

        buttonGroup1.add(dose1);
        dose1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dose1.setText("Dose 1");
        dose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dose2);
        dose2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dose2.setText("Dose 2");
        dose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(dose3);
        dose3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dose3.setText("Dose 3");
        dose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose3ActionPerformed(evt);
            }
        });

        okbutton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        okbutton.setText("Ok");
        okbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        username.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 10)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/vrc.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Center ID");

        centerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centeridActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Center Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city, 0, 189, Short.MAX_VALUE)
                            .addComponent(choosecity)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(choosedate)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dose1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dose2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dose3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(centerid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(centerName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel6)))
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(okbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(124, 124, 124)
                                        .addComponent(vd))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(vd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dose1)
                        .addComponent(dose2)
                        .addComponent(dose3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(okbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(centerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(centerName))))
                        .addGap(150, 150, 150))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(choosecity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choosedate)
                        .addGap(18, 18, 18)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbuttonActionPerformed

      
          try{
        String ava="SELECT * FROM USER WHERE SSN=?";
        PreparedStatement A= con.prepareStatement(ava);
       A.setString(1,username.getText());
        ResultSet rs =A.executeQuery();
           if(rs.next()==false)
        {
            JOptionPane.showMessageDialog(this,"User name is not available!");
        }
      }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        try {
           
      String sql="INSERT INTO appointments(App_Date,App_CenterID,User_SSN) VALUES (?,?,?)";
      PreparedStatement stmt=con.prepareStatement(sql);
     
      stmt.setString(1, formatDate.format(date.getDate()));
      stmt.setString(2, centerid.getSelectedItem().toString());
      stmt.setString(3,username.getText());  
 
if(stmt.executeUpdate()==1)
{
    if(!acc.validUser()){
    try{
        String vaccInsert= "INSERT INTO Vaccinated VALUES (?,?,?)";
        PreparedStatement ps= con.prepareStatement(vaccInsert);
        
        ps.setString(1, username.getText());
        ps.setInt(2,(int)SNI);
        ps.setString(3, Status());
        if(ps.executeUpdate()==1)
      JOptionPane.showMessageDialog(this, "You have booked successfully ");
    }
    catch(SQLException ex){
        ex.printStackTrace();
    }
                      }
    else{
        String vaccUpdate="UPDATE Vaccinated SET SNI=? , Status=? WHERE SSN= ?";
        PreparedStatement ps1= con.prepareStatement(vaccUpdate);
        try{
        ps1.setInt(1,(int)SNI);
        ps1.setString(2, Status());
        ps1.setString(3,username.getText());
            if(ps1.executeUpdate()==1)
      JOptionPane.showMessageDialog(this, "You have booked successfully ");
        }
        
         catch(Exception ex)
        {
            ex.printStackTrace();}
    }
                                }
        }
      catch(Exception ex)
        {
            ex.printStackTrace();
     JOptionPane.showMessageDialog(null,ex);
        }   
          
    }//GEN-LAST:event_okbuttonActionPerformed
     
     public String Status(){
            if(dose1.isSelected()){
                return "once Vaccinated";
            }else if(dose2.isSelected()){
                return "twice Vaccinated";
            }else 
                return "fully Vaccinated";
        }
    
    private void dose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose1ActionPerformed
     
    }//GEN-LAST:event_dose1ActionPerformed

    private void dose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose2ActionPerformed
      
    }//GEN-LAST:event_dose2ActionPerformed

    private void dose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose3ActionPerformed
       
    }//GEN-LAST:event_dose3ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
  
        centerid.setModel(new DefaultComboBoxModel());
       if(city.getSelectedItem()=="Dammam"){
                  String IDQuery="SELECT CenterID,Centername FROM Medical_Center WHERE location = ?";
           PreparedStatement st;
           ResultSet rs;
           
           try {
               st=con.prepareStatement(IDQuery);
               st.setString(1, "Dammam");
               rs=st.executeQuery();
                centerid.removeAllItems();
               while(rs.next()){
                   centerid.addItem(rs.getString("CenterID"));
                   centerName.setText(rs.getString("Centername"));
               }
           } catch (SQLException ex) {
               Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
       }
       if(city.getSelectedItem()=="Khobar"){
          
                     String IDQuery="SELECT CenterID,Centername FROM Medical_Center WHERE location = ?";
           PreparedStatement st;
           ResultSet rs;
           
           try {
               st=con.prepareStatement(IDQuery);
               st.setString(1, "Khobar");
               rs=st.executeQuery();
                centerid.removeAllItems();
               while(rs.next()){
                   centerid.addItem(rs.getString("CenterID"));
                   centerName.setText(rs.getString("Centername"));
               }
           } catch (SQLException ex) {
               Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       
           
       }
       if(city.getSelectedItem()=="Dhahran"){
               String IDQuery="SELECT CenterID FROM Medical_Center WHERE location = ?";
           PreparedStatement st;
           ResultSet rs;
           
           try {
               st=con.prepareStatement(IDQuery);
               st.setString(1, "Dhahran");
               rs=st.executeQuery();
                
                centerid.removeAllItems();
               while(rs.next()){
                   centerid.addItem(rs.getString("CenterID")); 
                  
               }
              
               
           } catch (SQLException ex) {
               Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
      
       
        
    }//GEN-LAST:event_cityActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
       
    }//GEN-LAST:event_usernameActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);
        HomePage h=new HomePage();
        h.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentActionPerformed
        this.setVisible(false);
        AppFrame a= new AppFrame();
        a.setVisible(true);
    }//GEN-LAST:event_appointmentActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        if(acc.validUser()){
            this.setVisible(false);
            SymptomAnalyzer a=new SymptomAnalyzer();
            a.setVisible(true);
        }
        else{
            this.setVisible(false);
            Vaccine a=new Vaccine();
            a.setVisible(true);}
    }//GEN-LAST:event_bookingActionPerformed

    private void contactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsActionPerformed
        this.setVisible(false);
        HCP c=new HCP();
        c.setVisible(true);
    }//GEN-LAST:event_contactsActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        this.setVisible(false);
        FAQFrame faq=new FAQFrame();
        faq.setVisible(true);
    }//GEN-LAST:event_FAQActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        SignIn l=new SignIn();
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void centeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centeridActionPerformed

           String IDQuery="SELECT Centername FROM Medical_Center WHERE CenterID = ?";
           PreparedStatement st;
           ResultSet rs;
           
           try {
               st=con.prepareStatement(IDQuery);
               st.setString(1, centerid.getSelectedItem().toString());
               rs=st.executeQuery();
                
                
               while(rs.next()){
                   centerName.setText(rs.getString("Centername"));
                  
               }
              
               
           } catch (SQLException ex) {
               Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
           }
           
   
        
        
    }//GEN-LAST:event_centeridActionPerformed
    
   
    
    
    public  String getdate()
    {
      return
       formatDate.format(date.getDate());
    }
    
    
    public String getusername()
    {
        return 
        username.getText();
    }
  
    
   
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FAQ;
    private javax.swing.JButton appointment;
    private javax.swing.JButton booking;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel centerName;
    private javax.swing.JComboBox<String> centerid;
    private javax.swing.JLabel choosecity;
    private javax.swing.JLabel choosedate;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JButton contacts;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JRadioButton dose1;
    private javax.swing.JRadioButton dose2;
    private javax.swing.JRadioButton dose3;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton okbutton;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JTextField username;
    private javax.swing.JLabel vd;
    // End of variables declaration//GEN-END:variables
}
