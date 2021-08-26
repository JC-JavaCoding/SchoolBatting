/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author jjaac
 */
public class StrategyOutput extends javax.swing.JFrame
{
    
    /**
     * Creates new form StrategyOutput
     */
    public StrategyOutput()
    {
        initComponents();
        setLocation(null);

    }
    
    public String traceBack;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        back_Button = new javax.swing.JButton();
        save_Button = new javax.swing.JButton();
        saveStratName_Label = new javax.swing.JLabel();
        stratName_Field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputList = new javax.swing.JList<>();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1290, 1080));
        setMinimumSize(new java.awt.Dimension(16, 9));
        setPreferredSize(new java.awt.Dimension(1290, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 100, 60));

        save_Button.setText("Save");
        getContentPane().add(save_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 855, 90, 60));

        saveStratName_Label.setForeground(new java.awt.Color(33, 33, 33));
        saveStratName_Label.setText("What would you like to save your Strategy as?");
        getContentPane().add(saveStratName_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 270, -1));
        getContentPane().add(stratName_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 240, -1));

        outputList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(outputList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 550, 370));

        backgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jcj\\Documents\\NetBeansProjects\\PAT\\EOY_PAT\\src\\main\\resources\\images\\F1Lights3.png")); // NOI18N
        backgroundLabel.setMinimumSize(null);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back_ButtonActionPerformed
    {//GEN-HEADEREND:event_back_ButtonActionPerformed
        // TODO add your handling code here:
    	
    	
    	if (traceBack.equals("login"))
        {
            new F1Login().setVisible(true);
        }
        else 
        {
            new User_Race_Pit_InputScreen().setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(StrategyOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(StrategyOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(StrategyOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(StrategyOutput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new StrategyOutput().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> outputList;
    private javax.swing.JLabel saveStratName_Label;
    private javax.swing.JButton save_Button;
    private javax.swing.JTextField stratName_Field;
    // End of variables declaration//GEN-END:variables
}
