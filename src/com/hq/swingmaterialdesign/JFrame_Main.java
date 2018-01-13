package com.hq.swingmaterialdesign;

import com.hq.swingmaterialdesign.materialdesign.MaterialButton;
import com.hq.swingmaterialdesign.materialdesign.MaterialPanel;
import com.hq.swingmaterialdesign.materialdesign.MaterialComboBox;
import com.hq.swingmaterialdesign.materialdesign.MaterialTextField;
import com.hq.swingmaterialdesign.materialdesign.resource.MaterialColor;
import com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons;
import com.hq.swingmaterialdesign.materialdesign.resource.Roboto;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class JFrame_Main extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Main
     */
    public JFrame_Main() {
        initComponents();
        //jButton_Main1.setFont(MaterialIcons.ICON_FONT.deriveFont(20f));
        ((MaterialButton) jButton_Main).setType(MaterialButton.Type.FLAT);
        ((MaterialTextField) jTextField1).setLabel("Swing Material Design Text Field");

        String x = String.valueOf(MaterialIcons.EXIT_TO_APP);
        this.setBackground(MaterialColor.TRANSPARENT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_MainPanel = new MaterialPanel();
        jPanel_TitleBar = new javax.swing.JPanel();
        jButton_Close = new MaterialButton();
        jButton_Maximize = new MaterialButton();
        jButton_Minimize = new MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Main = new MaterialPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new MaterialComboBox<>();
        jTextField1 = new MaterialTextField();
        jButton_Main = new MaterialButton();
        jButton_Main1 = new MaterialButton();
        jToolBar_Status = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MobyDroid");
        setUndecorated(true);

        jPanel_TitleBar.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_TitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_TitleBarMouseDragged(evt);
            }
        });
        jPanel_TitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_TitleBarMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_TitleBarMouseClicked(evt);
            }
        });

        jButton_Close.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Close.setFont(MaterialIcons.ICON_FONT.deriveFont(20f));
        jButton_Close.setText(String.valueOf(MaterialIcons.CLOSE));
        jButton_Close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });

        jButton_Maximize.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Maximize.setFont(MaterialIcons.ICON_FONT.deriveFont(20f));
        jButton_Maximize.setText(String.valueOf(MaterialIcons.FULLSCREEN));
        jButton_Maximize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Maximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MaximizeActionPerformed(evt);
            }
        });

        jButton_Minimize.setBackground(new java.awt.Color(255, 102, 0));
        jButton_Minimize.setFont(MaterialIcons.ICON_FONT.deriveFont(20f));
        jButton_Minimize.setText(String.valueOf(MaterialIcons.EXPAND_MORE));
        jButton_Minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinimizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(Roboto.BOLD.deriveFont(18f));
        jLabel1.setText("Swing Material Design");
        jLabel1.setToolTipText("MobyDroid");

        javax.swing.GroupLayout jPanel_TitleBarLayout = new javax.swing.GroupLayout(jPanel_TitleBar);
        jPanel_TitleBar.setLayout(jPanel_TitleBarLayout);
        jPanel_TitleBarLayout.setHorizontalGroup(
            jPanel_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
                .addComponent(jButton_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton_Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel_TitleBarLayout.setVerticalGroup(
            jPanel_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleBarLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jLabel2.setFont(Roboto.REGULAR.deriveFont(14f));
        jLabel2.setText("Material CheckBox :");
        jLabel2.setToolTipText("MobyDroid");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setText("Swing Material Design");

        javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
        jPanel_Main.setLayout(jPanel_MainLayout);
        jPanel_MainLayout.setHorizontalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel_MainLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_MainLayout.setVerticalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jButton_Main.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Main.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Main.setText("Flat Button");
        jButton_Main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MainActionPerformed(evt);
            }
        });

        jButton_Main1.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Main1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Main1.setText("Default Button");
        jButton_Main1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Main1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Main1ActionPerformed(evt);
            }
        });

        jToolBar_Status.setFloatable(false);
        jToolBar_Status.setRollover(true);

        javax.swing.GroupLayout jPanel_MainPanelLayout = new javax.swing.GroupLayout(jPanel_MainPanel);
        jPanel_MainPanel.setLayout(jPanel_MainPanelLayout);
        jPanel_MainPanelLayout.setHorizontalGroup(
            jPanel_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Main1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel_TitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar_Status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_MainPanelLayout.setVerticalGroup(
            jPanel_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel_TitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton_Main1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel_MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_MainActionPerformed

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        //this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        exitHandle();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_MaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MaximizeActionPerformed
        maximizeHandle();
    }//GEN-LAST:event_jButton_MaximizeActionPerformed

    private void jButton_MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinimizeActionPerformed
        this.setExtendedState(this.getExtendedState() | JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton_MinimizeActionPerformed

    private void jPanel_TitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_TitleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        // Move frame by the mouse delta
        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_jPanel_TitleBarMouseDragged

    private void jPanel_TitleBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_TitleBarMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
            maximizeHandle();
        }
    }//GEN-LAST:event_jPanel_TitleBarMouseClicked

    private int lastX = 0;
    private int lastY = 0;
    private void jPanel_TitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_TitleBarMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1 && (this.getExtendedState() & JFrame.MAXIMIZED_BOTH) != JFrame.MAXIMIZED_BOTH) {
            lastX = evt.getXOnScreen();
            lastY = evt.getYOnScreen();
        }
    }//GEN-LAST:event_jPanel_TitleBarMousePressed

    private void jButton_Main1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Main1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Main1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Main;
    private javax.swing.JButton jButton_Main1;
    private javax.swing.JButton jButton_Maximize;
    private javax.swing.JButton jButton_Minimize;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_Main;
    private javax.swing.JPanel jPanel_MainPanel;
    private javax.swing.JPanel jPanel_TitleBar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar_Status;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    private void exitHandle() {
        // ask
        Object[] options = {"Yes", "No"};
        int retStatus = JOptionPane.showOptionDialog(this, "Are you sure ?", "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[1]); //default button title        
        if (retStatus == 0) {
            System.exit(0);
        }
    }

    /**
     *
     */
    private void maximizeHandle() {
        if ((this.getExtendedState() & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH) {
            this.setExtendedState(this.getExtendedState() & ~JFrame.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        }
    }
}