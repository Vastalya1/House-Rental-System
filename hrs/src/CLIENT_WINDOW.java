
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
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
public class CLIENT_WINDOW extends javax.swing.JFrame {
    /*
    this window and the woner window are identical we can use the window if we want 
    and even the same class.
    but we will use a different ones to make it easy to understand.
    */
    /**
     * Creates new form CLIENT_WINDOW
     */
    public CLIENT_WINDOW() {
        initComponents();
        
        // set border to the app name lable
        Border panel_title_border =  BorderFactory.createMatteBorder(0,0,3,0, new Color(235,125,22));
        jPanel_title.setBorder(panel_title_border);
        
        //set border to the jbuttons
        Border button_border =  BorderFactory.createMatteBorder(2,2,2,2, new Color(255,255,255));
        jButton_add_client.setBorder(button_border);
        jButton_edit_client.setBorder(button_border);
        jButton_remove_client.setBorder(button_border);
        jButton_refresh_client.setBorder(button_border);
        
        
        fillJtableWithClientData();
    }
    
    //we willl create a function to populate the jTable with all the client data using the arraylist
    //after that when the user slect an client from the jTable all the information will be displayed in the jtextfields
    
    public void fillJtableWithClientData()
    {
        P_CLIENT client = new P_CLIENT();
        ArrayList<P_CLIENT> clientsList = client.ClientsList();
        
        //the jtable columns
        String[] colNames = {"ID","First Name","Last Name","Phone No.","Email","Address"};
        
        //the jtable row
        //ownersList.size()= the size of the arrayList
        //6= no. of columns "ID","First Name","Last Name","Phone No.","Email","Address"
        Object[][] rows = new Object[clientsList.size()][6];
        
        //add data from the list to the rows
        for(int i=0; i< clientsList.size(); i++)
        {
            rows[i][0]= clientsList.get(i).getId();
            rows[i][1]= clientsList.get(i).getFristName();
            rows[i][2]= clientsList.get(i).getLastName();
            rows[i][3]= clientsList.get(i).getPhone();
            rows[i][4]= clientsList.get(i).getEmail();
            rows[i][5]= clientsList.get(i).getAddress();
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
        jButton_edit_client = new javax.swing.JButton();
        jButton_add_client = new javax.swing.JButton();
        jButton_remove_client = new javax.swing.JButton();
        jButton_refresh_client = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 178, 41));

        jPanel_title.setBackground(new java.awt.Color(246, 145, 16));

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_title.setText("Clients");

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

