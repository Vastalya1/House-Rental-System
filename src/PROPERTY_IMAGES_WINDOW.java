
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author maury
 */
public class PROPERTY_IMAGES_WINDOW extends javax.swing.JFrame {

  
    
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypeMap();
    String property_image_path ="";
    int propertyId = 0;
    
    public PROPERTY_IMAGES_WINDOW() {
        initComponents();
        
        // set border to the app name lable
        Border panel_title_border =  BorderFactory.createMatteBorder(0,0,3,0, new Color(235,125,22));
        jPanel_title.setBorder(panel_title_border);
        
        //set a white border to the jlable image
        Border jlabel_image_border =  BorderFactory.createMatteBorder(1,1,1,1, new Color(255,255,255));
        jLabel_image.setBorder(jlabel_image_border);
        
        // populate the combobox with type name
        bindCombo();
        
        //when the form show up 
        //populate the jtable with all the properties 
        fillJtableWithPropertiesData();
        
        //set row height
        jTable_properties.setRowHeight(30);
        
        //change the table slected background
        jTable_properties.setSelectionBackground(new Color(255,153,153));
        //change the width of the column
        jTable_properties.getColumnModel().getColumn(0).setPreferredWidth(40);
        
        //change the width of the column
        jTable_properties.getColumnModel().getColumn(2).setPreferredWidth(250);

    }

