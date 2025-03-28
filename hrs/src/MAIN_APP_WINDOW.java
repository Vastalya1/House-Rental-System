
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AVS Vastalya
 */
public class MAIN_APP_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form MAIN_APP_WINDOW
     */
    public MAIN_APP_WINDOW() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        //set the logo picture
        jLabel_app_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        
        //set the logo borders
        Border logo_border =  BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        jLabel_app_icon.setBorder(logo_border);  
        
        // set border to the app name lable
        Border app_name_border =  BorderFactory.createMatteBorder(0,0,2,0, Color.white);
        jLabel_app_name.setBorder(app_name_border);
        
        //set menu items border
        Border menu_items_border =  BorderFactory.createMatteBorder(0,0,1,0, Color.yellow);
        jLabel_property.setBorder(menu_items_border);
        jLabel_property_images.setBorder(menu_items_border);
        jLabel_property_type.setBorder(menu_items_border);
        jLabel_client.setBorder(menu_items_border);
        jLabel_owner.setBorder(menu_items_border);
        

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_app_icon = new javax.swing.JLabel();
        jLabel_app_name = new javax.swing.JLabel();
        jLabel_property = new javax.swing.JLabel();
        jLabel_client = new javax.swing.JLabel();
        jLabel_property_type = new javax.swing.JLabel();
        jLabel_property_images = new javax.swing.JLabel();
        jLabel_owner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jLabel_app_icon.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_app_icon.setOpaque(true);

        jLabel_app_name.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_app_name.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel_app_name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_app_name.setText("House renting");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_app_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_app_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_app_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel_app_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel_property.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_property.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_property.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_property.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_property.setText("Property");
        jLabel_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_property.setOpaque(true);
        jLabel_property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_propertyMouseExited(evt);
            }
        });

        jLabel_client.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_client.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_client.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_client.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_client.setText("Client");
        jLabel_client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_client.setOpaque(true);
        jLabel_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_clientMouseExited(evt);
            }
        });

        jLabel_property_type.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_property_type.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_property_type.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_property_type.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_property_type.setText("Property-Type");
        jLabel_property_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_property_type.setOpaque(true);
        jLabel_property_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_property_typeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_property_typeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_property_typeMouseExited(evt);
            }
        });

        jLabel_property_images.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_property_images.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_property_images.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_property_images.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_property_images.setText("Property-Images");
        jLabel_property_images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_property_images.setOpaque(true);
        jLabel_property_images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_property_imagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_property_imagesMouseExited(evt);
            }
        });

        jLabel_owner.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_owner.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_owner.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_owner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_owner.setText("Owner");
        jLabel_owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_owner.setOpaque(true);
        jLabel_owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ownerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_client, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_property_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_property_images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_property, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_property_type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_property_images, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel1.setText("Welcome to the dashboard!!");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jLabel_propertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseEntered
        // change the foreground and background color when mouse hovers over it
        
        jLabel_property.setBackground(Color.white);
        jLabel_property.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_propertyMouseEntered

    private void jLabel_propertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseExited
        // TODO add your handling code here:
        
        jLabel_property.setBackground(new Color(102,102,102));
        jLabel_property.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_propertyMouseExited

    private void jLabel_property_typeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_property_typeMouseEntered
        jLabel_property_type.setBackground(Color.white);
        jLabel_property_type.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_property_typeMouseEntered

    private void jLabel_property_typeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_property_typeMouseExited
        jLabel_property_type.setBackground(new Color(102,102,102));
        jLabel_property_type.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_property_typeMouseExited

    private void jLabel_property_imagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_property_imagesMouseEntered
        jLabel_property_images.setBackground(Color.white);
        jLabel_property_images.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_property_imagesMouseEntered

    private void jLabel_property_imagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_property_imagesMouseExited
        jLabel_property_images.setBackground(new Color(102,102,102));
        jLabel_property_images.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_property_imagesMouseExited

    private void jLabel_ownerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseEntered
        jLabel_owner.setBackground(Color.white);
        jLabel_owner.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_ownerMouseEntered

    private void jLabel_ownerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseExited
        jLabel_owner.setBackground(new Color(102,102,102));
        jLabel_owner.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_ownerMouseExited

    private void jLabel_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseEntered
        jLabel_client.setBackground(Color.white);
        jLabel_client.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_clientMouseEntered

    private void jLabel_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseExited
        jLabel_client.setBackground(new Color(102,102,102));
        jLabel_client.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_clientMouseExited

    private void jLabel_property_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_property_typeMouseClicked
        //open the property_type page
        
        PROPERTY_TYPE_WINDOW typeform = new PROPERTY_TYPE_WINDOW();
                    
        typeform.setVisible(true);
        typeform.pack();     
        //typeform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        typeform.setLocationRelativeTo(null);
        typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_property_typeMouseClicked

    private void jLabel_ownerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ownerMouseClicked
        OWNER_WINDOW ownerform = new OWNER_WINDOW();
                    
        ownerform.setVisible(true);
        ownerform.pack();          
        //ownerform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ownerform.setLocationRelativeTo(null);
        ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_ownerMouseClicked

    private void jLabel_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientMouseClicked
        CLIENT_WINDOW clientform = new CLIENT_WINDOW();
                    
        clientform.setVisible(true);
        clientform.pack();          
        //ownerform.setExtendedState(JFrame.MAXIMIZED_BOTH);
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_clientMouseClicked

    private void jLabel_propertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_propertyMouseClicked
        // open the property form
        PROPERTY_WINDOW propertyform = new PROPERTY_WINDOW();
                    
        propertyform.setVisible(true);
        propertyform.pack();          
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel_propertyMouseClicked

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
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_APP_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_app_icon;
    private javax.swing.JLabel jLabel_app_name;
    private javax.swing.JLabel jLabel_client;
    private javax.swing.JLabel jLabel_owner;
    private javax.swing.JLabel jLabel_property;
    private javax.swing.JLabel jLabel_property_images;
    private javax.swing.JLabel jLabel_property_type;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
