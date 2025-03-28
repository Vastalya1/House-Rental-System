
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AVS Vastalya
 */
public class PROPERTY_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_WINDOW
     */
    
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypeMap();
    
    public PROPERTY_WINDOW() {
        initComponents();
        
        // set border to the app name lable
        Border panel_title_border =  BorderFactory.createMatteBorder(0,0,3,0, new Color(26,138,32));
        jPanel_title.setBorder(panel_title_border);
        
        //set border to the jbuttons
        Border button_border =  BorderFactory.createMatteBorder(2,2,2,2, new Color(255,255,255));
        jButton_add_property.setBorder(button_border);
        jButton_edit_property.setBorder(button_border);
        jButton_remove_property.setBorder(button_border);
        jButton_search_property.setBorder(button_border);
        jButton_show_property.setBorder(button_border);
        
        //populate the combobox
        bindCombo();
    }
    
    //create a function to populate the jcombobox with types of data
    public void bindCombo()
    {
        for(String s : map.keySet())
        {
            jComboBox_type.addItem(s);
        }    
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
        jTextField_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jButton_edit_property = new javax.swing.JButton();
        jButton_add_property = new javax.swing.JButton();
        jButton_remove_property = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_squareFeet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ownerId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jButton_search_property = new javax.swing.JButton();
        jComboBox_type = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinner_bedroom = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinner_bathroom = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner_age = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox_balcony = new javax.swing.JCheckBox();
        jButton_show_property = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jPanel_title.setBackground(new java.awt.Color(0, 153, 0));

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_title.setText("Property");

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
        jLabel1.setText("Type:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("ID: ");

        jTextField_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextArea_description.setColumns(20);
        jTextArea_description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea_description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_description);

        jButton_edit_property.setBackground(new java.awt.Color(0, 102, 255));
        jButton_edit_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_edit_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_property.setText("EDIT");
        jButton_edit_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_propertyActionPerformed(evt);
            }
        });

        jButton_add_property.setBackground(new java.awt.Color(0, 153, 51));
        jButton_add_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_property.setText("ADD");
        jButton_add_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_propertyActionPerformed(evt);
            }
        });

        jButton_remove_property.setBackground(new java.awt.Color(255, 51, 0));
        jButton_remove_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_remove_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove_property.setText("REMOVE");
        jButton_remove_property.setToolTipText("");
        jButton_remove_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_propertyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Square Feet:");

        jTextField_squareFeet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_squareFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_squareFeetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Owner Id: ");

        jTextField_ownerId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_ownerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ownerIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Price:");

        jTextField_price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_priceActionPerformed(evt);
            }
        });

        jButton_search_property.setBackground(new java.awt.Color(204, 102, 255));
        jButton_search_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_search_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_search_property.setText("Search");
        jButton_search_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_propertyActionPerformed(evt);
            }
        });

        jComboBox_type.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setText("Bedrooms:");

        jSpinner_bedroom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_bedroom.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setText("Bathrooms:");

        jSpinner_bathroom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_bathroom.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("0 being newest");

        jSpinner_age.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner_age.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setText("Description/ comment:");

        jTextArea_address.setColumns(20);
        jTextArea_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea_address.setRows(5);
        jScrollPane2.setViewportView(jTextArea_address);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setText("Age Of The House:");

        jCheckBox_balcony.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox_balcony.setText("Balcony");
        jCheckBox_balcony.setOpaque(true);
        jCheckBox_balcony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_balconyActionPerformed(evt);
            }
        });

        jButton_show_property.setBackground(new java.awt.Color(255, 204, 0));
        jButton_show_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_show_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_show_property.setText("SHOW PROPERTY");
        jButton_show_property.setToolTipText("");
        jButton_show_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_show_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_show_propertyActionPerformed(evt);
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
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_search_property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField_squareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(259, 259, 259))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ownerId, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_bathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_age, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(jCheckBox_balcony, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton_add_property, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_edit_property, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_remove_property, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_show_property, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_search_property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_squareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ownerId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_bathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCheckBox_balcony, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_age, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit_property, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_property, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove_property, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_show_property, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
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

    private void jButton_edit_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_propertyActionPerformed
        
        //edit the selected property
        
        try{
            int id = Integer.valueOf(jTextField_id.getText());
            int type=map.get(jComboBox_type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(jTextField_ownerId.getText());
            int squareFeet = Integer.valueOf(jTextField_squareFeet.getText());
            int bedrooms= Integer.valueOf(jSpinner_bedroom.getValue().toString());
            int bathrooms= Integer.valueOf(jSpinner_bathroom.getValue().toString());
            int age= Integer.valueOf(jSpinner_age.getValue().toString());
            boolean haveBalcony= false;
            
            //check if the property has a balcony or not
            if(jCheckBox_balcony.isSelected())
            {
                haveBalcony=true;
            }
            
            String price = jTextField_price.getText();
            String address= jTextArea_address.getText();
            String description = jTextArea_description.getText();
            
            P_PROPERTY property = new P_PROPERTY(id,type,squareFeet,ownerId,price,address,bedrooms,bathrooms,age,description,haveBalcony);
            
            if(new P_PROPERTY().editProperty(property))
            {
                JOptionPane.showMessageDialog(null, "Property Updated Successfully", "Edit property", 1);
            } else
            {
                JOptionPane.showMessageDialog(null, "Property not Updated", "Edit Property", 2);
            }
            
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Enter a valid property id", "Invalid Id", 0);
        }
        
        
    }//GEN-LAST:event_jButton_edit_propertyActionPerformed

    private void jButton_add_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_propertyActionPerformed
       
        //add a new property to the system
        // get the property data from text fields
        
        try{
            //we need to populate the jcombobox with the types names
            //and get the value(the value is the integer associated with the string )
            int type=map.get(jComboBox_type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(jTextField_ownerId.getText());
            int squareFeet = Integer.valueOf(jTextField_squareFeet.getText());
            int bedrooms= Integer.valueOf(jSpinner_bedroom.getValue().toString());
            int bathrooms= Integer.valueOf(jSpinner_bathroom.getValue().toString());
            int age= Integer.valueOf(jSpinner_age.getValue().toString());
            boolean haveBalcony= false;
            
            //check if the property has a balcony or not
            if(jCheckBox_balcony.isSelected())
            {
                haveBalcony=true;
            }
            
            String price = jTextField_price.getText();
            String address= jTextArea_address.getText();
            String description = jTextArea_description.getText();
            
            P_PROPERTY property = new P_PROPERTY(0,type,squareFeet,ownerId,price,address,bedrooms,bathrooms,age,description,haveBalcony);
            
            if(new P_PROPERTY().addNewProperty(property))
            {
                JOptionPane.showMessageDialog(null, "New property Added To the System", "Add property", 1);
            } else
            {
                JOptionPane.showMessageDialog(null, "Property not added to the system", "Add Property", 2);
            }
            
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Enter a valid data", "Invalid Id", 0);
        }
        
        
        
    }//GEN-LAST:event_jButton_add_propertyActionPerformed

    private void jButton_remove_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_propertyActionPerformed
       
        P_PROPERTY property = new P_PROPERTY();

        try{
            int propertyId= Integer.valueOf(jTextField_id.getText());
            if(jTextField_id.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Property ID", "empty ID", 2);
            }
            else
            {
                //show a confirmation message before deleting the type
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Property?", "delete Property", JOptionPane.YES_NO_OPTION);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(property.removeProperty(propertyId))
                    {
                        JOptionPane.showMessageDialog(null, "Property deleted", "delete Property", 1);
                        
                        //clear all fields values after deleting the property
                        jTextField_id.setText("");
                        jTextArea_address.setText("");
                        jTextArea_description.setText("");
                        jTextField_price.setText("");
                        jTextField_squareFeet.setText("");
                        jTextField_ownerId.setText("");
                        jComboBox_type.setSelectedIndex(0);                
                        jSpinner_bedroom.setValue(0);
                        jSpinner_bathroom.setValue(0);
                        jSpinner_age.setValue(0);
                        jCheckBox_balcony.setSelected(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "operation failed", "delete Property", 2);
                    }
                }
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "enter a Valid Property ID", "Invalid ID", 2);
        }
        
    }//GEN-LAST:event_jButton_remove_propertyActionPerformed

    private void jTextField_squareFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_squareFeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_squareFeetActionPerformed

    private void jTextField_ownerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ownerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ownerIdActionPerformed

    private void jTextField_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_priceActionPerformed

    private void jButton_search_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_propertyActionPerformed
        
        // search property by id
        //and display the property data
        
        try{
            
            int propertyId = Integer.valueOf(jTextField_id.getText());
            P_PROPERTY property = new P_PROPERTY().findProperty((propertyId));
            
            if(property != null)
            {
                jTextArea_address.setText(property.getAddress());
                jTextArea_description.setText(property.getDescription());
                jTextField_price.setText(property.getPrice());
                jTextField_squareFeet.setText(String.valueOf(property.getSize()));
                jTextField_ownerId.setText(String.valueOf(property.getOwnerId()));
                
                //displaying the property type in the comnobox
                for(Object type: map.keySet())
                {
                    if(map.get(type).equals(property.getType()))
                        jComboBox_type.setSelectedItem(type);
                }
                
                
                jSpinner_bedroom.setValue(property.getBedrooms());
                jSpinner_bathroom.setValue(property.getBedrooms());
                jSpinner_age.setValue(property.getAge());
                
                if(property.isBalcony())
                {
                    jCheckBox_balcony.setSelected(true);
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "property not found", "error", 0);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error", "error", 0);
        }
        
    }//GEN-LAST:event_jButton_search_propertyActionPerformed

    private void jCheckBox_balconyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_balconyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_balconyActionPerformed

    private void jButton_show_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_show_propertyActionPerformed
        // show all properties in a new form
        SHOW_PROPERTIES_WINDOW showPorpertyform = new SHOW_PROPERTIES_WINDOW();
                    
        showPorpertyform.setVisible(true);
        showPorpertyform.pack();          
        showPorpertyform.setLocationRelativeTo(null);
        showPorpertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_show_propertyActionPerformed

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
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_property;
    private javax.swing.JButton jButton_edit_property;
    private javax.swing.JButton jButton_remove_property;
    private javax.swing.JButton jButton_search_property;
    private javax.swing.JButton jButton_show_property;
    private javax.swing.JCheckBox jCheckBox_balcony;
    private javax.swing.JComboBox<String> jComboBox_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_age;
    private javax.swing.JSpinner jSpinner_bathroom;
    private javax.swing.JSpinner jSpinner_bedroom;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_ownerId;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_squareFeet;
    // End of variables declaration//GEN-END:variables
}
