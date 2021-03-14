/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.GUI;

import javax.swing.JOptionPane;
import sk.stu.fiit.logic.InputSanitizer;
import sk.stu.fiit.logic.Lists;

/**
 *
 * @author PeterSmrecek
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    
    private Lists lists;
    private Main_Window mainWin;
    private boolean edit = false;
    private int index;
    
//    private String name = "Sem zadajte meno";
//    private String street = "Sem zadajte ulicu a číslo";
//    private String town = "Sem zadajte obec";
//    private String postal_code = "Sem zadajte PSČ";
    
    public AddCustomer(Main_Window mainWin, Lists lists) {
        initComponents();
        this.lists = lists;
        this.mainWin = mainWin;
    }
    
    public AddCustomer(Main_Window mainWin, Lists lists, int index) {
        initComponents();
        this.lists = lists;
        this.mainWin = mainWin;
        
        this.index = index;
        this.edit = true;
        this.tfName.setText(lists.getCustomer(index).getName());
        this.tfStreet.setText(lists.getCustomer(index).getStreet());
        this.tfTown.setText(lists.getCustomer(index).getTown());
        this.tfPostalCode.setText(lists.getCustomer(index).getPostal_code());
        this.btnOK.setText("Upraviť zákazníka");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        tfStreet = new javax.swing.JTextField();
        lblTown = new javax.swing.JLabel();
        tfTown = new javax.swing.JTextField();
        lblPostalCode = new javax.swing.JLabel();
        tfPostalCode = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zákazník");
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setText("Zákazník");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        getContentPane().add(lblTitle, gridBagConstraints);

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Meno a priezvisko");
        lblName.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(lblName, gridBagConstraints);

        tfName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfName.setText("Sem zadajte meno");
        tfName.setPreferredSize(new java.awt.Dimension(200, 30));
        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(tfName, gridBagConstraints);

        lblStreet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStreet.setText("Adresa a číslo");
        lblStreet.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(lblStreet, gridBagConstraints);

        tfStreet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStreet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfStreet.setText("Sem zadajte ulicu a číslo");
        tfStreet.setPreferredSize(new java.awt.Dimension(200, 30));
        tfStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStreetFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(tfStreet, gridBagConstraints);

        lblTown.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTown.setText("Obec");
        lblTown.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(lblTown, gridBagConstraints);

        tfTown.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTown.setText("Sem zadajte obec");
        tfTown.setPreferredSize(new java.awt.Dimension(200, 30));
        tfTown.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTownFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        getContentPane().add(tfTown, gridBagConstraints);

        lblPostalCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPostalCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostalCode.setText("PSČ");
        lblPostalCode.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(lblPostalCode, gridBagConstraints);

        tfPostalCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPostalCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPostalCode.setText("Sem zadajte PSČ");
        tfPostalCode.setPreferredSize(new java.awt.Dimension(200, 30));
        tfPostalCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPostalCodeFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        getContentPane().add(tfPostalCode, gridBagConstraints);

        btnOK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        pnlButtons.add(btnOK);

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setText("Zrušiť");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCancel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        getContentPane().add(pnlButtons, gridBagConstraints);

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        
        
        if(InputSanitizer.emptyString(tfName.getText()) || 
                InputSanitizer.emptyString(tfStreet.getText()) || 
                InputSanitizer.emptyString(tfTown.getText()) || 
                InputSanitizer.emptyString(tfPostalCode.getText())){
            JOptionPane.showMessageDialog(rootPane, 
                    "Žiadne pole nesmie zostať prázdne!", 
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        boolean success = this.lists.createCustomer(tfName.getText(), 
                tfStreet.getText(), tfTown.getText(), tfPostalCode.getText());
        if (success) {
            if (edit) {
                lists.removeCustomer(index);
            }
            this.mainWin.populateTableOfCustomers();
            if (edit) {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, 
                    "Nepodarilo sa vytvoriť zákazníka!", 
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void tfNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusGained
        // TODO add your handling code here:
        tfName.selectAll();
    }//GEN-LAST:event_tfNameFocusGained

    private void tfStreetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStreetFocusGained
        // TODO add your handling code here:
        tfStreet.selectAll();
    }//GEN-LAST:event_tfStreetFocusGained

    private void tfTownFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTownFocusGained
        // TODO add your handling code here:
        tfTown.selectAll();
    }//GEN-LAST:event_tfTownFocusGained

    private void tfPostalCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPostalCodeFocusGained
        // TODO add your handling code here:
        tfPostalCode.selectAll();
    }//GEN-LAST:event_tfPostalCodeFocusGained

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lists lists = new Lists();
                Main_Window mainWin = new Main_Window();
                new AddCustomer(mainWin, lists).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPostalCode;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTown;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPostalCode;
    private javax.swing.JTextField tfStreet;
    private javax.swing.JTextField tfTown;
    // End of variables declaration//GEN-END:variables
}
