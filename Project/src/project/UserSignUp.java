/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

        

/**
 *
 * @author shahadaleissa
 */
public class UserSignUp extends javax.swing.JFrame {
    
    User user=new User();

    

   
    
    
//create a function to connect with mysql database
    Connection con;
    
    
    public UserSignUp() {
        initComponents();
     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root", "Sh$123456");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        ssnBox = new javax.swing.JTextField();
        addBox = new javax.swing.JTextField();
        lNameBox = new javax.swing.JTextField();
        nationBox = new javax.swing.JComboBox<>();
        fNameBox = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        snnLabel = new javax.swing.JLabel();
        nationLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        phoneBox = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 246, 240));

        signUp.setBackground(new java.awt.Color(255, 204, 204));
        signUp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        signUp.setText("Next");
        signUp.setToolTipText("Go to creating an account");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        ssnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnBoxActionPerformed(evt);
            }
        });

        addBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxActionPerformed(evt);
            }
        });

        lNameBox.setToolTipText("Type in your last name ");
        lNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameBoxActionPerformed(evt);
            }
        });

        nationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saudi", "Afghan\t", "Albanian", "Algerian\t", "American", "Andorran\t", "Angolan\t", "Anguillan\t", "Argentine\t", "Armenian\t", "Australian\t", "Austrian", "Azerbaijani", "Bahamian\t", "Bahraini\t", "Bangladeshi\t", "Barbadian", "Belarusian\t", "Belgian\t", "Belizean\t", "Beninese", "Bermudian\t", "Bhutanese\t", "Bolivian\t", "Botswanan\t", "Brazilian\t", "British\t", "Bruneian\t", "Bulgarian\t", "Burkinan\t", "Burmese", "Cambodian\t", "Cameroonian\t", "Canadian\t", "Cape Verdean", "Cayman Islander\t", "Central African\tChadian\t", "Chilean", "Chinese\t", "Colombian\t", "Comoran\t", "Congolese (Congo)", "Congolese (DRC)\t", "Cook Islander\t", "Costa Rican\t", "Croatian", "Cuban\t", "Cymraes\t", "Cymro\t", "Cypriot", "Czech\t \t ", "Danish\t", "Djiboutian\t", "Dominican", "Dutch", "Ecuadorean\t", "Egyptian\t", "Emirati", "Equatorial Guinean\t", "Eritrean\t", "Estonian", "Ethiopian", "Faroese\t", "Fijian\t", "Filipino\t", "Finnish", "French\t", "Gabonese\t", "Gambian\t", "Georgian\t", "German", "Ghanaian\t", "Gibraltarian\t", "Greek\t", "Greenlandic", "Grenadian\t", "Guamanian\t", "Guatemalan\t", "Guinean\t", "Guyanese", "Haitian\t", "Honduran\t", "Hong Konger\t", "Hungarian", "Icelandic\t", "Indian\t", "Indonesian\t", "Iranian", "Iraqi\t", "Irish\t", "Italian", "Ivorian", "Jamaican\t", "Japanese\t", "Jordanian", "Kazakh\t", "Kenyan\t", "Kittitian", "Kosovan\t", "Kuwaiti\t", "Kyrgyz\t ", "Lao\t", "Latvian\t", "Lebanese\t", "Liberian", "Libyan\t", "Lithuanian\t", "Luxembourger", "Macanese\t", "Macedonian\t", "Malagasy\t", "Malawian", "Malaysian\t", "Maldivian\t", "Malian\t", "Maltese", "Marshallese\t", "Martiniquais\t", "Mauritanian\t", "Mauritian", "Mexican\t", "Micronesian\t", "Moldovan\t", "Monegasque", "Mongolian\t", "Montenegrin\t", "Montserratian\t", "Moroccan", "Mosotho\t", "Mozambican\t \t ", "Namibian\t", "Nauruan\t", "Nepalese\t", "New Zealander", "Nicaraguan\t", "Nigerian\t", "Nigerien\t", "Niuean", "North Korean\t", "Northern Irish\t", "Norwegian\t ", "Omani", "Pakistani\t", "Palauan\t", "Palestinian\t", "Panamanian", "Papua New Guinean\t", "Paraguayan\t", "Peruvian\t", "Pitcairn Islander", "Polish\t", "Portuguese\t", "Prydeinig\t", "Puerto Rican", "Qatari", "Romanian\t", "Russian\t", "Rwandan", "Salvadorean\t", "Sammarinese\t", "Samoan\t", "Sao Tomean", "Scottish\t", "Senegalese\t", "Serbian", "Sierra Leonean\t", "Singaporean\t", "Slovak", "Slovenian\t", "Somali\t", "South African", "South Korean\t", "Spanish\t", "Sri Lankan", "St Helenian\t", "St Lucian\t", "Sudanese", "Surinamese\t", "Swazi\t", "Swedish\t", "Swiss", "Syrian\t \t \t ", "Taiwanese\t", "Tajik\t", "Tanzanian\t", "Thai", "Togolese\t", "Tongan\t", "Trinidadian\t", "Tristanian", "Tunisian\t", "Turkish\t \t \t ", "Ugandan\t", "Ukrainian\t", "Uruguayan\t", "Uzbek", "Venezuelan\t", "Vietnamese", "Vincentian\t \t \t ", "Wallisian\t", "Welsh", "Yemeni", "Zambian\t", "Zimbabwean", " " }));
        nationBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nationBoxItemStateChanged(evt);
            }
        });
        nationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationBoxActionPerformed(evt);
            }
        });

        fNameBox.setToolTipText("Type in your first name");
        fNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameBoxActionPerformed(evt);
            }
        });

        fNameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        fNameLabel.setText("First Name");

        lNameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lNameLabel.setText("Last Name");

        snnLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        snnLabel.setText("Username/SSN/Iqama");

        nationLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        nationLabel.setText("Nationality");

        addLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        addLabel.setText("Address");

        dateLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        dateLabel.setText("Date of birth");

        genderLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        genderLabel.setText("Gender");

        genderGroup.add(maleButton);
        maleButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        genderGroup.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        femaleButton.setText("Female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        phoneBox.setToolTipText("Enter your phone number");
        phoneBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneBoxActionPerformed(evt);
            }
        });

        phoneLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        phoneLabel.setText("Phone Number");

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
                .addGap(14, 14, 14)
                .addComponent(backButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(253, 196, 244));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/shahadaleissa/Downloads/logo_2_100x100.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 13)); // NOI18N
        jLabel3.setText("User information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nationLabel)
                            .addComponent(snnLabel)
                            .addComponent(lNameLabel)
                            .addComponent(fNameLabel)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nationBox, 0, 222, Short.MAX_VALUE)
                            .addComponent(ssnBox)
                            .addComponent(lNameBox)
                            .addComponent(fNameBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(genderLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(phoneLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addComponent(femaleButton))
                                    .addComponent(addBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneBox, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(dateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(signUp))
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fNameLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNameLabel))))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(maleButton)
                            .addComponent(femaleButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snnLabel))
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationLabel))
                .addGap(13, 13, 13)
                .addComponent(signUp)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBoxActionPerformed

    private void ssnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnBoxActionPerformed

    private void lNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameBoxActionPerformed

    private void fNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameBoxActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void phoneBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneBoxActionPerformed


    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed

        user.setfName(fNameBox.getText());
        user.setlName(lNameBox.getText());
        user.setAdd(addBox.getText());
        user.setNationality((String) nationBox.getSelectedItem());
    
   
       if(maleButton.isSelected())
           user.setGender("M");
        if(femaleButton.isSelected())
          user.setGender("F");
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        user.setBDate(dateFormat.format(dateChooser.getDate()));
       user.setPhoneNum(phoneBox.getText());
        user.setSSN(ssnBox.getText());
        
        if(user.getSSN().isEmpty()|| user.getSSN()==null){
             JOptionPane.showMessageDialog(null, "SSN is empty, try again");
        }
        if(user.getSSN().length()<10 ){
                  JOptionPane.showMessageDialog(null, "SSN is too short, try again");
        }
        if(user.getSSN().length()>10){
             JOptionPane.showMessageDialog(null, "SSN is too long, try again");
        }
        if(user.getPhoneNum().length()>10){
              JOptionPane.showMessageDialog(null, "phone number is too long, try again");
        }
        if(user.getPhoneNum().length()<10){
             JOptionPane.showMessageDialog(null, "phone number is too short, try again");
        }
        if(user.getPhoneNum().isEmpty() || user.getPhoneNum()==null){
            JOptionPane.showMessageDialog(null, "phone number is empty, try again");
        }
        if(user.getfName().isEmpty()){
             JOptionPane.showMessageDialog(null, "First name is empty, try again");
        }
        if(user.getlName().isEmpty()){
             JOptionPane.showMessageDialog(null, "Last name is empty, try again");
        }
        if(user.getAdd().isEmpty()){
            JOptionPane.showMessageDialog(null, "Address is empty, try again");
            
        }
        if(user.getNationality().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nationality is empty, try again");
            
        }
        if(user.getGender().isEmpty() || user.getGender()==null){
            JOptionPane.showMessageDialog(null,"Gender isn't selected, try again");
        }
     
        PreparedStatement ps;
        String SignInQuery= "INSERT INTO User (Fname,Lname,Address,Nationality,Gender,BDate,phone_num,SSN) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            ps= con.prepareStatement(SignInQuery);
            
            ps.setString(1,user.getfName());
               ps.setString(2,user.getlName());
                  ps.setString(3,user.getAdd());
                     ps.setString(4,user.getNationality());
                      ps.setString(5,user.getGender());
                           ps.setString(6,user.getBDate());
                              ps.setString(7,user.getPhoneNum());
                                 ps.setString(8,user.getSSN());
           if(ps.executeUpdate() > 0){
               AccountSignUp a= new AccountSignUp();
               a.setVisible(true);
               this.setVisible(false);
          
              
           }
           
           else{
                JOptionPane.showMessageDialog(null, "Error ocurred");}
            
        } catch (SQLException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
    }//GEN-LAST:event_signUpActionPerformed

   
    
    
    private void nationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationBoxActionPerformed
        
    }//GEN-LAST:event_nationBoxActionPerformed

    private void nationBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nationBoxItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED)
            user.setNationality((String) nationBox.getSelectedItem());
            
    }//GEN-LAST:event_nationBoxItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
  SignIn u= new SignIn();
       u.setVisible(true);
       this.setVisible(false);    }//GEN-LAST:event_backButtonActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addBox;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton backButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField fNameBox;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lNameBox;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JComboBox<String> nationBox;
    private javax.swing.JLabel nationLabel;
    private javax.swing.JTextField phoneBox;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel snnLabel;
    private javax.swing.JTextField ssnBox;
    // End of variables declaration//GEN-END:variables
}
