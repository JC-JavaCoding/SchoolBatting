/*
 * Click nbfs://nbhos            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
            {
                throw new UnsupportedOperationExcep            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
tion("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object getCellEditorValue()
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isCellEditable(EventObject anEvent)
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean shouldSelectCell(EventObject anEvent)
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean stopCellEditing()
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void cancelCellEditing()
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void addCellEditorListener(CellEditorListener l)
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void removeCellEditorListener(CellEditorListener l)
            {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Backend.BattingLesson;
import Backend.BattingManager;
import Backend.Cell;
import Backend.Teacher;
import Backend.TeacherManager;
import Backend.TimeTable;
import com.formdev.flatlaf.ui.FlatArrowButton;
import com.formdev.flatlaf.ui.FlatComboBoxUI;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author Jcj
 */
public class TeacherScreen1 extends javax.swing.JFrame
{

    /**
     * Creates new form TeacherScreen
     */
    public TeacherScreen1()
    {
         initComponents();  
         
         Month [] monthArr = {Month.JANUARY,
         Month.FEBRUARY,
         Month.MARCH,
         Month.APRIL,
         Month.MAY,
         Month.JUNE,
         Month.JULY,
         Month.AUGUST,
         Month.SEPTEMBER,
         Month.OCTOBER,
         Month.NOVEMBER,
         Month.DECEMBER
         };
         
         JTable [] battingCalendarArr = {tblJanBatting, tblFebBatting, tblMarBatting, tblAprBatting, tblMayBatting, tblJunBatting, tblJulBatting, tblAugBatting, tblSepBatting, tblOctBatting, tblNovBatting, tblDecBatting};
         JTable [] selectBattingMonthArr = {tblJanWeeks, tblFebWeeks, tblMarchWeeks, tblAprilWeeks, tblMayWeeks, tblJuneWeeks, tblJulyWeeks, tblAugWeeks, tblSeptWeeks, tblOctWeeks, tblNovWeeks, tblDecWeeks};
         
         for(int i = 0; i < 12; i++)
         {
             setBattingMonthCalendar(monthArr[i], battingCalendarArr[i]);
             setBattingMonthCalendar(monthArr[i], selectBattingMonthArr[i]);
         }
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        ManageTeachers_Panel = new javax.swing.JPanel();
        manageT_HeaderPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editableButton = new javax.swing.JRadioButton();
        teacherComboBox = new javax.swing.JComboBox<>();
        batWeightField = new javax.swing.JTextField();
        registerClassOutput_Field = new javax.swing.JTextField();
        extraMuralsNr_Text = new javax.swing.JTextField();
        confirmEditsButton = new javax.swing.JButton();
 confirmEditsButton.setVisible(false);
        jScrollPane30 = new javax.swing.JScrollPane();
        tblViewTimeTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        deleteTeacherButton = new javax.swing.JButton();
        findBatter_Panel = new javax.swing.JPanel();
        findBatter_HeaderPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lessonInputPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        chooseLessonLAbel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lessonInputTable = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        chooseDayLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        findTeacherButton = new javax.swing.JButton();
        tblBatWeek = new javax.swing.JTabbedPane();
        weeksJanuary = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblJanWeeks = new javax.swing.JTable();
        weeksFebruary = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFebWeeks = new javax.swing.JTable();
        weeksMarch = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblMarchWeeks = new javax.swing.JTable();
        weeksApril = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblAprilWeeks = new javax.swing.JTable();
        weeksMay = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblMayWeeks = new javax.swing.JTable();
        weeksJune = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tblJuneWeeks = new javax.swing.JTable();
        weeksJuly = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblJulyWeeks = new javax.swing.JTable();
        weeksAugust = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tblAugWeeks = new javax.swing.JTable();
        weeksSeptember = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblSeptWeeks = new javax.swing.JTable();
        weeksOctober = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tblOctWeeks = new javax.swing.JTable();
        weeksNovember = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblNovWeeks = new javax.swing.JTable();
        weeksDecember = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblDecWeeks = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        chooseLessonLAbel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        chooseTeacherButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTeacherList = new javax.swing.JList<>();
        deleteBattingTeacherButton = new javax.swing.JButton();
        outputCalendarTabbedPane = new javax.swing.JTabbedPane();
        tabJanuary = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJanBatting = new javax.swing.JTable();
        //for(int row = 0; row < tblJanBatting.getModel().getRowCount(); row++)
        //{
            //    for( int col = 0; col < tblJanBatting.getColumnCount(); col ++)
            //    {
                //        tblJanBatting.setDefaultRenderer(String[].class, new TableCellRenderer()
                    //        {
                        //            @Override
                        //            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col)
                        //            {
                            //                if (value instanceof String [])
                            //                {
                                //                    setListData( (String []) value);
                                //                }
                            //            }
                        //        });
                //    }
            //}
        tabFebruary = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblFebBatting = new javax.swing.JTable();
        tabMarch = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblMarBatting = new javax.swing.JTable();
        tabApril = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAprBatting = new javax.swing.JTable();
        tabMay = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblMayBatting = new javax.swing.JTable();
        tabJune = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblJunBatting = new javax.swing.JTable();
        tabJuly = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblJulBatting = new javax.swing.JTable();
        tabAugust = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblAugBatting = new javax.swing.JTable();
        tabSeptember = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSepBatting = new javax.swing.JTable();
        tabOctober = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblOctBatting = new javax.swing.JTable();
        tabNovember = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblNovBatting = new javax.swing.JTable();
        tabDecember = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblDecBatting = new javax.swing.JTable();
        addTeacherPane = new javax.swing.JPanel();
        teacherExtraMuralsSpinner = new javax.swing.JSpinner();
        teacherExtraMuralsSpinner.setBackground(Color.white);
        addTeacherNameField = new javax.swing.JTextField();
        registerClass_Field = new javax.swing.JTextField();
        batWeightOutputField2 = new javax.swing.JTextField();
        addTeacherHeaderPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        addTimeTableTbl = new javax.swing.JTable();
        addTeacherButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1980, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane.setPreferredSize(new java.awt.Dimension(1849, 761));

        ManageTeachers_Panel.setBackground(new java.awt.Color(255, 255, 255));
        ManageTeachers_Panel.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                ManageTeachers_PanelFocusGained(evt);
            }
        });

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
                .addContainerGap(641, Short.MAX_VALUE))
        );
        manageT_HeaderPanelLayout.setVerticalGroup(
            manageT_HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageT_HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        editableButton.setText("editable");
        editableButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editableButtonActionPerformed(evt);
            }
        });

        teacherComboBox.setUI(new FlatComboBoxUI()
        {
            @Override
            protected JButton createArrowButton()
            {
                //---style arrow button anyway you like
                JButton arrowButton = new JButton();
                arrowButton.setBorder(null);
                arrowButton.setBorderPainted(false);
                arrowButton.setText("V");
                arrowButton.setBackground(Color.getHSBColor(213, 89, 90));
                return arrowButton;
            }
        });
        //get values
        try
        {
            teacherComboBox.setModel(new DefaultComboBoxModel<> (tm.getTeacherNames()));
        } catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
        teacherComboBox.setBackground(ManageTeachers_Panel.getBackground());
        teacherComboBox.setBorder(new javax.swing.border.LineBorder(chooseTeacherButton.getBackground(), 1, true));
        teacherComboBox.setOpaque(true);
        teacherComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                teacherComboBoxActionPerformed(evt);
            }
        });

        batWeightField.setEditable(false);
        batWeightField.setBackground(getBackground());
        batWeightField.setForeground(new java.awt.Color(153, 153, 153));
        batWeightField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 117, 229), 1, true), "BattingWeight", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(25, 117, 229))); // NOI18N

        registerClassOutput_Field.setEditable(false);
        registerClassOutput_Field.setBackground(getBackground());
        registerClassOutput_Field.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 117, 229), 1, true), "Register Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(25, 117, 229))); // NOI18N
        registerClassOutput_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                registerClassOutput_FieldActionPerformed(evt);
            }
        });

        extraMuralsNr_Text.setEditable(false);
        extraMuralsNr_Text.setBackground(getBackground());
        extraMuralsNr_Text.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 117, 229), 1, true), "Extramural Hours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(25, 117, 229))); // NOI18N

        confirmEditsButton.setBackground(getBackground());
        confirmEditsButton.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        confirmEditsButton.setForeground(new java.awt.Color(25, 115, 230));
        confirmEditsButton.setText("confirm");
        confirmEditsButton.setBorder(null);
        confirmEditsButton.setBorderPainted(false);
        confirmEditsButton.setOpaque(true);
        confirmEditsButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                confirmEditsButtonMouseClicked(evt);
            }
        });

        tblViewTimeTable.setBackground(new java.awt.Color(255, 255, 255));
        tblViewTimeTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblViewTimeTable.setForeground(new java.awt.Color(153, 153, 153));
        tblViewTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Monday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Tuesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Wednesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Thursday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Friday", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Day", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12", "L13", "L14"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblViewTimeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblViewTimeTable.setCellSelectionEnabled(true);
        tblViewTimeTable.setEnabled(false);
        tblViewTimeTable.setGridColor(new java.awt.Color(51, 51, 51));
        tblViewTimeTable.setOpaque(false);
        tblViewTimeTable.setRowHeight(105);
        tblViewTimeTable.setRowMargin(1);
        tblViewTimeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblViewTimeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblViewTimeTable.setShowGrid(true);
        tblViewTimeTable.setSurrendersFocusOnKeystroke(true);
        tblViewTimeTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblViewTimeTableMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(tblViewTimeTable);
        tblViewTimeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel5.setBackground(getBackground());
        jLabel5.setForeground(new java.awt.Color(25, 117, 229));
        jLabel5.setText("Teacher Name");

        deleteTeacherButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteTeacherButton.setForeground(new java.awt.Color(204, 0, 0));
        deleteTeacherButton.setText("Delete teacher");
        deleteTeacherButton.setBorder(null);
        deleteTeacherButton.setBorderPainted(false);
        deleteTeacherButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteTeacherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageTeachers_PanelLayout = new javax.swing.GroupLayout(ManageTeachers_Panel);
        ManageTeachers_Panel.setLayout(ManageTeachers_PanelLayout);
        ManageTeachers_PanelLayout.setHorizontalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325)
                        .addComponent(registerClassOutput_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(377, 392, Short.MAX_VALUE)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editableButton)
                            .addComponent(confirmEditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageTeachers_PanelLayout.createSequentialGroup()
                        .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        ManageTeachers_PanelLayout.setVerticalGroup(
            ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                .addComponent(manageT_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(teacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteTeacherButton)))
                        .addGap(18, 18, 18)
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerClassOutput_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extraMuralsNr_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ManageTeachers_PanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(ManageTeachers_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editableButton)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(confirmEditsButton)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        try {
            selectedTeacher = tm.getTeacher((String)teacherComboBox.getSelectedItem());
        }catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
        setViewValues();

        jTabbedPane.addTab("Manage Teachers", ManageTeachers_Panel);

        findBatter_Panel.setBackground(new java.awt.Color(255, 255, 255));
        findBatter_Panel.setForeground(new java.awt.Color(255, 255, 255));
        findBatter_Panel.setPreferredSize(new java.awt.Dimension(1413, 761));

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
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        lessonInputPanel.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setForeground(new java.awt.Color(25, 115, 230));

        jSeparator2.setForeground(new java.awt.Color(25, 115, 230));

        chooseLessonLAbel.setBackground(lessonInputPanel.getBackground());
        chooseLessonLAbel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseLessonLAbel.setForeground(new java.awt.Color(25, 115, 230));
        chooseLessonLAbel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLessonLAbel.setText("Choose Lesson");

        lessonInputTable.setBackground(new java.awt.Color(255, 255, 255));
        lessonInputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Monday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Tuesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Wednesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Thursday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Friday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Saturday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Sunday", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Day", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12", "L13", "L14"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        lessonInputTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        lessonInputTable.setColumnSelectionAllowed(true);
        lessonInputTable.setOpaque(false);
        lessonInputTable.setRowHeight(30);
        lessonInputTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lessonInputTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lessonInputTable.setShowGrid(true);
        lessonInputTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                lessonInputTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(lessonInputTable);
        lessonInputTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jSeparator3.setForeground(new java.awt.Color(25, 115, 230));

        chooseDayLabel.setBackground(lessonInputPanel.getBackground());
        chooseDayLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseDayLabel.setForeground(new java.awt.Color(25, 115, 230));
        chooseDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseDayLabel.setText("Choose Week");

        jSeparator4.setForeground(new java.awt.Color(25, 115, 230));

        findTeacherButton.setBackground(chooseDayLabel.getForeground());
        findTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        findTeacherButton.setForeground(new java.awt.Color(204, 255, 255));
        findTeacherButton.setText("Find Your Cinderella");
        findTeacherButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                findTeacherButtonActionPerformed(evt);
            }
        });

        tblBatWeek.setBackground(lessonInputPanel.getBackground());
        tblBatWeek.setForeground(new java.awt.Color(204, 255, 255));
        tblBatWeek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblBatWeek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblBatWeek.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                tblBatWeekMousePressed(evt);
            }
        });

        weeksJanuary.setBackground(new java.awt.Color(255, 255, 255));

        tblJanWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblJanWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblJanWeeks.setModel(new javax.swing.table.DefaultTableModel()
        );
        tblJanWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJanWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblJanWeeks.getTableHeader().setReorderingAllowed(false);
        String [][] month = new String[6][7];
        LocalDate monthD = LocalDate.of(LocalDate.now().getYear(), Month.JANUARY, 1);

        int day = 1;
        for(int i = 0; i < month.length; i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = monthD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= monthD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }
        String [] colNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        tblJanWeeks.setModel(new DefaultTableModel(month, colNames));
        tblJanWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblJanWeeksMouseReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblJanWeeks);

        javax.swing.GroupLayout weeksJanuaryLayout = new javax.swing.GroupLayout(weeksJanuary);
        weeksJanuary.setLayout(weeksJanuaryLayout);
        weeksJanuaryLayout.setHorizontalGroup(
            weeksJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksJanuaryLayout.setVerticalGroup(
            weeksJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Jan", weeksJanuary);

        weeksFebruary.setBackground(new java.awt.Color(255, 255, 255));

        tblFebWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblFebWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblFebWeeks.setModel(new DefaultTableModel());
        tblFebWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblFebWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblFebWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String [5][7];
        LocalDate febD = LocalDate.of( LocalDate.now().getYear(), Month.FEBRUARY, 1);

        day = 1;
        for(int i = 0; i < month.length; i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = febD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length; j++)
            {
                if(day <= febD.lengthOfMonth()) month[i][j] = ""+ day++;
            }
        }

        tblFebWeeks.setModel(new DefaultTableModel(month, colNames));
        tblFebWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblFebWeeksMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblFebWeeks);

        javax.swing.GroupLayout weeksFebruaryLayout = new javax.swing.GroupLayout(weeksFebruary);
        weeksFebruary.setLayout(weeksFebruaryLayout);
        weeksFebruaryLayout.setHorizontalGroup(
            weeksFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksFebruaryLayout.setVerticalGroup(
            weeksFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Feb", weeksFebruary);

        weeksMarch.setBackground(new java.awt.Color(255, 255, 255));

        tblMarchWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblMarchWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblMarchWeeks.setModel(new DefaultTableModel());
        tblMarchWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMarchWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblMarchWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7];

        LocalDate marD = LocalDate.of(LocalDate.now().getYear(), Month.MARCH, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= marD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = marD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= marD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblMarchWeeks.setModel(new DefaultTableModel(month, colNames));
        tblMarchWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblMarchWeeksMouseReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblMarchWeeks);

        javax.swing.GroupLayout weeksMarchLayout = new javax.swing.GroupLayout(weeksMarch);
        weeksMarch.setLayout(weeksMarchLayout);
        weeksMarchLayout.setHorizontalGroup(
            weeksMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksMarchLayout.setVerticalGroup(
            weeksMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Mar", weeksMarch);

        weeksApril.setBackground(new java.awt.Color(255, 255, 255));

        tblAprilWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblAprilWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblAprilWeeks.setModel(new DefaultTableModel());
        tblAprilWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblAprilWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblAprilWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7];LocalDate aprD = LocalDate.of( LocalDate.now().getYear(), Month.APRIL, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= aprD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = aprD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= aprD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblAprilWeeks.setModel(new DefaultTableModel(month, colNames));
        tblAprilWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblAprilWeeksMouseReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblAprilWeeks);

        javax.swing.GroupLayout weeksAprilLayout = new javax.swing.GroupLayout(weeksApril);
        weeksApril.setLayout(weeksAprilLayout);
        weeksAprilLayout.setHorizontalGroup(
            weeksAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksAprilLayout.setVerticalGroup(
            weeksAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("April", weeksApril);

        weeksMay.setBackground(new java.awt.Color(255, 255, 255));

        tblMayWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblMayWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblMayWeeks.setModel(new DefaultTableModel());
        tblMayWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMayWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblMayWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7];
        LocalDate mayD = LocalDate.of( LocalDate.now().getYear(), Month.MAY, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= mayD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = mayD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= mayD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblMayWeeks.setModel(new DefaultTableModel(month, colNames));
        tblMayWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblMayWeeksMouseReleased(evt);
            }
        });
        jScrollPane20.setViewportView(tblMayWeeks);

        javax.swing.GroupLayout weeksMayLayout = new javax.swing.GroupLayout(weeksMay);
        weeksMay.setLayout(weeksMayLayout);
        weeksMayLayout.setHorizontalGroup(
            weeksMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksMayLayout.setVerticalGroup(
            weeksMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("May", weeksMay);

        weeksJune.setBackground(new java.awt.Color(255, 255, 255));

        tblJuneWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblJuneWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblJuneWeeks.setModel(new DefaultTableModel());
        tblJuneWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJuneWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblJuneWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate junD = LocalDate.of( LocalDate.now().getYear(), Month.JUNE, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= junD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = junD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= junD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblJuneWeeks.setModel(new DefaultTableModel(month, colNames));
        tblJuneWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblJuneWeeksMouseReleased(evt);
            }
        });
        jScrollPane21.setViewportView(tblJuneWeeks);
        if (tblJuneWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblJuneWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblJuneWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblJuneWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksJuneLayout = new javax.swing.GroupLayout(weeksJune);
        weeksJune.setLayout(weeksJuneLayout);
        weeksJuneLayout.setHorizontalGroup(
            weeksJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksJuneLayout.setVerticalGroup(
            weeksJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("June", weeksJune);

        weeksJuly.setBackground(new java.awt.Color(255, 255, 255));

        tblJulyWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblJulyWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblJulyWeeks.setModel(new DefaultTableModel());
        tblJulyWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJulyWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblJulyWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate julD = LocalDate.of( LocalDate.now().getYear(), Month.JULY, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= julD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = julD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= julD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblJulyWeeks.setModel(new DefaultTableModel(month, colNames));
        tblJulyWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblJulyWeeksMouseReleased(evt);
            }
        });
        jScrollPane22.setViewportView(tblJulyWeeks);
        if (tblJulyWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblJulyWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblJulyWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblJulyWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksJulyLayout = new javax.swing.GroupLayout(weeksJuly);
        weeksJuly.setLayout(weeksJulyLayout);
        weeksJulyLayout.setHorizontalGroup(
            weeksJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksJulyLayout.setVerticalGroup(
            weeksJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("July", weeksJuly);

        weeksAugust.setBackground(new java.awt.Color(255, 255, 255));

        tblAugWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblAugWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblAugWeeks.setModel(new DefaultTableModel());
        tblAugWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblAugWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblAugWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate augD = LocalDate.of( LocalDate.now().getYear(), Month.AUGUST, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= augD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = augD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= augD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblAugWeeks.setModel(new DefaultTableModel(month, colNames));
        tblAugWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblAugWeeksMouseReleased(evt);
            }
        });
        jScrollPane23.setViewportView(tblAugWeeks);
        if (tblAugWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblAugWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblAugWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblAugWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksAugustLayout = new javax.swing.GroupLayout(weeksAugust);
        weeksAugust.setLayout(weeksAugustLayout);
        weeksAugustLayout.setHorizontalGroup(
            weeksAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksAugustLayout.setVerticalGroup(
            weeksAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Aug", weeksAugust);

        weeksSeptember.setBackground(new java.awt.Color(255, 255, 255));

        tblSeptWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblSeptWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblSeptWeeks.setModel(new DefaultTableModel());
        tblSeptWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSeptWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblSeptWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate sepD = LocalDate.of( LocalDate.now().getYear(), Month.SEPTEMBER, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= sepD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = sepD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= sepD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblSeptWeeks.setModel(new DefaultTableModel(month, colNames));
        tblSeptWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblSeptWeeksMouseReleased(evt);
            }
        });
        jScrollPane24.setViewportView(tblSeptWeeks);
        if (tblSeptWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblSeptWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblSeptWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblSeptWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksSeptemberLayout = new javax.swing.GroupLayout(weeksSeptember);
        weeksSeptember.setLayout(weeksSeptemberLayout);
        weeksSeptemberLayout.setHorizontalGroup(
            weeksSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksSeptemberLayout.setVerticalGroup(
            weeksSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Sept", weeksSeptember);

        weeksOctober.setBackground(new java.awt.Color(255, 255, 255));

        tblOctWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblOctWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblOctWeeks.setModel(new DefaultTableModel());
        tblOctWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblOctWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblOctWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[6][7]; LocalDate octD = LocalDate.of( LocalDate.now().getYear(), Month.OCTOBER, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= octD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = octD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= sepD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblOctWeeks.setModel(new DefaultTableModel(month, colNames));
        tblOctWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblOctWeeksMouseReleased(evt);
            }
        });
        jScrollPane25.setViewportView(tblOctWeeks);
        if (tblOctWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblOctWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblOctWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblOctWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksOctoberLayout = new javax.swing.GroupLayout(weeksOctober);
        weeksOctober.setLayout(weeksOctoberLayout);
        weeksOctoberLayout.setHorizontalGroup(
            weeksOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksOctoberLayout.setVerticalGroup(
            weeksOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Oct", weeksOctober);

        weeksNovember.setBackground(new java.awt.Color(255, 255, 255));

        tblNovWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblNovWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblNovWeeks.setModel(new DefaultTableModel());
        tblNovWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblNovWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblNovWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate novD = LocalDate.of( LocalDate.now().getYear(), Month.NOVEMBER, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= novD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = novD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= novD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblNovWeeks.setModel(new DefaultTableModel(month, colNames));
        tblNovWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblNovWeeksMouseReleased(evt);
            }
        });
        jScrollPane26.setViewportView(tblNovWeeks);
        if (tblNovWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblNovWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblNovWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblNovWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksNovemberLayout = new javax.swing.GroupLayout(weeksNovember);
        weeksNovember.setLayout(weeksNovemberLayout);
        weeksNovemberLayout.setHorizontalGroup(
            weeksNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksNovemberLayout.setVerticalGroup(
            weeksNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Nov", weeksNovember);

        weeksDecember.setBackground(new java.awt.Color(255, 255, 255));

        tblDecWeeks.setBackground(new java.awt.Color(255, 255, 255));
        tblDecWeeks.setForeground(new java.awt.Color(153, 153, 153));
        tblDecWeeks.setModel(new DefaultTableModel());
        tblDecWeeks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDecWeeks.setGridColor(new java.awt.Color(102, 102, 102));
        tblDecWeeks.getTableHeader().setReorderingAllowed(false);
        month = new String[5][7]; LocalDate decD = LocalDate.of( LocalDate.now().getYear(), Month.DECEMBER, 1);

        day = 1;
        for(int i = 0; i < month.length && day <= decD.lengthOfMonth(); i++)
        {
            int j = 0;
            //get the month start day
            if(i == 0) j = decD.getDayOfWeek().getValue()-1;

            //for rest of month
            for(; j < month[i].length && day <= decD.lengthOfMonth(); j++)
            {
                month[i][j] = ""+ day++;
            }
        }

        tblDecWeeks.setModel(new DefaultTableModel(month, colNames));
        tblDecWeeks.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                tblDecWeeksMouseReleased(evt);
            }
        });
        jScrollPane27.setViewportView(tblDecWeeks);
        if (tblDecWeeks.getColumnModel().getColumnCount() > 0)
        {
            tblDecWeeks.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblDecWeeks.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblDecWeeks.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout weeksDecemberLayout = new javax.swing.GroupLayout(weeksDecember);
        weeksDecember.setLayout(weeksDecemberLayout);
        weeksDecemberLayout.setHorizontalGroup(
            weeksDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        weeksDecemberLayout.setVerticalGroup(
            weeksDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        tblBatWeek.addTab("Dec", weeksDecember);

        jSeparator5.setForeground(new java.awt.Color(25, 115, 230));

        chooseLessonLAbel1.setBackground(lessonInputPanel.getBackground());
        chooseLessonLAbel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        chooseLessonLAbel1.setForeground(new java.awt.Color(25, 115, 230));
        chooseLessonLAbel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseLessonLAbel1.setText("Output");

        jSeparator6.setForeground(new java.awt.Color(25, 115, 230));

        chooseTeacherButton.setBackground(chooseDayLabel.getForeground());
        chooseTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chooseTeacherButton.setForeground(new java.awt.Color(204, 255, 255));
        chooseTeacherButton.setText("Choose Batting Teacher");
        chooseTeacherButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chooseTeacherButtonActionPerformed(evt);
            }
        });

        outputTeacherList.setBackground(new java.awt.Color(255, 255, 255));
        outputTeacherList.setForeground(new java.awt.Color(25, 117, 229));
        outputTeacherList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Please select a week and batting lesson" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        outputTeacherList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(outputTeacherList);

        deleteBattingTeacherButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteBattingTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBattingTeacherButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteBattingTeacherButton.setText("Delete Batting");
        deleteBattingTeacherButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 1, true));

        javax.swing.GroupLayout lessonInputPanelLayout = new javax.swing.GroupLayout(lessonInputPanel);
        lessonInputPanel.setLayout(lessonInputPanelLayout);
        lessonInputPanelLayout.setHorizontalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findTeacherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseLessonLAbel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblBatWeek)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(chooseLessonLAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(chooseDayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lessonInputPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(chooseTeacherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBattingTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        lessonInputPanelLayout.setVerticalGroup(
            lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lessonInputPanelLayout.createSequentialGroup()
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(chooseDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblBatWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseLessonLAbel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findTeacherButton)
                .addGap(0, 0, 0)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseLessonLAbel1)
                    .addGroup(lessonInputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lessonInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseTeacherButton)
                    .addComponent(deleteBattingTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        outputCalendarTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        outputCalendarTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        outputCalendarTabbedPane.setFocusable(false);
        outputCalendarTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tabJanuary.setBackground(new java.awt.Color(255, 255, 255));

        tblJanBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblJanBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblJanBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblJanBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJanBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblJanBatting.setRowHeight(110);
        tblJanBatting.setRowSelectionAllowed(false);
        tblJanBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblJanBatting);
        if (tblJanBatting.getColumnModel().getColumnCount() > 0)
        {
            tblJanBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblJanBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblJanBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJanuaryLayout = new javax.swing.GroupLayout(tabJanuary);
        tabJanuary.setLayout(tabJanuaryLayout);
        tabJanuaryLayout.setHorizontalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabJanuaryLayout.setVerticalGroup(
            tabJanuaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jan", tabJanuary);

        tabFebruary.setBackground(new java.awt.Color(255, 255, 255));

        tblFebBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblFebBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblFebBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblFebBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblFebBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblFebBatting.setRowHeight(110);
        tblFebBatting.setRowSelectionAllowed(false);
        tblFebBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tblFebBatting);
        if (tblFebBatting.getColumnModel().getColumnCount() > 0)
        {
            tblFebBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblFebBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblFebBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabFebruaryLayout = new javax.swing.GroupLayout(tabFebruary);
        tabFebruary.setLayout(tabFebruaryLayout);
        tabFebruaryLayout.setHorizontalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabFebruaryLayout.setVerticalGroup(
            tabFebruaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Feb", tabFebruary);

        tabMarch.setBackground(new java.awt.Color(255, 255, 255));

        tblMarBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblMarBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblMarBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblMarBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMarBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblMarBatting.setRowHeight(110);
        tblMarBatting.setRowSelectionAllowed(false);
        tblMarBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tblMarBatting);
        if (tblMarBatting.getColumnModel().getColumnCount() > 0)
        {
            tblMarBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblMarBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblMarBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabMarchLayout = new javax.swing.GroupLayout(tabMarch);
        tabMarch.setLayout(tabMarchLayout);
        tabMarchLayout.setHorizontalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabMarchLayout.setVerticalGroup(
            tabMarchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Mar", tabMarch);

        tabApril.setBackground(new java.awt.Color(255, 255, 255));

        tblAprBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblAprBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblAprBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblAprBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblAprBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblAprBatting.setRowHeight(110);
        tblAprBatting.setRowSelectionAllowed(false);
        tblAprBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tblAprBatting);
        if (tblAprBatting.getColumnModel().getColumnCount() > 0)
        {
            tblAprBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblAprBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblAprBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabAprilLayout = new javax.swing.GroupLayout(tabApril);
        tabApril.setLayout(tabAprilLayout);
        tabAprilLayout.setHorizontalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabAprilLayout.setVerticalGroup(
            tabAprilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Apr", tabApril);

        tabMay.setBackground(new java.awt.Color(255, 255, 255));

        tblMayBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblMayBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblMayBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblMayBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMayBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblMayBatting.setRowHeight(110);
        tblMayBatting.setRowSelectionAllowed(false);
        tblMayBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tblMayBatting);
        if (tblMayBatting.getColumnModel().getColumnCount() > 0)
        {
            tblMayBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblMayBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblMayBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabMayLayout = new javax.swing.GroupLayout(tabMay);
        tabMay.setLayout(tabMayLayout);
        tabMayLayout.setHorizontalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabMayLayout.setVerticalGroup(
            tabMayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("May", tabMay);

        tabJune.setBackground(new java.awt.Color(255, 255, 255));

        tblJunBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblJunBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblJunBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblJunBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJunBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblJunBatting.setRowHeight(110);
        tblJunBatting.setRowSelectionAllowed(false);
        tblJunBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tblJunBatting);
        if (tblJunBatting.getColumnModel().getColumnCount() > 0)
        {
            tblJunBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblJunBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblJunBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJuneLayout = new javax.swing.GroupLayout(tabJune);
        tabJune.setLayout(tabJuneLayout);
        tabJuneLayout.setHorizontalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabJuneLayout.setVerticalGroup(
            tabJuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jun", tabJune);

        tabJuly.setBackground(new java.awt.Color(255, 255, 255));

        tblJulBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblJulBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblJulBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblJulBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblJulBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblJulBatting.setRowHeight(110);
        tblJulBatting.setRowSelectionAllowed(false);
        tblJulBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tblJulBatting);
        if (tblJulBatting.getColumnModel().getColumnCount() > 0)
        {
            tblJulBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblJulBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblJulBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabJulyLayout = new javax.swing.GroupLayout(tabJuly);
        tabJuly.setLayout(tabJulyLayout);
        tabJulyLayout.setHorizontalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabJulyLayout.setVerticalGroup(
            tabJulyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Jul", tabJuly);

        tabAugust.setBackground(new java.awt.Color(255, 255, 255));

        tblAugBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblAugBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblAugBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblAugBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblAugBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblAugBatting.setRowHeight(110);
        tblAugBatting.setRowSelectionAllowed(false);
        tblAugBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tblAugBatting);
        if (tblAugBatting.getColumnModel().getColumnCount() > 0)
        {
            tblAugBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblAugBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblAugBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabAugustLayout = new javax.swing.GroupLayout(tabAugust);
        tabAugust.setLayout(tabAugustLayout);
        tabAugustLayout.setHorizontalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabAugustLayout.setVerticalGroup(
            tabAugustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Aug", tabAugust);

        tabSeptember.setBackground(new java.awt.Color(255, 255, 255));

        tblSepBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblSepBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblSepBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblSepBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSepBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblSepBatting.setRowHeight(110);
        tblSepBatting.setRowSelectionAllowed(false);
        tblSepBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tblSepBatting);
        if (tblSepBatting.getColumnModel().getColumnCount() > 0)
        {
            tblSepBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblSepBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblSepBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabSeptemberLayout = new javax.swing.GroupLayout(tabSeptember);
        tabSeptember.setLayout(tabSeptemberLayout);
        tabSeptemberLayout.setHorizontalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabSeptemberLayout.setVerticalGroup(
            tabSeptemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Sep", tabSeptember);

        tabOctober.setBackground(new java.awt.Color(255, 255, 255));

        tblOctBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblOctBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblOctBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblOctBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblOctBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblOctBatting.setRowHeight(110);
        tblOctBatting.setRowSelectionAllowed(false);
        tblOctBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(tblOctBatting);
        if (tblOctBatting.getColumnModel().getColumnCount() > 0)
        {
            tblOctBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblOctBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblOctBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabOctoberLayout = new javax.swing.GroupLayout(tabOctober);
        tabOctober.setLayout(tabOctoberLayout);
        tabOctoberLayout.setHorizontalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabOctoberLayout.setVerticalGroup(
            tabOctoberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Oct", tabOctober);

        tabNovember.setBackground(new java.awt.Color(255, 255, 255));

        tblNovBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblNovBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblNovBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblNovBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblNovBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblNovBatting.setRowHeight(110);
        tblNovBatting.setRowSelectionAllowed(false);
        tblNovBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(tblNovBatting);
        if (tblNovBatting.getColumnModel().getColumnCount() > 0)
        {
            tblNovBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblNovBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblNovBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabNovemberLayout = new javax.swing.GroupLayout(tabNovember);
        tabNovember.setLayout(tabNovemberLayout);
        tabNovemberLayout.setHorizontalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabNovemberLayout.setVerticalGroup(
            tabNovemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Nov", tabNovember);

        tabDecember.setBackground(new java.awt.Color(255, 255, 255));

        tblDecBatting.setBackground(new java.awt.Color(255, 255, 255));
        tblDecBatting.setForeground(new java.awt.Color(153, 153, 153));
        tblDecBatting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3", "4", "5", "6", "7"},
                {"8", "9", "10", "11", "12", "13", "14"},
                {"15", "16", "17", "18", "19", "20", "21"},
                {"22", "23", "24", "25", "26", "27", "28"},
                {"29", "30", null, null, null, null, null}
            },
            new String []
            {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblDecBatting.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDecBatting.setGridColor(new java.awt.Color(102, 102, 102));
        tblDecBatting.setRowHeight(110);
        tblDecBatting.setRowSelectionAllowed(false);
        tblDecBatting.getTableHeader().setReorderingAllowed(false);
        jScrollPane19.setViewportView(tblDecBatting);
        if (tblDecBatting.getColumnModel().getColumnCount() > 0)
        {
            tblDecBatting.getColumnModel().getColumn(4).setHeaderValue("Friday");
            tblDecBatting.getColumnModel().getColumn(5).setHeaderValue("Saturday");
            tblDecBatting.getColumnModel().getColumn(6).setHeaderValue("Sunday");
        }

        javax.swing.GroupLayout tabDecemberLayout = new javax.swing.GroupLayout(tabDecember);
        tabDecember.setLayout(tabDecemberLayout);
        tabDecemberLayout.setHorizontalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        tabDecemberLayout.setVerticalGroup(
            tabDecemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        outputCalendarTabbedPane.addTab("Dec", tabDecember);

        javax.swing.GroupLayout findBatter_PanelLayout = new javax.swing.GroupLayout(findBatter_Panel);
        findBatter_Panel.setLayout(findBatter_PanelLayout);
        findBatter_PanelLayout.setHorizontalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findBatter_PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lessonInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputCalendarTabbedPane)
                .addContainerGap())
        );
        findBatter_PanelLayout.setVerticalGroup(
            findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findBatter_PanelLayout.createSequentialGroup()
                .addComponent(findBatter_HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findBatter_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lessonInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputCalendarTabbedPane))
                .addGap(29, 29, 29))
        );

        jTabbedPane.addTab("Find Batting Teacher", findBatter_Panel);

        addTeacherPane.setBackground(ManageTeachers_Panel.getBackground());

        FlatArrowButton arrowButton = (FlatArrowButton) teacherExtraMuralsSpinner.getComponent(0);
arrowButton.setBackground(Color.white);
        teacherExtraMuralsSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        teacherExtraMuralsSpinner.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 117, 229), 1, true));
        teacherExtraMuralsSpinner.setDoubleBuffered(true);
        teacherExtraMuralsSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(teacherExtraMuralsSpinner, ""));
        teacherExtraMuralsSpinner.setOpaque(true);

        addTeacherNameField.setBackground(ManageTeachers_Panel.getBackground());
        addTeacherNameField.setText("e.g Jeanett Maria Jacobs");
        addTeacherNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 115, 230), 1, true), "Teacher Full Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(25, 115, 230))); // NOI18N
        addTeacherNameField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                addTeacherNameFieldKeyTyped(evt);
            }
        });

        registerClass_Field.setBackground(getBackground());
        registerClass_Field.setText("True/False");
        registerClass_Field.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(25, 115, 230)), "Has Register Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), chooseTeacherButton.getBackground())); // NOI18N
        registerClass_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                registerClass_FieldActionPerformed(evt);
            }
        });
        registerClass_Field.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                registerClass_FieldKeyTyped(evt);
            }
        });

        batWeightOutputField2.setBackground(getBackground());
        batWeightOutputField2.setForeground(new java.awt.Color(153, 153, 153));
        batWeightOutputField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 115, 230), 1, true), "Batting Weight", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(25, 117, 229))); // NOI18N

        addTeacherHeaderPanel.setBackground(findBatter_HeaderPanel.getBackground());

        jLabel9.setBackground(findBatter_HeaderPanel.getBackground());
        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD TEACHER");

        javax.swing.GroupLayout addTeacherHeaderPanelLayout = new javax.swing.GroupLayout(addTeacherHeaderPanel);
        addTeacherHeaderPanel.setLayout(addTeacherHeaderPanelLayout);
        addTeacherHeaderPanelLayout.setHorizontalGroup(
            addTeacherHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTeacherHeaderPanelLayout.createSequentialGroup()
                .addGap(623, 623, 623)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addTeacherHeaderPanelLayout.setVerticalGroup(
            addTeacherHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTeacherHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        addTimeTableTbl.setBackground(new java.awt.Color(255, 255, 255));
        addTimeTableTbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addTimeTableTbl.setForeground(new java.awt.Color(102, 102, 102));
        addTimeTableTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Monday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Tuesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Wednesday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Thursday", null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Friday", null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Day", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12", "L13", "L14"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        addTimeTableTbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        addTimeTableTbl.setCellSelectionEnabled(true);
        addTimeTableTbl.setOpaque(false);
        addTimeTableTbl.setRowHeight(105);
        addTimeTableTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addTimeTableTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addTimeTableTbl.setShowGrid(true);
        addTimeTableTbl.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                addTimeTableTblMouseClicked(evt);
            }
        });
        jScrollPane29.setViewportView(addTimeTableTbl);
        addTimeTableTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        addTeacherButton.setBackground(chooseTeacherButton.getBackground());
        addTeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addTeacherButton.setForeground(new java.awt.Color(51, 255, 255));
        addTeacherButton.setText("Add Teacher");
        addTeacherButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                addTeacherButtonMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(25, 116, 229));
        jLabel4.setText("Extra mural Hours");

        javax.swing.GroupLayout addTeacherPaneLayout = new javax.swing.GroupLayout(addTeacherPane);
        addTeacherPane.setLayout(addTeacherPaneLayout);
        addTeacherPaneLayout.setHorizontalGroup(
            addTeacherPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addTeacherHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addTeacherPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane29)
                .addContainerGap())
            .addGroup(addTeacherPaneLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addGroup(addTeacherPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTeacherPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addTeacherPaneLayout.createSequentialGroup()
                        .addComponent(teacherExtraMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)))
                .addComponent(batWeightOutputField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTeacherPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addTeacherButton)
                .addGap(665, 665, 665))
        );
        addTeacherPaneLayout.setVerticalGroup(
            addTeacherPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTeacherPaneLayout.createSequentialGroup()
                .addComponent(addTeacherHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addTeacherPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(addTeacherPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(batWeightOutputField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addTeacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerClass_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacherExtraMuralsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTeacherButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Add Teacher", addTeacherPane);

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setBattingMonthCalendar(Month m, JTable jtbl)
    {

        LocalDate monthD = LocalDate.of(LocalDate.now().getYear(), m, 1);
          String [][] month = new String[Math.ceilDiv(monthD.lengthOfMonth(), 7)+1][7];

        int day = 1;
        for (int i = 0; i < month.length; i++)
        {
            int j = 0;
            //get the month start day
            if (i == 0)
            {
                j = monthD.getDayOfWeek().getValue() - 1;
            }

            //for rest of month
            for (; j < month[i].length && day <= monthD.lengthOfMonth(); j++)
            {
                month[i][j] = "" + day++;
            }
        }
        String[] colNames =
        {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        jtbl.setModel(new DefaultTableModel(month, colNames));
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseClicked
    {//GEN-HEADEREND:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void registerClassOutput_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_registerClassOutput_FieldActionPerformed
    {//GEN-HEADEREND:event_registerClassOutput_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerClassOutput_FieldActionPerformed

    private void editableButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editableButtonActionPerformed
    {//GEN-HEADEREND:event_editableButtonActionPerformed
        // TODO add your handling code here:
        teacherComboBox.setEditable(!teacherComboBox.isEditable());
        registerClassOutput_Field.setEditable(!registerClassOutput_Field.isEditable());
        extraMuralsNr_Text.setEditable(!extraMuralsNr_Text.isEditable());
        tblViewTimeTable.setEnabled(!tblViewTimeTable.isEnabled());
        confirmEditsButton.setVisible(!confirmEditsButton.isVisible());
    }//GEN-LAST:event_editableButtonActionPerformed

    private void registerClass_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_registerClass_FieldActionPerformed
    {//GEN-HEADEREND:event_registerClass_FieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_registerClass_FieldActionPerformed
    
    private double getBattingWeight()
    {
        return selectedTeacher.getBattingWeight();
    }

    private void addTimeTableTblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_addTimeTableTblMouseClicked
    {//GEN-HEADEREND:event_addTimeTableTblMouseClicked
        // TODO add your handling code here:
        int selectedRow= addTimeTableTbl.getSelectedRow();
        int selectedCollumn = addTimeTableTbl.getSelectedColumn();
        
        Cell selectedC = new Cell(selectedRow, selectedCollumn-1);
        
        addTeacher_tableSelection [selectedRow][selectedCollumn-1] = !addTeacher_tableSelection [selectedRow][selectedCollumn-1];
        if (addTimeTableTbl.getValueAt(selectedRow, selectedCollumn) == null)
        {
            add_selectedCells.add(selectedC);
            addTimeTableTbl.setValueAt("X", selectedRow, selectedCollumn);
        }else {
            addTimeTableTbl.setValueAt(null, selectedRow, selectedCollumn);
        }
 //<editor-fold defaultstate="collapsed" desc=" Doesn't work fold "> 
/*  v  doesn't work folder  v
        //        addTimeTableTbl.setSelectionMode(1);
//        int collumn = addTimeTableTbl.getSelectedColumn();
//        int row = addTimeTableTbl.getSelectedRow();
//        addTimeTableTbl.changeSelection(row, collumn, false, false);
        
        *Colour addition fold --> does NOT work* 
        for (Cell c: selectedCells)
        {
            addTimeTableTbl
                    .getColumn("L1")//addTimeTableTbl.getColumnName(c.getColumn()))
                    .setCellRenderer(
                            new DefaultTableCellRenderer()
                            {
                                Color origin = null;

                                @Override
                                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
                                {
                                    DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                                    if (origin==null) origin = getForeground();
                                    else if   (value==null) renderer.setText(""); 
                                    else renderer.setText(value.toString()); 

                                    if (row == 3) renderer.setForeground(Color.blue);
                                    else renderer.setForeground(origin);

                                    return renderer;
                                }

                            }
            );
       }
        */
//</editor-fold>
    }//GEN-LAST:event_addTimeTableTblMouseClicked

    private void addTeacherButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_addTeacherButtonMouseClicked
    {//GEN-HEADEREND:event_addTeacherButtonMouseClicked
        String fullName = "";
        Teacher t;
        try
        {
            teacherComboBox.setModel(new DefaultComboBoxModel<> (tm.getTeacherNames()));

            /*update all the fields to match that of the teacher*/
            setViewValues();

            TimeTable newTT = new TimeTable(addTeacher_tableSelection);
            fullName = addTeacherNameField.getText();
            
            tm.addTeacher(fullName,
                    selectedTeacher.getNumFrees(), 
                    registerClass_Field.getText().equalsIgnoreCase("true"),
                    (int)teacherExtraMuralsSpinner.getValue(),
                    newTT);
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getStackTrace());

            ex.printStackTrace();
        }
    }//GEN-LAST:event_addTeacherButtonMouseClicked

    private void addTeacherNameFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_addTeacherNameFieldKeyTyped
    {//GEN-HEADEREND:event_addTeacherNameFieldKeyTyped
        // TODO add your handling code here:
        if( (addTeacherNameField.getText() != null || !addTeacherNameField.getText().equals("e.g Jeanett") ) && (registerClass_Field.getText() != null)) 
        {
            batWeightOutputField2.setText(
                    "" + getBattingWeight()
            );
        }
    }//GEN-LAST:event_addTeacherNameFieldKeyTyped

    private void registerClass_FieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_registerClass_FieldKeyTyped
    {//GEN-HEADEREND:event_registerClass_FieldKeyTyped
        // TODO add your handling code here:
        if( registerClass_Field.getText() != null && (registerClass_Field.getText().equalsIgnoreCase("True") || registerClass_Field.getText().equalsIgnoreCase("False"))) 
        {
            batWeightOutputField2.setText( "" + getBattingWeight() );
        }
    }//GEN-LAST:event_registerClass_FieldKeyTyped

    private void tblViewTimeTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblViewTimeTableMouseClicked
    {//GEN-HEADEREND:event_tblViewTimeTableMouseClicked
        // TODO add your handling code here:
        if(tblViewTimeTable.isEnabled())
        {
                int row = tblViewTimeTable.getSelectedRow(), col = tblViewTimeTable.getSelectedColumn();

            Cell selectedC = new Cell(row, col-1);

            changeTeacher_tableSelection [row][col-1] = !changeTeacher_tableSelection [row][col-1];
            if (tblViewTimeTable.getValueAt(row, col) == null)
            {
                change_selectedCells.add(selectedC);
                tblViewTimeTable.setValueAt("X", row, col);
            }else {
                tblViewTimeTable.setValueAt("", row, col);
            }
        }
    }//GEN-LAST:event_tblViewTimeTableMouseClicked

    private void ManageTeachers_PanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManageTeachers_PanelFocusGained
        // TODO add your handling code here:
        try
        {
                teacherComboBox.setModel(new DefaultComboBoxModel<> (tm.getTeacherNames()));
                
                /*update all the fields to match that of the teacher*/
                setViewValues();
        } catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ManageTeachers_PanelFocusGained

    private void teacherComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherComboBoxActionPerformed
        // TODO add your handling code here:
        setViewValues();
    }//GEN-LAST:event_teacherComboBoxActionPerformed

    private void confirmEditsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmEditsButtonMouseClicked
        // TODO add your handling code here:
        try
        {
            selectedTeacher.setFullName((String) teacherComboBox.getSelectedItem());
            selectedTeacher.setTimeTable(new TimeTable(getUpdateTableSelection()));//needa make this method
            selectedTeacher.setExtraMuralHours(Integer.parseInt(extraMuralsNr_Text.getText()));
            selectedTeacher.setHasRegisterClass(registerClassOutput_Field.getText().equalsIgnoreCase("true"));
            tm.updateTeacher(selectedTeacher, viewOriginalName);
            selectedTeacher.setNumFrees(selectedTeacher.getNumFrees());
            
            editableButton.doClick();
        }catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmEditsButtonMouseClicked

    private void tblBatWeekMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblBatWeekMousePressed
    {//GEN-HEADEREND:event_tblBatWeekMousePressed
        
    }//GEN-LAST:event_tblBatWeekMousePressed

    private void lessonInputTableMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lessonInputTableMousePressed
    {//GEN-HEADEREND:event_lessonInputTableMousePressed
        
    }//GEN-LAST:event_lessonInputTableMousePressed

    private void findTeacherButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_findTeacherButtonActionPerformed
    {//GEN-HEADEREND:event_findTeacherButtonActionPerformed
        //get which table has the focus, then what row was selected in that month, return both
        for (Component c : tblBatWeek.getComponents())
        {
            if(c instanceof JTable)
            {
                JTable tbl = (JTable) c;
                if (tbl.isFocusOwner())
                {
                    battingWeek = tbl.getSelectedRow()+1;
                    String monthString = tbl.getName();
                    battingMonth = monthString.contains("Jan")? 1 : 
                            monthString.contains("Feb")? 2: 
                            monthString.contains("Mar")? 3: 
                            monthString.contains("Apr")? 4: 
                            monthString.contains("May")? 5: 
                            monthString.contains("Jun")? 6: 
                            monthString.contains("Jul")? 7: 
                            monthString.contains("Aug")? 8: 
                            monthString.contains("Sept")? 9: 
                            monthString.contains("Oct")? 10: 
                            monthString.contains("Nov")? 11:
                            12;
                }
            }
        }
        //for current time
        battingWeek = 2;
        battingMonth = 1;
        //return the lesson and day of week selected
        battingLesson = lessonInputTable.getSelectedColumn();
        battingDayOfWeek = lessonInputTable.getSelectedRow() + 1;
        battingDayOfMonth = 7*battingWeek + battingDayOfWeek;
        try
        {
            //call the getTeachers from battingManager, output to the text area
            ArrayList <Teacher> viableTeachers = bm.getBattingTeachers(battingLesson, battingDayOfWeek, battingDayOfMonth, battingMonth);
            
            //clear textField
            outputTeacherList.removeAll();
            
            //add into textArea
            String[] namesArr = new String [ viableTeachers.size() ];
            int i = 0;
            for (Teacher t : viableTeachers)
            {
                namesArr[i] = t.getFullName();
                i++;
            }
            outputTeacherList.setListData(namesArr);
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_findTeacherButtonActionPerformed

    private void chooseTeacherButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chooseTeacherButtonActionPerformed
    {//GEN-HEADEREND:event_chooseTeacherButtonActionPerformed
        // TODO add your handling code here:
        String battingName = outputTeacherList.getSelectedValue();
        addBatting(battingMonth, battingWeek, battingDayOfWeek, battingLesson, battingName);
    }//GEN-LAST:event_chooseTeacherButtonActionPerformed

    private void deleteTeacherButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteTeacherButtonActionPerformed
    {//GEN-HEADEREND:event_deleteTeacherButtonActionPerformed
        try
        {
            tm.deleteTeacher(selectedTeacher.getFullName());
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteTeacherButtonActionPerformed

    private void tblJanWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblJanWeeksMouseReleased
    {//GEN-HEADEREND:event_tblJanWeeksMouseReleased
        //in the selected row, cycle throw the days to see which days are in the week of this month
        focusedBattingWeeksCalendar = tblJanWeeks;
        setLessonInputTableData(tblJanWeeks);
    }//GEN-LAST:event_tblJanWeeksMouseReleased

    private void tblFebWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblFebWeeksMouseReleased
    {//GEN-HEADEREND:event_tblFebWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblFebWeeks;
                setLessonInputTableData(tblFebWeeks);
    }//GEN-LAST:event_tblFebWeeksMouseReleased

    private void tblMarchWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblMarchWeeksMouseReleased
    {//GEN-HEADEREND:event_tblMarchWeeksMouseReleased
        // TODO add your handling code here:
                setLessonInputTableData(tblMarchWeeks);
                focusedBattingWeeksCalendar = tblMarchWeeks;
    }//GEN-LAST:event_tblMarchWeeksMouseReleased

    private void tblAprilWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblAprilWeeksMouseReleased
    {//GEN-HEADEREND:event_tblAprilWeeksMouseReleased
        // TODO add your handling code here:
       focusedBattingWeeksCalendar = tblAprilWeeks;
                setLessonInputTableData(tblAprilWeeks);
    }//GEN-LAST:event_tblAprilWeeksMouseReleased

    private void tblMayWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblMayWeeksMouseReleased
    {//GEN-HEADEREND:event_tblMayWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblMayWeeks;
                setLessonInputTableData(tblMayWeeks);
    }//GEN-LAST:event_tblMayWeeksMouseReleased

    private void tblJuneWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblJuneWeeksMouseReleased
    {//GEN-HEADEREND:event_tblJuneWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblJuneWeeks;
                setLessonInputTableData(tblJuneWeeks);
    }//GEN-LAST:event_tblJuneWeeksMouseReleased

    private void tblJulyWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblJulyWeeksMouseReleased
    {//GEN-HEADEREND:event_tblJulyWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblJulyWeeks;
                setLessonInputTableData(tblJulyWeeks);
    }//GEN-LAST:event_tblJulyWeeksMouseReleased

    private void tblAugWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblAugWeeksMouseReleased
    {//GEN-HEADEREND:event_tblAugWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblAugWeeks;
                setLessonInputTableData(tblAugWeeks);
    }//GEN-LAST:event_tblAugWeeksMouseReleased

    private void tblSeptWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblSeptWeeksMouseReleased
    {//GEN-HEADEREND:event_tblSeptWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblSeptWeeks;
                setLessonInputTableData(tblSeptWeeks);
    }//GEN-LAST:event_tblSeptWeeksMouseReleased

    private void tblOctWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblOctWeeksMouseReleased
    {//GEN-HEADEREND:event_tblOctWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblOctWeeks;
                setLessonInputTableData(tblOctWeeks);
    }//GEN-LAST:event_tblOctWeeksMouseReleased

    private void tblNovWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblNovWeeksMouseReleased
    {//GEN-HEADEREND:event_tblNovWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblNovWeeks;
                setLessonInputTableData(tblNovWeeks);
    }//GEN-LAST:event_tblNovWeeksMouseReleased

    private void tblDecWeeksMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblDecWeeksMouseReleased
    {//GEN-HEADEREND:event_tblDecWeeksMouseReleased
        // TODO add your handling code here:
        focusedBattingWeeksCalendar = tblDecWeeks;
                setLessonInputTableData(tblDecWeeks);
    }//GEN-LAST:event_tblDecWeeksMouseReleased
    private void setLessonInputTableData(JTable tbl)
    {
         battingWeek = tbl.getSelectedRow();
        ArrayList<String> daysInWeek = new ArrayList<String>();
        for(int i = 0; i < tbl.getColumnCount(); i++)
        {
            if( tbl.getValueAt(battingWeek, i) != null) daysInWeek.add(tbl.getColumnName(i));
        }
        
        //then make the timetable table from the amount of days there00
        int cycleCount = 0;
        String [][] data = new String [daysInWeek.size()][15];
        for(String [] arr1 : data)
        {
            arr1[0] = daysInWeek.get(cycleCount++);
        }
        
        //get the table header 
        String [] header = new String[15];
        for(int i = 0; i < header.length; i++)
        {
            header[i] = lessonInputTable.getColumnName(i);
        }
        
        lessonInputTable.setModel(new DefaultTableModel(data, header));
    }
    
    private void addBatting(int month, int week, int dayOfWeek, int lesson, String name)
    {
        String initials = getInitials(name);
        String battingDisplayMessage = "L"+ lesson +": "+ initials;
        try
        {
            bm.addBatting(new BattingLesson(name, lesson, dayOfWeek, week, month));
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        switch(month)
        {
            case 1: 
                tblJanBatting.setValueAt(tblJanBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 2: 
                tblFebBatting.setValueAt(tblFebBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 3: 
                tblMarBatting.setValueAt(tblMarBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 4: 
                tblAprBatting.setValueAt(tblAprBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 5: 
                tblMayBatting.setValueAt(tblMayBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 6: 
                tblJunBatting.setValueAt(tblJunBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 7: 
                tblJulBatting.setValueAt(tblJulBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 8: 
                tblAugBatting.setValueAt(tblAugBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 9: 
                tblSepBatting.setValueAt(tblSepBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 10: 
                tblOctBatting.setValueAt(tblOctBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 11: 
                tblNovBatting.setValueAt(tblNovBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            case 12: 
                tblDecBatting.setValueAt(tblDecBatting.getValueAt(week-1, dayOfWeek-1) +" || "+ battingDisplayMessage, week-1, dayOfWeek-1);
                break;
            default: JOptionPane.showMessageDialog(null, "Value "+ month +" out of bounds for length 12");
        }
    }
    private String getInitials(String name)
    {
        String initials = "";
        Scanner namesc =  new Scanner(name);
        
        while (namesc.hasNext())
        {
            initials += namesc.next().charAt(0) +".";
        }
        return initials;
    }
    private boolean [][] getUpdateTableSelection()
    {
        boolean [][] tempTimetable = new boolean [5][14];
        int rowCount = tblViewTimeTable.getRowCount();
        int colCount = tblViewTimeTable.getColumnCount();
        
        for (int row = 0; row < rowCount; row++)
        {
//            boolean [] day = tempTimetable[row];
            for (int column = 0; column < colCount-1; column ++)
            {
                tempTimetable[row][column] = tblViewTimeTable.getValueAt(row, column+1).equals("X");
            }
        }
        return tempTimetable;  
    }
    
    public void setViewValues()
    {
        try
        {
            /*update all the fields to match that of the teacher*/
            selectedTeacher = tm.getTeacher((String)teacherComboBox.getSelectedItem());
            viewOriginalName = selectedTeacher.getFullName();
            tblViewTimeTable.setModel(tm.getTimeTableModel(selectedTeacher.getFullName()));
            registerClassOutput_Field.setText("" + selectedTeacher.getHasRegisterClass());
            batWeightField.setText("" + selectedTeacher.getBattingWeight());
            extraMuralsNr_Text.setText("" + selectedTeacher.getExtraMuralHours());
        } catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TeacherScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TeacherScreen1().setVisible(true);
            }
        });
    }
    
    private JTable focusedBattingWeeksCalendar;
    private int battingLesson, battingWeek, battingMonth, battingDayOfMonth, battingDayOfWeek;
    private String viewOriginalName;
    private TeacherManager tm = new TeacherManager();
    private BattingManager bm = new BattingManager();
    private Teacher selectedTeacher;
    private boolean [][] addTeacher_tableSelection = new boolean[5][14];
    private boolean [][] changeTeacher_tableSelection = new boolean[5][14];
    private ArrayList<Cell> add_selectedCells = new ArrayList<>();
    private ArrayList<Cell> change_selectedCells = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageTeachers_Panel;
    private javax.swing.JButton addTeacherButton;
    private javax.swing.JPanel addTeacherHeaderPanel;
    private javax.swing.JTextField addTeacherNameField;
    private javax.swing.JPanel addTeacherPane;
    private javax.swing.JTable addTimeTableTbl;
    private javax.swing.JTextField batWeightField;
    private javax.swing.JTextField batWeightOutputField2;
    private javax.swing.JLabel chooseDayLabel;
    private javax.swing.JLabel chooseLessonLAbel;
    private javax.swing.JLabel chooseLessonLAbel1;
    private javax.swing.JButton chooseTeacherButton;
    private javax.swing.JButton confirmEditsButton;
    private javax.swing.JButton deleteBattingTeacherButton;
    private javax.swing.JButton deleteTeacherButton;
    private javax.swing.JRadioButton editableButton;
    private javax.swing.JTextField extraMuralsNr_Text;
    private javax.swing.JPanel findBatter_HeaderPanel;
    private javax.swing.JPanel findBatter_Panel;
    private javax.swing.JButton findTeacherButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel lessonInputPanel;
    private javax.swing.JTable lessonInputTable;
    private javax.swing.JPanel manageT_HeaderPanel;
    private javax.swing.JTabbedPane outputCalendarTabbedPane;
    private javax.swing.JList<String> outputTeacherList;
    private javax.swing.JTextField registerClassOutput_Field;
    private javax.swing.JTextField registerClass_Field;
    private javax.swing.JPanel tabApril;
    private javax.swing.JPanel tabAugust;
    private javax.swing.JPanel tabDecember;
    private javax.swing.JPanel tabFebruary;
    private javax.swing.JPanel tabJanuary;
    private javax.swing.JPanel tabJuly;
    private javax.swing.JPanel tabJune;
    private javax.swing.JPanel tabMarch;
    private javax.swing.JPanel tabMay;
    private javax.swing.JPanel tabNovember;
    private javax.swing.JPanel tabOctober;
    private javax.swing.JPanel tabSeptember;
    private javax.swing.JTable tblAprBatting;
    private javax.swing.JTable tblAprilWeeks;
    private javax.swing.JTable tblAugBatting;
    private javax.swing.JTable tblAugWeeks;
    private javax.swing.JTabbedPane tblBatWeek;
    private javax.swing.JTable tblDecBatting;
    private javax.swing.JTable tblDecWeeks;
    private javax.swing.JTable tblFebBatting;
    private javax.swing.JTable tblFebWeeks;
    private javax.swing.JTable tblJanBatting;
    private javax.swing.JTable tblJanWeeks;
    private javax.swing.JTable tblJulBatting;
    private javax.swing.JTable tblJulyWeeks;
    private javax.swing.JTable tblJunBatting;
    private javax.swing.JTable tblJuneWeeks;
    private javax.swing.JTable tblMarBatting;
    private javax.swing.JTable tblMarchWeeks;
    private javax.swing.JTable tblMayBatting;
    private javax.swing.JTable tblMayWeeks;
    private javax.swing.JTable tblNovBatting;
    private javax.swing.JTable tblNovWeeks;
    private javax.swing.JTable tblOctBatting;
    private javax.swing.JTable tblOctWeeks;
    private javax.swing.JTable tblSepBatting;
    private javax.swing.JTable tblSeptWeeks;
    private javax.swing.JTable tblViewTimeTable;
    private javax.swing.JComboBox<String> teacherComboBox;
    private javax.swing.JSpinner teacherExtraMuralsSpinner;
    private javax.swing.JPanel weeksApril;
    private javax.swing.JPanel weeksAugust;
    private javax.swing.JPanel weeksDecember;
    private javax.swing.JPanel weeksFebruary;
    private javax.swing.JPanel weeksJanuary;
    private javax.swing.JPanel weeksJuly;
    private javax.swing.JPanel weeksJune;
    private javax.swing.JPanel weeksMarch;
    private javax.swing.JPanel weeksMay;
    private javax.swing.JPanel weeksNovember;
    private javax.swing.JPanel weeksOctober;
    private javax.swing.JPanel weeksSeptember;
    // End of variables declaration//GEN-END:variables
}
