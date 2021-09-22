/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjaac
 */
public class User_Race_Pit_InputScreen extends javax.swing.JFrame
{

    /**
     * Creates new form User_Race_Pit_InputScreen
     */
    public User_Race_Pit_InputScreen()
    {
        initComponents();
        setLocation(590, 360);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        next_Button = new javax.swing.JButton();
        back_Button = new javax.swing.JButton();
        raceDistance_Label = new javax.swing.JLabel();
        raceDistance_Field = new javax.swing.JTextField();
        pitTime_Label = new javax.swing.JLabel();
        pitTime_Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        next_Button.setText("Next");
        next_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                next_ButtonActionPerformed(evt);
            }
        });

        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                back_ButtonActionPerformed(evt);
            }
        });

        raceDistance_Label.setText("How many laps does the race consist of?");

        pitTime_Label.setText("Average pit-lane time?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raceDistance_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(raceDistance_Field)
                            .addComponent(pitTime_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(pitTime_Field))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(raceDistance_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raceDistance_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pitTime_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pitTime_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next_Button)
                    .addComponent(back_Button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back_ButtonActionPerformed
    {//GEN-HEADEREND:event_back_ButtonActionPerformed
        // TODO add your handling code here:
        new User_Tyre_InputScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void next_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_next_ButtonActionPerformed
    {//GEN-HEADEREND:event_next_ButtonActionPerformed
        String raceDist = raceDistance_Field.getText(), pitTime = pitTime_Field.getText();
        
        try
        {
            // TODO add your handling code here:
            //to add info to the "info.txt" file
            FileWriter info = new FileWriter("info.txt", true);
            info.append("#"+ raceDist +"#"+ pitTime);
            info.close();
        } catch (IOException ex)
        {
            Logger.getLogger(User_Race_Pit_InputScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //to go to output screen:
//        StrategyOutput so = new StrategyOutput();
//        so.setVisible(true);
//        so.traceBack = "Input";
        
        dispose();
    }//GEN-LAST:event_next_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(User_Race_Pit_InputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(User_Race_Pit_InputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(User_Race_Pit_InputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(User_Race_Pit_InputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new User_Race_Pit_InputScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JButton next_Button;
    private javax.swing.JTextField pitTime_Field;
    private javax.swing.JLabel pitTime_Label;
    private javax.swing.JTextField raceDistance_Field;
    private javax.swing.JLabel raceDistance_Label;
    // End of variables declaration//GEN-END:variables
}