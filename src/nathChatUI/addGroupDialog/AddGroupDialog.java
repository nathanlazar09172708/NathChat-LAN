/*
 * Copyright (C) Jonathan Lazar 2019-Present
 * All Rights Reserved 2019
 */
package nathChatUI.addGroupDialog;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.BorderFactory;
import nathChatUI.NathChatClient;


/**
 *
 * @author Jonathan Lazar <jonathanlazar17@gmail.com>
 */
public class AddGroupDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddGroupDialog
     */
    
    private AddGroupDialogController controller;
    
    public AddGroupDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Add Group");
        setIconImage(Toolkit.getDefaultToolkit().getImage(NathChatClient.path+"\\icons\\nathChatLogo.png"));
        initComponents();
        this.setLocation(((int)(NathChatClient.windowSize.width/2))-((int)(this.getWidth()/2))
                        ,((int)(NathChatClient.windowSize.height/2))-((int)(this.getHeight()/2)));
        this.groupListTable.getTableHeader().setForeground(Color.decode("#3597D9"));
        ((DefaultTableCellRenderer)this.groupListTable.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        controller=new AddGroupDialogController(this);
        NathChatClient.core.displayGroupList(this.groupListTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        groupNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupListTable = new javax.swing.JTable(){

            @Override
            public boolean isCellEditable(int row,int column){

                return false;

            }

        };
        addButtonLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        groupNameTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        groupNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        groupNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupNameTextFieldActionPerformed(evt);
            }
        });

        groupListTable.setShowHorizontalLines(false);
        groupListTable.setShowVerticalLines(false);
        groupListTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        groupListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Groups"
            }
        ));
        jScrollPane1.setViewportView(groupListTable);

        javax.swing.ImageIcon buttonIcon=new javax.swing.ImageIcon(NathChatClient.path+"\\icons\\add-button-icon-uh.png");
        java.awt.Image buttonImage=buttonIcon.getImage().getScaledInstance(100,25,java.awt.Image.SCALE_SMOOTH);
        buttonIcon.setImage(buttonImage);
        addButtonLabel.setIcon(buttonIcon);
        addButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonLabelMouseClicked(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descriptionLabel.setText("Enter the group you want to create");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(groupNameTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(groupNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupNameTextFieldActionPerformed

    private void addButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonLabelMouseClicked
        // TODO add your handling code here:
        
        if(!groupNameTextField.getText().equals("")){
            
            controller.addGroupBtnClk(groupNameTextField.getText());
            
        }
        else{
            
            groupNameTextField.setBorder(BorderFactory.createLineBorder(Color.RED,1));
            
        }
        
    }//GEN-LAST:event_addButtonLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButtonLabel;
    private javax.swing.JLabel descriptionLabel;
    protected javax.swing.JTable groupListTable;
    protected javax.swing.JTextField groupNameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
