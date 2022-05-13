/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;  
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author shahadaleissa
 */
public class AdminPage extends javax.swing.JFrame {

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Appointments app= new Appointments();
    String SNI;
    String Stat;
    
    
    Connection con;
    public AdminPage() {
        initComponents();
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root", "Sh$123456");
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filterSSN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        userSsn = new javax.swing.JTextField();
        appNum = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        centerID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        filterBySSN = new javax.swing.JButton();
        dateFormat = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(193, 244, 197));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(245, 246, 240));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setText("Patients Appointments");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel2.setText("Appointment Information");

        filterSSN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Filter by SSN: ");

        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/add-2.jpg"))); // NOI18N
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Update.jpg"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/delete.jpg"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Number", "Date", "Center ID", "SSN", "Status"
            }
        ));
        jTable1.setDoubleBuffered(true);
        jTable1.setDragEnabled(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        appNum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        centerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Center ID");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("SSN");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel6.setText("Appointment Status");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel7.setText("Appointment Date");

        showButton.setText("Show Appointments");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel8.setText("Appointment Number");

        filterBySSN.setText("Filter");
        filterBySSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBySSNActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/vrc.png"))); // NOI18N

        jButton1.setText("Print Appoitment File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addGap(369, 369, 369))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(217, 217, 217)
                        .addComponent(showButton)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(filterSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filterBySSN))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centerID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(appNum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(76, 76, 76))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(dateFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(insertButton)
                            .addGap(18, 18, 18)
                            .addComponent(updateButton)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(deleteButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(104, 104, 104)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(showButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterBySSN)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(appNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(centerID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(965, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try  {
            int i = jTable1.getSelectedRow();
            
            TableModel model = jTable1.getModel();
            
            //Display Slected Row In JTexteFields
            appNum.setText(model.getValueAt(i,0).toString());
            
            java.util.Date date1= format.parse(model.getValueAt(i,1).toString());
            
            dateFormat.setDate(date1);
                    
                    centerID.setText(model.getValueAt(i,2).toString());
                    
                    userSsn.setText(model.getValueAt(i,3).toString());
                    
                    status.setText(model.getValueAt(i,4).toString());
                    
                     
                    
                   
//                                             
        } catch (ParseException ex ) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered





    }//GEN-LAST:event_jTable1MouseEntered

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        
           String insertQuery="INSERT INTO Appointments(App_Date,App_CenterID, User_SSN, completed) VALUES(?,?,?,?)";
                   
           app.setApp_num(appNum.getText());
        app.setApp_Date(format.format(dateFormat.getDate()));
        app.setApp_CenterID(centerID.getText());
        app.setUser_SSN(userSsn.getText());
        boolean completed;
        if(status.getText()=="true"){
            completed=true;
        }
        else
            completed=false;
        app.setStatus(completed);
        PreparedStatement ps;
           try {
            ps= con.prepareStatement(insertQuery);
            
            
            ps.setInt(1, Integer.valueOf(app.getApp_num()));
               ps.setString(2,app.getApp_Date());
                  ps.setInt(3, Integer.valueOf(app.getApp_CenterID()));
                     ps.setInt(4, Integer.valueOf(app.getUser_SSN()));
                      ps.setBoolean(5, app.isStatus());
                      
                          
           if(ps.executeUpdate() > 0){
             // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               getApps();
           JOptionPane.showMessageDialog(null, "Data has been inserted");
           }
           else {
                 JOptionPane.showMessageDialog(null, "Data has not been inserted");
           }
           
           
           
       
                
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data entry isn't correct try again","Data Error",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
           
         

     
       

     
    }//GEN-LAST:event_insertButtonActionPerformed

    public void getApps(){
         String query="SELECT * FROM Appointments";
       ArrayList<Appointments> appList = new ArrayList<Appointments>();

        Statement st;
        ResultSet rs;
       
        
        try {
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=st.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
            Appointments app;
             while(rs.next()){
                 app=new Appointments(rs.getString("App_num"),rs.getString("App_Date"),
                 rs.getString("App_CenterID"),rs.getString("User_SSN"),rs.getBoolean("completed"));
                 appList.add(app);
             }
            
                    } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
      getApps();
    }//GEN-LAST:event_showButtonActionPerformed

    private void centerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centerIDActionPerformed

    private void filterBySSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBySSNActionPerformed
 String query="SELECT * FROM Appointments WHERE User_SSN = "+filterSSN.getText();

        Statement st;
        ResultSet rs;
        
        try {
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(query);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
                    
                    
                    
                    } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }//GEN-LAST:event_filterBySSNActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       String DeleteQuery="DELETE FROM Appointments WHERE App_num="+appNum.getText();
       executeSQlQuery(DeleteQuery,"deleted");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String UpdateQuery="UPDATE Appointments SET App_Date=? , App_CenterID=? , User_SSN=? , completed= ? WHERE App_num=?";
        
        app.setApp_num(appNum.getText());
        app.setApp_Date(format.format(dateFormat.getDate()));
        app.setApp_CenterID(centerID.getText());
        app.setUser_SSN(userSsn.getText());
        boolean completed;
        completed = status.getText().equals("true");
        app.setStatus(completed);
        
        PreparedStatement ps;
           try {
            ps= con.prepareStatement(UpdateQuery);
            
               ps.setString(1,app.getApp_Date());
                  ps.setInt(2, Integer.valueOf(app.getApp_CenterID()));
                     ps.setInt(3, Integer.valueOf(app.getUser_SSN()));
                      ps.setBoolean(4, app.isStatus());
                      ps.setInt(5, Integer.valueOf(app.getApp_num()));
                          
           if(ps.executeUpdate() > 0){
             // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               getApps();
           JOptionPane.showMessageDialog(null, "Data has been updated");
           }
           else {
                 JOptionPane.showMessageDialog(null, "Data has not been updated");
           }
           
       
                
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try(
                FileOutputStream fos = new FileOutputStream("/Users/shahadaleissa/VRC/Project/Appointments to print/printAppointment.txt")){
      
      JFileChooser fileChooser= new JFileChooser("/Users/shahadaleissa/VRC/Project/Appointments to print/",FileSystemView.getFileSystemView());
   
      String dateT= "Appointment Date: "+ format.format(dateFormat.getDate())+"\n";
      String center = "Center ID: "+ centerID.getText()+"\n";
      String userSSN ="User SSN: "+ userSsn.getText()+"\n";
      String stat="is Completed? " + status.getText()+"\n";
      String intro="********* Appointment "+appNum.getText()+" Information *********"+"\n";
      
      
      
                    byte appNumArr[] = intro.getBytes();
                    byte dateArr[] = dateT.getBytes();
                    byte IDArr[] = center.getBytes();
                    byte SSNArr[] = userSSN.getBytes();
                    byte statArr[] = stat.getBytes();
                    byte vaccInfo[] = getVaccInfo().getBytes();
                    
                  
                    
                    
                    
       
                    fos.write(appNumArr);
              
                    fos.write(dateArr);
                
                    fos.write(IDArr);
               
                    fos.write(SSNArr);
                
                    fos.write(statArr); 
                    
                    fos.write(vaccInfo);
                    
//                 int result=  fileChooser.showOpenDialog(null);
//                  
//                  if(result==JFileChooser.APPROVE_OPTION){
//                     File f= fileChooser.getSelectedFile();
//                     
//                     Desktop d= Desktop.getDesktop();
//                     d.open(f);
                     
                     int opt = JOptionPane.showConfirmDialog(null,"Do you want to view this appointment inforamtion ? ","appointment view",JOptionPane.YES_NO_OPTION);
                     if(opt==0){
                         PrintApp a= new PrintApp();
                         a.setVisible(true);
                     }
                  
                    
                    
  }     catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
    }//GEN-LAST:event_jButton1ActionPerformed
 public void executeSQlQuery(String query, String message)
   {
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
               model.setRowCount(0);
               getApps();
               
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }
 public String getVaccInfo(){
     Statement st;
     ResultSet rs;
     String query="SELECT * FROM vaccinated WHERE SSN ="+userSsn.getText();
        try {
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(query);
            
            while(rs.next()){
                
                 SNI=String.valueOf(rs.getInt("SNI"));
                 Stat=rs.getString("Status");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
             return ("Vaccine SNI: "+SNI+"  Current Status: "+Stat);
 }
 
  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appNum;
    private javax.swing.JTextField centerID;
    private com.toedter.calendar.JDateChooser dateFormat;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton filterBySSN;
    private javax.swing.JTextField filterSSN;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showButton;
    private javax.swing.JTextField status;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userSsn;
    // End of variables declaration//GEN-END:variables
}
