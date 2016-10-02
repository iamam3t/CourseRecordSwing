/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sjp.UI;

import com.leapfrog.sjp.DAO.CourseDAO;
import com.leapfrog.sjp.DAOImpl.CoursesDAOImpl;
import com.leapfrog.sjp.entity.Courses;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AM3ET
 */
public class CourseDetailsUI extends javax.swing.JFrame {

    private CourseDAO courseDAO = new CoursesDAOImpl();
    private int ID = 0;
    public CourseDetailsUI() {
        initComponents();
        String[] columns = {"ID","Name","Description","Fees","Added Date","Modified Date","Status"};
        try{
            tblCourse.setModel(new CourseTableModule(columns, courseDAO.getAll()));
        }catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public CourseDetailsUI(int ID) {
        initComponents();
        this.ID = ID;
        try {
            courseDAO.delete(ID);
        } catch (ClassNotFoundException | SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Record Deleted");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCourse);

        btnEdit.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/sjp/resources/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonClick(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/sjp/resources/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/sjp/resources/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonClick(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/sjp/resources/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonClick(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/sjp/resources/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new CourseUI().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void editButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonClick
        int index = tblCourse.getSelectedRow();
        Integer ID = (Integer) tblCourse.getModel().getValueAt(index, 0);
        new CourseUpdateUI(ID).setVisible(true);   
    }//GEN-LAST:event_editButtonClick

    private void deleteButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonClick
        int index = tblCourse.getSelectedRow();
        Integer ID = (Integer) tblCourse.getModel().getValueAt(index, 0);
        new CourseDetailsUI(ID);
    }//GEN-LAST:event_deleteButtonClick

    private void refreshButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonClick
        dispose();
        new CourseDetailsUI().setVisible(true);
    }//GEN-LAST:event_refreshButtonClick

    private void searchButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonClick
        new CourseSearchUI().setVisible(true);
    }//GEN-LAST:event_searchButtonClick

    private class CourseTableModule extends AbstractTableModel {
        
        private String[] columns;
        private List<Courses> courseList;

        public CourseTableModule(String[] columns, List<Courses> courseList) {
            this.columns = columns;
            this.courseList = courseList;
        }
        
        @Override
        public int getRowCount() {
            return courseList.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Courses course = courseList.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return course.getCourseID();
                case 1:
                    return course.getCourseName();
                case 2:
                    return course.getCourseDescription();
                case 3:
                    return course.getCourseFee();
                case 4:
                    return course.getAddedDate();
                case 5:
                    return course.getModifiedDate();
                case 6:
                    return course.isStauts();
            }
            return null;
        }
        public String getColumnName(int columnIndex){
            return columns[columnIndex];
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourse;
    // End of variables declaration//GEN-END:variables
}
