/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inventoryproject;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KJEFF
 */
public class Customer extends javax.swing.JInternalFrame {

    /**
     * Creates new form Category
     */
    public Customer() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        DisplayCust();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        txtcustname = new javax.swing.JTextField();
        txtcustphone = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        updbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CustomerTable.setAutoCreateRowSorter(true);
        CustomerTable.setBackground(new java.awt.Color(192, 27, 54));
        CustomerTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CustomerTable.setForeground(new java.awt.Color(255, 255, 255));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Customer name", "Customer Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        CustomerTable.setSelectionForeground(new java.awt.Color(192, 27, 54));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(192, 27, 54));
        jLabel1.setText("Customer Id:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(192, 27, 54));
        jLabel2.setText("Customer name:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(192, 27, 54));
        jLabel3.setText("Customer phone:");

        txtcustid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtcustname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtcustphone.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        addbtn.setBackground(new java.awt.Color(192, 27, 54));
        addbtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        updbtn.setBackground(new java.awt.Color(192, 27, 54));
        updbtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        updbtn.setForeground(new java.awt.Color(255, 255, 255));
        updbtn.setText("Update");
        updbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updbtnMouseClicked(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(192, 27, 54));
        deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        searchfield.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });

        jLabel4.setText("Search:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(txtcustphone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbtn)
                .addGap(18, 18, 18)
                .addComponent(updbtn)
                .addGap(18, 18, 18)
                .addComponent(deletebtn)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addbtn)
                    .addComponent(updbtn)
                    .addComponent(deletebtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcustphone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 770, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   // Clears JTextfields
    public void Clearfield()
    {
        txtcustid.setText("");
        txtcustname.setText("");
        txtcustphone.setText("");
    }
    
    // declare variables to allow to connect, create and edit database
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    // Displays customers in JTable
    public void DisplayCust()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryDB", "root", "root");
            St = Con.createStatement();
            Rs = St.executeQuery("select custid as 'Customer Id', custname as 'Customer Name', custphone as 'Customer Phone' from customertb");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    // Add customers to database and display in JTable
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        if(txtcustid.getText().isEmpty() || txtcustname.getText().isEmpty() || txtcustphone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryDB", "root", "root");
                PreparedStatement add = Con.prepareStatement("insert into customertb values(?,?,?)");
                add.setInt(1, Integer.valueOf(txtcustid.getText()));
                add.setString(2, txtcustname.getText());
                add.setInt(3, Integer.valueOf(txtcustphone.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Successfully Added");
                Con.close();
                Clearfield();
                DisplayCust();
             }catch(SQLException e)
             {
                 e.printStackTrace();
             }
        }
        
    }//GEN-LAST:event_addbtnMouseClicked

    // Gets data from JTable and set them in jtextfields
    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int selectedrow = CustomerTable.getSelectedRow();
        txtcustid.setText(model.getValueAt(selectedrow, 0).toString());
        txtcustname.setText(model.getValueAt(selectedrow, 1).toString());
        txtcustphone.setText(model.getValueAt(selectedrow, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    // Deletes data in database by entering customer id
    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        if(txtcustid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter the Customer id of the category you want to delete");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryDB", "root", "root");
                String Id = txtcustid.getText();
                String Query = "Delete from inventorydb.customertb where custid="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                DisplayCust();
                Clearfield();
                JOptionPane.showMessageDialog(null, "Customer has been successfully deleted!");
            }catch(SQLException | NumberFormatException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deletebtnMouseClicked

    // allows to update database and reflects in JTable
    private void updbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updbtnMouseClicked
        if(txtcustid.getText().isEmpty() || txtcustname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information!");
        }
        else
        {
            try
            {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryDB", "root", "root");
                String UpdateQuery = "update inventorydb.customertb set custname='"+txtcustname.getText()+"'"+", custphone="+txtcustphone.getText()+""+" where custid="+txtcustid.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(null, "Customer has been updated successfully");
                DisplayCust();
                Con.close();
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updbtnMouseClicked

    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        String search = searchfield.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter(model);
        CustomerTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchfieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtcustname;
    private javax.swing.JTextField txtcustphone;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}