        jButton_edit_client.setBackground(new java.awt.Color(0, 102, 255));
        jButton_edit_client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_edit_client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_client.setText("EDIT");
        jButton_edit_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_clientActionPerformed(evt);
            }
        });

        jButton_add_client.setBackground(new java.awt.Color(0, 153, 51));
        jButton_add_client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_client.setText("ADD");
        jButton_add_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_clientActionPerformed(evt);
            }
        });

        jButton_remove_client.setBackground(new java.awt.Color(255, 51, 0));
        jButton_remove_client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_remove_client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove_client.setText("REMOVE");
        jButton_remove_client.setToolTipText("");
        jButton_remove_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_clientActionPerformed(evt);
            }
        });

        jButton_refresh_client.setBackground(new java.awt.Color(255, 255, 0));
        jButton_refresh_client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_client.setText("REFRESH");
        jButton_refresh_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_clientActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
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
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_edit_client, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton_remove_client, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_refresh_client, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit_client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove_client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_refresh_client, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_firstnameActionPerformed

    private void jButton_edit_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_clientActionPerformed
        //edit the owner data

        String fname= jTextField_firstname.getText();
        String lname= jTextField_lastname.getText();
        String phone = jTextField_phone.getText();
        String email = jTextField_email.getText();
        String address= jTextArea_address.getText();

        P_CLIENT client = new P_CLIENT();

        try
        {
            int clientId= Integer.valueOf(jTextField_id.getText());
            //before editing owner data we need to check the input field is empty or not
            //required data -> first name, last name, phone, email and address

            if(fname.trim().equals("") || lname.trim().equals("") || email.trim().equals("") || phone.trim().equals("") || address.trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the required owner information", "edit Client data", 2);
            }
            else
            {
                if(client.editClientData(new P_CLIENT(clientId, fname, lname, phone, email, address)))
                {
                    JOptionPane.showMessageDialog(null, "Client data Updated", "Edit Client data", 1);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Client data Not Updated", "Edit Client data", 2);
                }
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "enter a Valid Client ID", "Invalid ID", 2);
        }

    }//GEN-LAST:event_jButton_edit_clientActionPerformed

    private void jButton_add_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_clientActionPerformed

        //add a new owner

        //get the owner data from the tet fields
        String fname= jTextField_firstname.getText();
        String lname= jTextField_lastname.getText();
        String phone = jTextField_phone.getText();
        String email = jTextField_email.getText();
        String address= jTextArea_address.getText();

        P_CLIENT client = new P_CLIENT();
        //before inserting a new owner we need to check the input field is empty or not
        //required data -> first name, last name, phone, email and address

        if(fname.trim().equals("") || lname.trim().equals("") || email.trim().equals("") || phone.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the required Client information", "Add Client", 2);
        }
        else
        {
            if(client.addNewClient(new P_CLIENT(0, fname, lname, phone, email, address)))
            {
                JOptionPane.showMessageDialog(null, "New Client Added To the System", "Add Client", 1);
            } else
            {
                JOptionPane.showMessageDialog(null, "Client not added to the system", "Add Client", 2);
            }
        }

    }//GEN-LAST:event_jButton_add_clientActionPerformed

    private void jButton_remove_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_clientActionPerformed
        //deleting the selected owner from the system

        P_CLIENT client = new P_CLIENT();

        try{
            int clientId= Integer.valueOf(jTextField_id.getText());
            if(jTextField_id.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Client ID", "empty ID", 2);
            }
            else
            {
                //show a confirmation message before deleting the type
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Client?", "delete Client", JOptionPane.YES_NO_OPTION);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(client.deleteClientData(clientId))
                    {
                        JOptionPane.showMessageDialog(null, "Client deleted", "delete Client", 1);
                        
                        //clear the text fields after the delete
                            jTextField_id.setText("");
                            jTextField_firstname.setText("");
                            jTextField_lastname.setText("");
                            jTextField_phone.setText("");
                            jTextField_email.setText("");
                            jTextArea_address.setText("");
                            
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "operation failed", "delete Client", 2);
                    }
                }
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "enter a Vlid Client ID", "Invalid ID", 2);
        }

    }//GEN-LAST:event_jButton_remove_clientActionPerformed

    private void jButton_refresh_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_clientActionPerformed
        //call the fill jTable function to show the new data in the jtable
        fillJtableWithClientData();

    }//GEN-LAST:event_jButton_refresh_clientActionPerformed

    private void jTextField_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lastnameActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int SelectedRowIndex= jTable1.getSelectedRow();
        jTextField_id.setText(jTable1.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_firstname.setText(jTable1.getValueAt(SelectedRowIndex, 1).toString());
        jTextField_lastname.setText(jTable1.getValueAt(SelectedRowIndex, 2).toString());
        jTextField_phone.setText(jTable1.getValueAt(SelectedRowIndex, 3).toString());
        jTextField_email.setText(jTable1.getValueAt(SelectedRowIndex, 4).toString());
        jTextArea_address.setText(jTable1.getValueAt(SelectedRowIndex, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CLIENT_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLIENT_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLIENT_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLIENT_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLIENT_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_client;
    private javax.swing.JButton jButton_edit_client;
    private javax.swing.JButton jButton_refresh_client;
    private javax.swing.JButton jButton_remove_client;
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
