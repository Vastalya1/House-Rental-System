
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AVS Vastalya
 */
public class OWNER_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form OWNER_WINDOW
     */
    public OWNER_WINDOW() {
        initComponents();
        
        // set border to the app name lable
       Border panel_title_border =  BorderFactory.createMatteBorder(0,0,3,0, new Color(235,125,22));
        jPanel_title.setBorder(panel_title_border);
        
        //set border to the jbuttons
        Border button_border =  BorderFactory.createMatteBorder(2,2,2,2, new Color(255,255,255));
        jButton_add_owner.setBorder(button_border);
        jButton_edit_owner.setBorder(button_border);
        jButton_remove_owner.setBorder(button_border);
        jButton_refresh_owner.setBorder(button_border);
        jButton_owner_properties.setBorder(button_border);
        //populate the jtable with the owner data
        fillJtableWithOwnerData();
    }
    
    //we willl create a function to populate the jTable with all the owner data using the arraylist
    //after that when the user slect an owner from the jTable all the information will be displayed in the jtextfields
    
    public void fillJtableWithOwnerData()
    {
        P_OWNER owner= new P_OWNER();
        ArrayList<P_OWNER> ownersList = owner.ownersList();
        
        //the jtable columns
        String[] colNames = {"ID","First Name","Last Name","Phone No.","Email","Address"};
        
        //the jtable row
        //ownersList.size()= the size of the arrayList
        //6= no. of columns "ID","First Name","Last Name","Phone No.","Email","Address"
        Object[][] rows = new Object[ownersList.size()][6];
        
        //add data from the list to the rows
        for(int i=0; i< ownersList.size(); i++)
        {
            rows[i][0]= ownersList.get(i).getId();
            rows[i][1]= ownersList.get(i).getFristName();
            rows[i][2]= ownersList.get(i).getLastName();
            rows[i][3]= ownersList.get(i).getPhone();
            rows[i][4]= ownersList.get(i).getEmail();
            rows[i][5]= ownersList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
        //set row height
        jTable1.setRowHeight(30);
        
        //change the table slected background
        jTable1.setSelectionBackground(new Color(255,153,153));
        //change the width of the column
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_firstname = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton_edit_owner = new javax.swing.JButton();
        jButton_add_owner = new javax.swing.JButton();
        jButton_remove_owner = new javax.swing.JButton();
        jButton_refresh_owner = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_owner_properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jPanel_title.setBackground(new java.awt.Color(247, 197, 102));

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(108, 3, 69));
        jLabel_title.setText("OWNERS");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("ID: ");

        jTextField_firstname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstnameActionPerformed(evt);
            }
        });

        jTextField_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextArea_address.setColumns(20);
        jTextArea_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_address);

        jButton_edit_owner.setBackground(new java.awt.Color(59, 131, 238));
        jButton_edit_owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_edit_owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_owner.setText("EDIT");
        jButton_edit_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_ownerActionPerformed(evt);
            }
        });

        jButton_add_owner.setBackground(new java.awt.Color(30, 169, 77));
        jButton_add_owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_owner.setText("ADD");
        jButton_add_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_ownerActionPerformed(evt);
            }
        });

        jButton_remove_owner.setBackground(new java.awt.Color(255, 80, 37));
        jButton_remove_owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_remove_owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove_owner.setText("REMOVE");
        jButton_remove_owner.setToolTipText("");
        jButton_remove_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_ownerActionPerformed(evt);
            }
        });

        jButton_refresh_owner.setBackground(new java.awt.Color(252, 172, 51));
        jButton_refresh_owner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh_owner.setText("REFRESH");
        jButton_refresh_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_ownerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Last Name:");

        jTextField_lastname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Phone No.: ");

        jTextField_phone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Email:");

        jTextField_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_owner_properties.setBackground(new java.awt.Color(123, 18, 123));
        jButton_owner_properties.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_owner_properties.setForeground(new java.awt.Color(255, 255, 255));
        jButton_owner_properties.setText("Owner Properties");
        jButton_owner_properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_owner_propertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_owner_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_add_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_edit_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton_remove_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_refresh_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(9, 9, 9)
                                .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(8, 8, 8)
                                    .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_refresh_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_owner_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_edit_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_ownerActionPerformed
        //edit the owner data
        
        String fname= jTextField_firstname.getText();
        String lname= jTextField_lastname.getText();
        String phone = jTextField_phone.getText();
        String email = jTextField_email.getText();
        String address= jTextArea_address.getText();
        
        P_OWNER owner = new P_OWNER();
        
        try
        {
            int ownerId= Integer.valueOf(jTextField_id.getText());
                //before editing owner data we need to check the input field is empty or not
            //required data -> first name, last name, phone, email and address

            if(fname.trim().equals("") || lname.trim().equals("") || email.trim().equals("") || phone.trim().equals("") || address.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the required owner information", "edit Owner data", 2);
            }
            else
            {
                if(owner.editOwnerData(new P_OWNER(ownerId, fname, lname, phone, email, address)))
                {
                    JOptionPane.showMessageDialog(null, "Owner data Updated", "Edit Owner data", 1);
                } else
                {
                    JOptionPane.showMessageDialog(null, "OWNER data Not Updated", "Edit Owner data", 2);
                }
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "enter a Vlid Owner ID", "Invalid ID", 2);
        }
        
    
        
        
    }//GEN-LAST:event_jButton_edit_ownerActionPerformed

    private void jButton_add_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_ownerActionPerformed
        
        //add a new owner
        
        //get the owner data from the tet fields
        String fname= jTextField_firstname.getText();
        String lname= jTextField_lastname.getText();
        String phone = jTextField_phone.getText();
        String email = jTextField_email.getText();
        String address= jTextArea_address.getText();
        
        P_OWNER owner = new P_OWNER();
        //before inserting a new owner we need to check the input field is empty or not
        //required data -> first name, last name, phone, email and address
        
        if(fname.trim().equals("") || lname.trim().equals("") || email.trim().equals("") || phone.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the required owner information", "Add Owner", 2);
        }
        else
        {
            if(owner.addNewOwner(new P_OWNER(0, fname, lname, phone, email, address)))
            {
                JOptionPane.showMessageDialog(null, "New Owner Added To the System", "Add Owner", 1);
            } else
            {
                JOptionPane.showMessageDialog(null, "OWNER not added to the system", "Add Owner", 2);
            }
        }
        
         
        
    }//GEN-LAST:event_jButton_add_ownerActionPerformed

    private void jButton_remove_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_ownerActionPerformed
        //deleting the selected owner from the system
        
        
        
        P_OWNER owner = new P_OWNER();
  
        try{
            int ownerId= Integer.valueOf(jTextField_id.getText());
            if(jTextField_id.getText().trim().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter the Owner ID", "empty ID", 2);
                }
            else
                {
                    //show a confirmation message before deleting the type
                    int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Owner?", "delete owner", JOptionPane.YES_NO_OPTION);

                    if(yes_or_no == JOptionPane.YES_OPTION)
                    {
                        if(owner.deleteOwnerData(ownerId))
                        {
                            JOptionPane.showMessageDialog(null, "Owner deleted", "delete Owner", 1);
                            
                            //clear the text fields after the delete
                            jTextField_id.setText("");
                            jTextField_firstname.setText("");
                            jTextField_lastname.setText("");
                            jTextField_phone.setText("");
                            jTextField_email.setText("");
                            jTextArea_address.setText("");
                            
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "operation failed", "delete Owner", 2);
                            }
                    }
                }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "enter a Vlid Owner ID", "Invalid ID", 2);
        }
            
                
                    
            
            
        

    }//GEN-LAST:event_jButton_remove_ownerActionPerformed

    private void jButton_refresh_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_ownerActionPerformed
        //call the fill jTable function to show the new data in the jtable
        fillJtableWithOwnerData();
        
    }//GEN-LAST:event_jButton_refresh_ownerActionPerformed

    private void jTextField_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_firstnameActionPerformed

    private void jTextField_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lastnameActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    
    //get owner data on jTabel mouse clicked
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int SelectedRowIndex= jTable1.getSelectedRow();
        jTextField_id.setText(jTable1.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_firstname.setText(jTable1.getValueAt(SelectedRowIndex, 1).toString());
        jTextField_lastname.setText(jTable1.getValueAt(SelectedRowIndex, 2).toString());
        jTextField_phone.setText(jTable1.getValueAt(SelectedRowIndex, 3).toString());
        jTextField_email.setText(jTable1.getValueAt(SelectedRowIndex, 4).toString());
        jTextArea_address.setText(jTable1.getValueAt(SelectedRowIndex, 5).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_owner_propertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_owner_propertiesActionPerformed
        
        //here we will show the selected owner properties in a new form
        //we will do it later when we add some properties 

        try
        {
            
            int SelectedRowIndex= jTable1.getSelectedRow();
            int id =Integer.valueOf(jTable1.getValueAt(SelectedRowIndex, 0).toString());
            //set the owner id
            OWNER_PROPERTIES_FORM ownerPropertiesform = new OWNER_PROPERTIES_FORM(id);
            ownerPropertiesform.setVisible(true);
            ownerPropertiesform.pack();                
            ownerPropertiesform.setLocationRelativeTo(null);
            ownerPropertiesform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the Owner From the Table First", "No Owner Selected", 2);
        }
        
    }//GEN-LAST:event_jButton_owner_propertiesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWNER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_owner;
    private javax.swing.JButton jButton_edit_owner;
    private javax.swing.JButton jButton_owner_properties;
    private javax.swing.JButton jButton_refresh_owner;
    private javax.swing.JButton jButton_remove_owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_firstname;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_lastname;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}
