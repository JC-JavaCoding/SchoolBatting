/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;

/**
 *
 * @author Jcj
 */
public class TeacherScreen extends javax.swing.JFrame
{

    /**
     * Creates new form TeacherScreen
     */
    public TeacherScreen()
    {
//        setSize(Toolkit.getDefaultToolkit().getScreenSize());
//        int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
//        int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
        
        initComponents();
        setLocationRelativeTo(null);
        /*
        headerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        headerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 462, 129));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout addTeacher_PanelLayout = new javax.swing.GroupLayout(addTeacher_Panel);
        addTeacher_Panel.setLayout(addTeacher_PanelLayout);
        addTeacher_PanelLayout.setHorizontalGroup(
            addTeacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        addTeacher_PanelLayout.setVerticalGroup(
            addTeacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add Teacher", addTeacher_Panel);

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Find Batting Teacher", findBatter_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        */
//        //header panel
//        int hHeight = (int) (screenH * 0.144);
//        headerPanel.setBounds(0, 0, getWidth(), hHeight);
//        
//        //~Exit button
//        if(screenW != Toolkit.getDefaultToolkit().getScreenSize().width)
//        {
//            headerPanel.remove(jButton1);
//            
//            int exitB_Side = screenW / 100;
//            int exitBX = (int) ( screenW - exitB_Side - screenW *(1.0/160) );
//            int exitBY = (int)(screenH - screenH*(1.0/90));
//            jButton1.setFont(new Font("Segoe UI", 1, (int)(exitB_Side*0.75)));
//            
//            headerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(exitBX, exitBY, -1, -1));
//            
//            getContentPane().removeAll();
//            
//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            
//            layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(layout.createSequentialGroup()
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jTabbedPane1)
//                        .addComponent(headerPanel))
//                    .addGap(0, 0, 0)
//                )
//            );
//            
//            layout.setVerticalGroup(
//                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                    .addComponent(headerPanel)
//                                    .addGap(0, 0, 0)
//                                    .addComponent(jTabbedPane1)
//                                    .addGap(0, 0, 0)
//                            )
//                    )
//            );
//            
//            pack();
//        }
//        
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

        headerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        ManageTeachers_Panel = new javax.swing.JPanel();
        manageT_HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timetableTable = new javax.swing.JTable();
        addTeacherButton = new javax.swing.JRadioButton();
        batweightLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        teacherComboBox = new javax.swing.JComboBox<>();
        batWeightField = new javax.swing.JTextField();
        registerClass_Field = new javax.swing.JTextField();
        extraMuralsNr_Text = new javax.swing.JTextField();
        rightAddSplitter = new javax.swing.JSeparator();
        leftAddSplitter = new javax.swing.JSeparator();
        addTeacherLabel = new javax.swing.JLabel();
        addTeacherSurnameField = new javax.swing.JTextField();
        addTeacherNameField = new javax.swing.JTextField();
        addTeacherEMuralsSpinner = new javax.swing.JSpinner();
        editableButton1 = new javax.swing.JRadioButton();
        findBatter_Panel = new javax.swing.JPanel();
        findBatter_HeaderPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1980, 1080));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headerPanel.setMaximumSize(new java.awt.Dimension(1042, 129));
        headerPanel.setName(""); // NOI18N
        headerPanel.setPreferredSize(new java.awt.Dimension(1600, 130));

        jButton1.setBackground(headerPanel.getBackground());
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(new java.awt.Dimension(20, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(1, 1));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(700, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 707, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        jTabbedPane.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        ManageTeachers_Panel.setBackground(new java.awt.Color(255, 255, 255));

        manageT_HeaderPanel.setBackground(jTabbedPane.getBackground());

        jLabel2.setBackground(ManageTeachers_Panel.getBackground());
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE TEACHERS");

        javax.swing.GroupLayout manageT_HeaderPanelLayout = new javax.swing.GroupLayout(manageT_HeaderPanel);
        manageT_HeaderPanel.setLayout(manageT_HeaderPanelLayout);
        manageT_HeaderPanelLayout.setHorizontalGroup(
            manageT_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageT_HeaderPanelLayout.createSequentialGroup()
                .addGap(625, 625, 625)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageT_HeaderPanelLayout.setVerticalGroup(
            manageT_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageT_HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        timetableTable.setBackground(ManageTeachers_Panel.getBackground());
        timetableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Days", "lesson 1", "lesson 2", "lesson 3", "lesson 4", "lesson 5", "lesson 6", "lesson 7", "lesson 8", "lesson 9", "lesson 10", "lesson 11", "lesson 12", "lesson 13", "lesson 14"
            }
        ));
        jScrollPane1.setViewportView(timetableTable);

        addTeacherButton.setText("Add Teacher");

        batweightLabel.setText("Batting Wight:");

        jLabel5.setText("Register Class:(True/False)");

        jLabel6.setText("Extramurals:");

        teacherComboBox.setBackground(ManageTeachers_Panel.getBackground());
        teacherComboBox.setForeground(new java.awt.Color(153, 153, 153));
        teacherComboBox.setMaximumRowCount(30);
        teacherComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        teacherComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true), "Select teacher"));

        registerClass_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                registerClass_FieldActionPerformed(evt);
            }
        });

        rightAddSplitter.setForeground(new java.awt.Color(204, 0, 0));
        rightAddSplitter.setToolTipText("");
        rightAddSplitter.setName(""); // NOI18N

        addTeacherLabel.setBackground(new java.awt.Color(255, 255, 255));
        addTeacherLabel.setForeground(new java.awt.Color(204, 0, 0));
        addTeacherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addTeacherLabel.setText("Add Teacher");

        addTeacherSurnameField.setBackground(ManageTeachers_Panel.getBackground());
        addTeacherSurnameField.setText("e.g Jeanett");
        addTeacherSurnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Teacher Surname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        addTeacherSurnameField.setEnabled(false);

        addTeacherNameField.setBackground(ManageTeachers_Panel.getBackground());
        addTeacherNameField.setText("e.g Jeanett");
        addTeacherNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Teacher Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        addTeacherNameField.setEnabled(false);

        addTeacherEMuralsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        addTeacherEMuralsSpinner.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra murals"));
        addTeacherEMuralsSpinner.setOpaque(true);

        editableButton1.setText("editable");
        editableButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editableButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageTeachers_PanelLayout = new javax.swing.GroupLayout(ManageTeachers_Panel);
        ManageTeachers_Panel.setLayout(ManageTeachers_PanelLayout);
        ManageTeachers_PanelLayout.setHorizontalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(leftAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(addTeacherSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151)
                                        .addComponent(addTeacherEMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addComponent(addTeacherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rightAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(batweightLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(addTeacherButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addComponent(teacherComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(758, 758, 758))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(410, 410, 410)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)))))
                        .addContainerGap())
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
            .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                    .addContainerGap(1634, Short.MAX_VALUE)
                    .addComponent(editableButton1)
                    .addGap(16, 16, 16)))
        );
        ManageTeachers_PanelLayout.setVerticalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addTeacherButton))
                        .addGap(18, 18, 18)
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(batweightLabel)
                                .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(leftAddSplitter, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherLabel))
                .addGap(18, 18, 18)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTeacherSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherEMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(editableButton1)
                    .addContainerGap(563, Short.MAX_VALUE)))
        );

        jTabbedPane.addTab("Manage Teachers", ManageTeachers_Panel);

        findBatter_Panel.setBackground(new java.awt.Color(255, 255, 255));

        findBatter_HeaderPanel.setBackground(jTabbedPane.getBackground());

        jLabel3.setBackground(findBatter_HeaderPanel.getBackground());
        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIND BATTING TEACHER");

        javax.swing.GroupLayout findBatter_HeaderPanelLayout = new javax.swing.GroupLayout(findBatter_HeaderPanel);
        findBatter_HeaderPanel.setLayout(findBatter_HeaderPanelLayout);
        findBatter_HeaderPanelLayout.setHorizontalGroup(
            findBatter_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_HeaderPanelLayout.createSequentialGroup()
                .addGap(623, 623, 623)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        findBatter_HeaderPanelLayout.setVerticalGroup(
            findBatter_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_PanelLayout.createSequentialGroup()
                .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane.addTab("Find Batting Teacher", findBatter_Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1891, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseClicked
    {//GEN-HEADEREND:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        // TODO add your handling code here:
//        int mouseX = evt.getXOnScreen();
//        int mouseY = evt.getYOnScreen();
//        getContentPane().setLocation(
//                evt.getXOnScreen() - evt.getX(), 
//                evt.getYOnScreen() - evt.getY()
//        );
    }//GEN-LAST:event_formMouseDragged

    private void registerClass_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_registerClass_FieldActionPerformed
    {//GEN-HEADEREND:event_registerClass_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerClass_FieldActionPerformed

    private void editableButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editableButton1ActionPerformed
    {//GEN-HEADEREND:event_editableButton1ActionPerformed
        // TODO add your handling code here:
        teacherComboBox.setEditable(true);
    }//GEN-LAST:event_editableButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        try
        {
             javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        */
        
        try
        {
            javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
            
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TeacherScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageTeachers_Panel;
    private javax.swing.JRadioButton addTeacherButton;
    private javax.swing.JSpinner addTeacherEMuralsSpinner;
    private javax.swing.JLabel addTeacherLabel;
    private javax.swing.JTextField addTeacherNameField;
    private javax.swing.JTextField addTeacherSurnameField;
    private javax.swing.JTextField batWeightField;
    private javax.swing.JLabel batweightLabel;
    private javax.swing.JRadioButton editableButton1;
    private javax.swing.JTextField extraMuralsNr_Text;
    private javax.swing.JPanel findBatter_HeaderPanel;
    private javax.swing.JPanel findBatter_Panel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JSeparator leftAddSplitter;
    private javax.swing.JPanel manageT_HeaderPanel;
    private javax.swing.JTextField registerClass_Field;
    private javax.swing.JSeparator rightAddSplitter;
    private javax.swing.JComboBox<String> teacherComboBox;
    private javax.swing.JTable timetableTable;
    // End of variables declaration//GEN-END:variables
}
