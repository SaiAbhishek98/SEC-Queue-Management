/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secpackage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanidhya
 */
public class SECP1_Form extends javax.swing.JFrame {

    public Integer count = -1;
    DefaultTableModel model = null;
    /**
     * Creates new form SECP1_Form
     */
    public SECP1_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        model = (DefaultTableModel)queueTable.getModel();
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        add_button = new javax.swing.JButton();
        remove_button = new javax.swing.JButton();
        pause_button = new javax.swing.JButton();
        unpause_button = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        queueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add_button.setText("Add");
        add_button.setToolTipText("Adds a new entry to the queue.");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        remove_button.setText("Remove");
        remove_button.setToolTipText("Removes selected entry from queue.");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        pause_button.setText("Pause");
        pause_button.setToolTipText("Pauses the selected entry.");
        pause_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pause_buttonActionPerformed(evt);
            }
        });

        unpause_button.setText("Unpause");
        unpause_button.setToolTipText("Unpauses the selected entry.");
        unpause_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unpause_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove_button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pause_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unpause_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(remove_button)
                    .addComponent(pause_button)
                    .addComponent(unpause_button))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        queueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "1", "A", "a@buffalo.edu", "Unpaused"},
                {null, "2", "B", "b@buffalo.edu", "Unpaused"},
                {null, "3", "C", "c@buffalo.edu", "Unpaused"},
                {null, "4", "D", "d@buffalo.edu", null}
            },
            new String [] {
                "", "Sequence No.", "Name", "Email ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        queueTable.getTableHeader().setReorderingAllowed(false);
        queueTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                queueTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(queueTable);
        if (queueTable.getColumnModel().getColumnCount() > 0) {
            queueTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            queueTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("The queue is empty.");

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pause_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pause_buttonActionPerformed
        // TODO add your handling code here:
        Object status = null;
        int row = this.getRow();
        if(row != -1)        
            status = queueTable.getValueAt(row, 4);
        if(status != null && status.toString().equals("Paused"))
            JOptionPane.showMessageDialog(this, "Selected entry is already paused");
        else if(row == -1)            
            JOptionPane.showMessageDialog(this, "Select an entry first");
        else
        {
            SessionPasswordForm form = new SessionPasswordForm(this, row, "Paused");
            form.setVisible(true);            
        }
    }//GEN-LAST:event_pause_buttonActionPerformed

    public Boolean setState(SessionPasswordForm form, int row, String state)
    {
       if(form.isAuth())
       {
           model.setValueAt(state, row, 4);
       } 
       return true;
    }
    
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
        loginForm login = new loginForm(this);
        login.setVisible(true);
    }//GEN-LAST:event_add_buttonActionPerformed

    public void setTable(loginForm login)
    {
        if(login.isAuth())
        {
            RowModel row = new RowModel();
            row.isSelected = false;            
            row.orderNo = queueTable.getRowCount()+1;
            row.name = login.getName();
            row.email = login.getEmail();
            row.status = "Unpaused";
            model.addRow(new Object[]{row.isSelected,row.orderNo,row.name,row.email,row.status});
            jLabel1.setVisible(false);
        }
    }    
    
    private void unpause_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unpause_buttonActionPerformed
        // TODO add your handling code here:
        Object status = null;
        int row = this.getRow();
        if(row != -1)        
            status = queueTable.getValueAt(row, 4);
        if(status != null && status.toString().equals("Unpaused"))
            JOptionPane.showMessageDialog(this, "Selected entry is already unpaused");
        else if(row == -1) 
            JOptionPane.showMessageDialog(this, "Select an entry first");
        else
        {
            System.out.println(row);
            SessionPasswordForm form = new SessionPasswordForm(this, row, "Unpaused");
            form.setVisible(true);
        }
    }//GEN-LAST:event_unpause_buttonActionPerformed

    private void queueTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_queueTablePropertyChange
        // TODO add your handling code here:
        if(queueTable != null)
        {
            int row = this.getRow();
            for(int i = 0; i < queueTable.getRowCount(); i++)
            {
                if(i != row)
                    queueTable.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_queueTablePropertyChange

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        // TODO add your handling code here:
        int row = this.getRow();
        if(row != -1)
        {
            model.removeRow(row);
            for(int i = row; i<queueTable.getRowCount();i++)
            {
                queueTable.setValueAt(row+1, i, 1);
                row++;
            }
            if(queueTable.getRowCount() < 1)
                jLabel1.setVisible(true);
        }
        else if(row == -1 && queueTable.getRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "No more entries to remove");   
        }
        else
            JOptionPane.showMessageDialog(this, "Select an entry to remove");
    }//GEN-LAST:event_remove_buttonActionPerformed

    private int getRow()
    {
        int row = -1;
        for(int i = 0; i < queueTable.getRowCount(); i++)
        {
            Object flag = queueTable.getValueAt(i, 0);
            if(flag != null && (Boolean)flag == true)
            {
                row = i;
            }
        }
        return row;
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
            java.util.logging.Logger.getLogger(SECP1_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SECP1_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SECP1_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SECP1_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SECP1_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton pause_button;
    private javax.swing.JTable queueTable;
    private javax.swing.JButton remove_button;
    private javax.swing.JButton unpause_button;
    // End of variables declaration//GEN-END:variables
}
