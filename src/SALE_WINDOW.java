
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
 * @author Siya Saji
 */
public class SALE_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form SALE_WINDOW
     */
    public SALE_WINDOW() {
        initComponents();
        //[255,51,0]
        
       // set border to the app name lable
        Border panel_title_border =  BorderFactory.createMatteBorder(0,0,3,0, new Color(235,125,22));
        jPanel_title.setBorder(panel_title_border);
        
        //set border to the jbuttons
        Border button_border =  BorderFactory.createMatteBorder(2,2,2,2, new Color(255,255,255));
        jButton_add_sale.setBorder(button_border);
        jButton_edit_sale.setBorder(button_border);
        jButton_remove_sale.setBorder(button_border);
        
        //populate the jtable properties witht the property id, owner id, and price
        fillJtableProperties();
        
        
        //populate the jtable clients witht the client id, first name, and last name
        fillJtableClients();
        
        //populate the jtable sales witht the client id, first name, and last name
        fillJtableSales();
        
        //set row height
        jTable_clients.setRowHeight(30);     
        jTable_properties.setRowHeight(30); 
        jTable_sales.setRowHeight(30);
        //change the table slected background
        jTable_clients.setSelectionBackground(new Color(27,150,77));
        jTable_properties.setSelectionBackground(new Color(20,120,10));
        jTable_sales.setSelectionBackground(new Color(0,70,0));
    
    }
    
    //create a function to poulate the jTable with properties data
    public void fillJtableProperties()
    {
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesListForTenent();
        
        //the jtable columns
        String[] colNames = {"ID","Owner Id", "Price"};
        
        //the jtable row
        //properityList.size()= the size of the arrayList
        Object[][] rows = new Object[propertyList.size()][3];
        
        //add data from the list to the rows
        for(int i=0; i< propertyList.size(); i++)
        {
            rows[i][0]= propertyList.get(i).getId();
            rows[i][1]= propertyList.get(i).getOwnerId();
            rows[i][2]= propertyList.get(i).getPrice();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);    
    }
    
    //create a function to poulate the jTable with clients data
    public void fillJtableClients()
    {
        P_CLIENT client = new P_CLIENT();
        ArrayList<P_CLIENT> clientsList = client.ClientsList();
        
        //the jtable columns
        String[] colNames = {"ID","First Name","Last Name"};
        
        //the jtable row
        //ownersList.size()= the size of the arrayList
        //6= no. of columns "ID","First Name","Last Name","Phone No.","Email","Address"
        Object[][] rows = new Object[clientsList.size()][3];
        
        //add data from the list to the rows
        for(int i=0; i< clientsList.size(); i++)
        {
            rows[i][0]= clientsList.get(i).getId();
            rows[i][1]= clientsList.get(i).getFristName();
            rows[i][2]= clientsList.get(i).getLastName();
            
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_clients.setModel(model);
        
        //change the width of the column
        jTable_clients.getColumnModel().getColumn(0).setPreferredWidth(20);
        
        
    }
    
    
    //create a function to poulate the jTable with sales data
    public void fillJtableSales()
    {
        P_SALE sale = new P_SALE();
        ArrayList<P_SALE> saleList = sale.SalesList();
        
        //the jtable columns
        String[] colNames = {"ID","property", "Client", "Price", "Date"};
        
        //the jtable row
        //properityList.size()= the size of the arrayList
        Object[][] rows = new Object[saleList.size()][5];
        
        //add data from the list to the rows
        for(int i=0; i< saleList.size(); i++)
        {
            rows[i][0]= saleList.get(i).getId();
            rows[i][1]= saleList.get(i).getPropertyId();
            rows[i][2]= saleList.get(i).getClientId();
            rows[i][3]= saleList.get(i).getFinalPrice();
            rows[i][4]= saleList.get(i).getSellingDate();            
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_sales.setModel(model);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_title = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_propertyID = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jButton_edit_sale = new javax.swing.JButton();
        jButton_add_sale = new javax.swing.JButton();
        jButton_remove_sale = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_clientID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_finalPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_clients = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser_saleDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_sales = new javax.swing.JTable();
        jButton_refresh_Sales_Table = new javax.swing.JButton();
        jButton_refresh_Property_Table = new javax.swing.JButton();
        jButton_refresh_Client_Table = new javax.swing.JButton();
        jButton_add_property = new javax.swing.JButton();
        jButton_add_client = new javax.swing.JButton();
        jButton_add_client1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jPanel_title.setBackground(new java.awt.Color(247, 197, 102));

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(108, 3, 69));
        jLabel_title.setText("Sale");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Property ID:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Properties List: ");

        jTextField_propertyID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_propertyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_propertyIDActionPerformed(evt);
            }
        });

        jTextField_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton_edit_sale.setBackground(new java.awt.Color(59, 131, 238));
        jButton_edit_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_edit_sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_sale.setText("EDIT");
        jButton_edit_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_saleActionPerformed(evt);
            }
        });

        jButton_add_sale.setBackground(new java.awt.Color(30, 169, 77));
        jButton_add_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_sale.setText("ADD");
        jButton_add_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_saleActionPerformed(evt);
            }
        });

        jButton_remove_sale.setBackground(new java.awt.Color(255, 51, 0));
        jButton_remove_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_remove_sale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove_sale.setText("REMOVE");
        jButton_remove_sale.setToolTipText("");
        jButton_remove_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_remove_saleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Client ID:");

        jTextField_clientID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_clientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_clientIDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Final Price: ");

        jTextField_finalPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_finalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_finalPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Date:");

        jTable_clients.setAutoCreateRowSorter(true);
        jTable_clients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_clients.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_clients);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setText("ID: ");

        jTable_properties.setAutoCreateRowSorter(true);
        jTable_properties.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_properties);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Client List: ");

        jDateChooser_saleDate.setDateFormatString("dd-MM-yyyy");
        jDateChooser_saleDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Sale List: ");

        jTable_sales.setAutoCreateRowSorter(true);
        jTable_sales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_sales.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_salesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_sales);

        jButton_refresh_Sales_Table.setBackground(new java.awt.Color(252, 172, 51));
        jButton_refresh_Sales_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_Sales_Table.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh_Sales_Table.setText("Refresh");
        jButton_refresh_Sales_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_Sales_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_Sales_TableActionPerformed(evt);
            }
        });

        jButton_refresh_Property_Table.setBackground(new java.awt.Color(252, 172, 51));
        jButton_refresh_Property_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_Property_Table.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh_Property_Table.setText("Refresh");
        jButton_refresh_Property_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_Property_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_Property_TableActionPerformed(evt);
            }
        });

        jButton_refresh_Client_Table.setBackground(new java.awt.Color(252, 172, 51));
        jButton_refresh_Client_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_refresh_Client_Table.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh_Client_Table.setText("Refresh");
        jButton_refresh_Client_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh_Client_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_Client_TableActionPerformed(evt);
            }
        });

        jButton_add_property.setBackground(new java.awt.Color(30, 169, 77));
        jButton_add_property.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_property.setText("Add New Property");
        jButton_add_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_propertyActionPerformed(evt);
            }
        });

        jButton_add_client.setBackground(new java.awt.Color(252, 172, 51));
        jButton_add_client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_client.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_client.setText("Show All Properties");
        jButton_add_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_clientActionPerformed(evt);
            }
        });

        jButton_add_client1.setBackground(new java.awt.Color(30, 169, 77));
        jButton_add_client1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_add_client1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add_client1.setText(" Add New Client");
        jButton_add_client1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_client1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_finalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton_add_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_remove_sale, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser_saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton_edit_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_add_client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_propertyID)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextField_clientID))
                            .addComponent(jTextField_id))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_refresh_Sales_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_refresh_Client_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton_add_client1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton_refresh_Property_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_add_property, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_refresh_Property_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_refresh_Client_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_refresh_Sales_Table, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add_property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add_client1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_propertyID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_clientID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_finalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_saleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jButton_add_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_edit_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_remove_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_propertyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_propertyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_propertyIDActionPerformed

    private void jButton_edit_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_saleActionPerformed
        
        try{
         //edit selected sale
        int id= Integer.valueOf(jTextField_id.getText());
        int propertyId= Integer.valueOf(jTextField_propertyID.getText());
        int clientId= Integer.valueOf(jTextField_clientID.getText());
        String finalPrice= jTextField_finalPrice.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sellingdate= dateFormat.format(jDateChooser_saleDate.getDate());
        
        P_SALE sale = new P_SALE(id, propertyId, clientId, finalPrice, sellingdate);
        
        if(new P_SALE().editSale(sale))
        {
            JOptionPane.showMessageDialog(null, "The sale has been Updated", "Edit Sale", 1);
        }else{
                JOptionPane.showMessageDialog(null, "Sale not Updated", "Edit Sale", 2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the Sale Id, Property Id and Client Id first", "Sale not selected", 2);

        }
        
        
    }//GEN-LAST:event_jButton_edit_saleActionPerformed

    private void jButton_add_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_saleActionPerformed
        
        try{
        //add a new sale
        //int id= Integer.valueOf(jTextField_id.getText());
        int propertyId= Integer.valueOf(jTextField_propertyID.getText());
        int clientId= Integer.valueOf(jTextField_clientID.getText());
        String finalPrice= jTextField_finalPrice.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sellingdate= dateFormat.format(jDateChooser_saleDate.getDate());
        
        P_SALE sale = new P_SALE(0, propertyId, clientId, finalPrice, sellingdate);
        //P_PROPERTY property= new P_PROPERTY(0,0,0,0,0,0,0,0,0,0,0,0);
        
        if(new P_SALE().addNewSale(sale))
        {
            JOptionPane.showMessageDialog(null, "A new sale has been created and added", "Add Sale", 1);
        }else{
                JOptionPane.showMessageDialog(null, "Sale not created", "Add Sale", 2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the Property Id and Client Id first", "Sale not selected", 2);

        }
        
    }//GEN-LAST:event_jButton_add_saleActionPerformed

    private void jButton_remove_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_remove_saleActionPerformed
        
        try{
        //delete selected sale
        int id= Integer.valueOf(jTextField_id.getText());
        int pid= Integer.valueOf(jTextField_propertyID.getText());
        
        if(new P_SALE().deleteSale(id,pid))
        {
            JOptionPane.showMessageDialog(null, "Sale has been deleted ", "Delete Sale", 1);
        }else{
                JOptionPane.showMessageDialog(null, "Sale not Deleted", "Delete Sale", 2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the Sale Id first", "Sale not selected", 2);
        }
        
    }//GEN-LAST:event_jButton_remove_saleActionPerformed

    private void jTextField_clientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_clientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_clientIDActionPerformed

    private void jTextField_finalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_finalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_finalPriceActionPerformed

    private void jTable_clientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientsMouseClicked

        int SelectedRowIndex= jTable_clients.getSelectedRow();
        //jTextField_id.setText(jTable_clients.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_clientID.setText(jTable_clients.getValueAt(SelectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable_clientsMouseClicked

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
       
        
        int SelectedRowIndex= jTable_properties.getSelectedRow();
//        jTextField_id.setText(jTable_properties.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_propertyID.setText(jTable_properties.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_finalPrice.setText(jTable_properties.getValueAt(SelectedRowIndex, 2).toString());
    
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void jTable_salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_salesMouseClicked
        // display the selected sale data
        int SelectedRowIndex= jTable_sales.getSelectedRow();
        jTextField_id.setText(jTable_sales.getValueAt(SelectedRowIndex, 0).toString());
        jTextField_propertyID.setText(jTable_sales.getValueAt(SelectedRowIndex, 1).toString());
        jTextField_clientID.setText(jTable_sales.getValueAt(SelectedRowIndex, 2).toString());
        jTextField_finalPrice.setText(jTable_sales.getValueAt(SelectedRowIndex, 3).toString());
        
        // display the date in jdatechooser
        Date saleDate;
        
        try {
            saleDate= new SimpleDateFormat("yyyy-MM-dd").parse(jTable_sales.getValueAt(SelectedRowIndex, 4).toString());
            jDateChooser_saleDate.setDate(saleDate);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
         
        
  
    }//GEN-LAST:event_jTable_salesMouseClicked

    private void jButton_refresh_Sales_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_Sales_TableActionPerformed
        //refresh the jtable sales
        fillJtableSales();
    }//GEN-LAST:event_jButton_refresh_Sales_TableActionPerformed

    private void jButton_refresh_Property_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_Property_TableActionPerformed
        // refresh the jtable properties
        fillJtableProperties();
    }//GEN-LAST:event_jButton_refresh_Property_TableActionPerformed

    private void jButton_refresh_Client_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_Client_TableActionPerformed
        //refresh the jtable clients
        fillJtableClients();
    }//GEN-LAST:event_jButton_refresh_Client_TableActionPerformed

    private void jButton_add_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_propertyActionPerformed
        
        // open the property form
        PROPERTY_WINDOW propertyform = new PROPERTY_WINDOW();        
        propertyform.setVisible(true);
        propertyform.pack();          
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_add_propertyActionPerformed

    private void jButton_add_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_clientActionPerformed
        // show all properties in a new form
        SHOW_PROPERTIES_WINDOW showPorpertyform = new SHOW_PROPERTIES_WINDOW();                
        showPorpertyform.setVisible(true);
        showPorpertyform.pack();          
        showPorpertyform.setLocationRelativeTo(null);
        showPorpertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_add_clientActionPerformed

    private void jButton_add_client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_client1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_add_client1ActionPerformed

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
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALE_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_client;
    private javax.swing.JButton jButton_add_client1;
    private javax.swing.JButton jButton_add_property;
    private javax.swing.JButton jButton_add_sale;
    private javax.swing.JButton jButton_edit_sale;
    private javax.swing.JButton jButton_refresh_Client_Table;
    private javax.swing.JButton jButton_refresh_Property_Table;
    private javax.swing.JButton jButton_refresh_Sales_Table;
    private javax.swing.JButton jButton_remove_sale;
    private com.toedter.calendar.JDateChooser jDateChooser_saleDate;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_clients;
    private javax.swing.JTable jTable_properties;
    private javax.swing.JTable jTable_sales;
    private javax.swing.JTextField jTextField_clientID;
    private javax.swing.JTextField jTextField_finalPrice;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_propertyID;
    // End of variables declaration//GEN-END:variables
}