    //create a function to populate the jcombobox with types of data
    public void bindCombo()
    {
        for(String s : map.keySet())
        {
            jComboBox_types.addItem(s);
        }    
    }
    
    
    //create a function to poulate the jTable with properties data
    public void fillJtableWithPropertiesData()
    {
        
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesList();
        
        //the jtable columns
        String[] colNames = {"ID","type","Address"};
        
        //the jtable row
        //properityList.size()= the size of the arrayList
        Object[][] rows = new Object[propertyList.size()][3];
        
        //add data from the list to the rows
        for(int i=0; i< propertyList.size(); i++)
        {
            rows[i][0]= propertyList.get(i).getId();
            String typeName = type.getTypeName(propertyList.get(i).getType());
            rows[i][1] = typeName != null ? typeName : "";
            rows[i][2]= propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);
        
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
        jButton_show_images = new javax.swing.JButton();
        jButton_add_image = new javax.swing.JButton();
        jButton_remove_images = new javax.swing.JButton();
        jButton_refresh_type = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_types = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton_browse_image = new javax.swing.JButton();
        jLabel_image = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel_title.setBackground(new java.awt.Color(247, 197, 102));

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(108, 3, 69));
        jLabel_title.setText("Property-Images");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_show_images.setBackground(new java.awt.Color(59, 131, 238));
        jButton_show_images.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_show_images.setForeground(new java.awt.Color(255, 255, 255));
        jButton_show_images.setText("Show This Property Images");
        jButton_show_images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_show_images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_show_imagesActionPerformed(evt);
            }
        });

        jButton_add_image.setBackground(new java.awt.Color(30, 169, 77));
        jButton_add_image.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_image.setText("ADD");
        jButton_add_image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_imageActionPerformed(evt);
            }
        });

        jButton_remove_images.setBackground(new java.awt.Color(255, 80, 37));
        jButton_remove_images.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_remove_images.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove_images.setText("REMOVE");
        jButton_remove_images.setToolTipText("");
        jButton_remove_images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_imagesActionPerformed(evt);
            }
        });

        jButton_refresh_type.setBackground(new java.awt.Color(252, 172, 51));
        jButton_refresh_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_type.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh_type.setText("REFRESH");
        jButton_refresh_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_typeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 3, 69));
        jLabel1.setText("Select a Type:");

        jComboBox_types.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jComboBox_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typesActionPerformed(evt);
            }
        });

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_properties);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 3, 69));
        jLabel2.setText("Select Image:");

        jButton_browse_image.setBackground(new java.awt.Color(252, 172, 51));
        jButton_browse_image.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_browse_image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_browse_image.setText("Browse");
        jButton_browse_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_browse_imageActionPerformed(evt);
            }
        });

        jLabel_image.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_image.setText("  ");
        jLabel_image.setOpaque(true);

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("<html>*this table contains the property ids and address<br>click on the button to show image slider.</html>");

        //make the jlabel multiline
        jLabel5.setText("<html>*this list contains the images id<BR>of the selected property.<BR>(select the property from the table).</html>");

        jLabel6.setText("<html>*select an item from the list to display<BR> or browse an image from your computer.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_show_images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_browse_image, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_remove_images, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton_add_image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addComponent(jLabel_image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jButton_refresh_type, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_browse_image, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_show_images, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove_images, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_image, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addComponent(jButton_refresh_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_show_imagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_show_imagesActionPerformed
        
        try{
            
            //set the property id
             int rowIndex= jTable_properties.getSelectedRow(); //selected jtable row index
            int id= Integer.valueOf(jTable_properties.getValueAt(rowIndex,0).toString()); //get the id from the jtable
                
            //first check if this property contain images 
            //we will use the jlist to do that
            if(jList1.getModel().getSize()>0)
            {
                 //show the seleted property image in a slider
                //and set the id to the slider form
                PROPERTY_IMAGES_SLIDER imagesSliderform = new PROPERTY_IMAGES_SLIDER(id);

                imagesSliderform.setVisible(true);
                imagesSliderform.pack();
                imagesSliderform.setLocationRelativeTo(null);
                imagesSliderform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
            }
            else
            {
              JOptionPane.showMessageDialog(null, "This property Does not have any images to show", "No images", 2);  
            }
           

           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the property first", "property not selected", 2);

        }

        
        
    }//GEN-LAST:event_jButton_show_imagesActionPerformed

    private void jButton_add_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_imageActionPerformed
        
        //add images to the property
        //you can add multiple images to a property
        //we need to get the property id from the jtable 
        P_PROPERTY property = new P_PROPERTY();
        
        if(propertyId !=0 )
        {
            if(property.addImage(propertyId, property_image_path))
            {
                JOptionPane.showMessageDialog(null, "Image added to this property", "Add image", 1);

            }else{
                JOptionPane.showMessageDialog(null, "Image Not added to this property", "Add image", 2);
            }
        }else{
                JOptionPane.showMessageDialog(null, "Select the property first", "property not selected", 2);
            }
        
        
    }//GEN-LAST:event_jButton_add_imageActionPerformed

    private void jButton_remove_imagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_imagesActionPerformed
        
        try{
            //remove the selected image
        String selectedListItem = String.valueOf(jList1.getSelectedValue());
        Integer imageId= Integer.valueOf(selectedListItem);
        
        //show a confirmation message before deleting the type
        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Image?", "delete Image", JOptionPane.YES_NO_OPTION);

                
        if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(new P_PROPERTY().removePropertyImage(imageId))
                    {
                        JOptionPane.showMessageDialog(null, "Image deleted", "delete Image", 1);
                        jLabel_image.setIcon(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "operation failed", "delete Image", 2);
                    }
                }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "No image selected", "delete Image", 2);
        }
                
    }//GEN-LAST:event_jButton_remove_imagesActionPerformed

    private void jButton_refresh_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_typeActionPerformed
        
        fillTypeList();
        
    }//GEN-LAST:event_jButton_refresh_typeActionPerformed

    //create a function to resize the image to the jlabe 
    //make this function allow a byte[] parameter
    public ImageIcon resizeImage(String path, byte[] byteImage)
    {
        ImageIcon pic;
        if(byteImage != null) pic=new ImageIcon(byteImage);
        else pic=new ImageIcon(path);
            
        Image img= pic.getImage().getScaledInstance(jLabel_image.getWidth(),jLabel_image.getHeight(),Image.SCALE_SMOOTH);
        
        ImageIcon image = new ImageIcon(img);
        
        return image;
    }
    private void jButton_browse_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_browse_imageActionPerformed
        //browse image from the computer
        JFileChooser fileChooser =  new JFileChooser();
        fileChooser.setDialogTitle("Select the property image");
        //c:\\iamges = is where my images are located
        //images from pixabay.com
        fileChooser.setCurrentDirectory(new File("D:\\_official_\\_MIT ADT_\\_SEMESTER 4_\\Mini Project II\\property_images"));
        
        //file extension 
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images",".jpg",".png", ".jpeg");
        fileChooser.addChoosableFileFilter(fileFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel_image.setIcon(resizeImage(path , null));
            property_image_path = path;
        }
        
        
    }//GEN-LAST:event_jButton_browse_imageActionPerformed

    private void jComboBox_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typesActionPerformed
        
        //show properties in the jtable depending on the selected type
        int typeId = map.get(jComboBox_types.getSelectedItem().toString());
        
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesListByType(typeId);
        
        //the jtable columns
        String[] colNames = {"ID","Address"};
        
        //the jtable row
        //properityList.size()= the size of the arrayList
        Object[][] rows = new Object[propertyList.size()][2];
        
        //add data from the list to the rows
        for(int i=0; i< propertyList.size(); i++)
        {
            rows[i][0]= propertyList.get(i).getId();
            rows[i][1]= propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);
        
        
    }//GEN-LAST:event_jComboBox_typesActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         //try and catch if the list is empty
         try{
             //display the selected image from the list to jlabel 
            //we can use the hashmap if we want like in the property window
            //but here instead will create a function to the image by id
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId= Integer.valueOf(selectedListItem);
            byte[] image= new P_PROPERTY().getImageById(imageId);
            //resizeImage("",image);
            jLabel_image.setIcon(resizeImage("" , image));
             
         }catch( Exception ex){
             //nothing
         }
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
        
        //get the property id from the jtable
        //get the selected row index
        int rowIndex = jTable_properties.getSelectedRow();
        propertyId = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());
        
        //display the selected property images list in the jlist
        fillTypeList();
        
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    
    //create a function to populate the Jlist with the selected property images id
    public void fillTypeList()
    {
        HashMap<byte[], Integer> imagesListMap = new P_PROPERTY().propertyImagesList(propertyId);
        
        DefaultListModel listModel = new DefaultListModel();
        int i =0;
        
        for(Integer id: imagesListMap.values())
        {
            listModel.add(i, id);
            i++;
        }
        
        jList1.setModel(listModel);
    }
    
    
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
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_IMAGES_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_image;
    private javax.swing.JButton jButton_browse_image;
    private javax.swing.JButton jButton_refresh_type;
    private javax.swing.JButton jButton_remove_images;
    private javax.swing.JButton jButton_show_images;
    private javax.swing.JComboBox<String> jComboBox_types;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_properties;
    // End of variables declaration//GEN-END:variables
}
