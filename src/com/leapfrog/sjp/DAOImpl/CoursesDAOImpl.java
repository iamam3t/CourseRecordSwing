/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sjp.DAOImpl;

import com.leapfrog.sjp.DAO.CourseDAO;
import com.leapfrog.sjp.dbutil.DBConnection;
import com.leapfrog.sjp.entity.Courses;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public class CoursesDAOImpl implements CourseDAO{

    private DBConnection db = new DBConnection();
    private PreparedStatement stmt = null;
    
    @Override
    public int insert(Courses course) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tel_courses(course_name,course_description,course_fee,status) VALUES(?,?,?,?)";
        db.open();
        stmt = db.initStatement(sql);
        stmt.setString(1, course.getCourseName());
        stmt.setString(2, course.getCourseDescription());
        stmt.setInt(3, course.getCourseFee());
        stmt.setBoolean(4, course.isStauts());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Courses course) throws ClassNotFoundException, SQLException {
        
        String sql = "UPDATE tel_courses set course_name=?,course_description=?,course_fee=?,status=?,modified_date=? WHERE course_id=?";
        db.open();
        stmt = db.initStatement(sql);
        stmt.setString(1, course.getCourseName());
        stmt.setString(2, course.getCourseDescription());
        stmt.setInt(3, course.getCourseFee());
        stmt.setBoolean(4, course.isStauts());
        stmt.setDate(5, new java.sql.Date(course.getModifiedDate().getTime()));
        stmt.setInt(6, course.getCourseID());
        int result = db.executeUpdate();
        db.close();
        return result;
        
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM tel_courses WHERE course_id=?";
        db.open();
        stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Courses getByID(int id) throws ClassNotFoundException, SQLException {
        Courses course = null;
        String sql = "SELECT * FROM tel_courses WHERE course_id=?";
        db.open();
        stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.executeQuery();
        while(rs.next()){
            course = new Courses();
            course.setCourseID(rs.getInt("course_id"));
            course.setCourseName(rs.getString("course_name"));
            course.setCourseDescription(rs.getString("course_description"));
            course.setCourseFee(rs.getInt("course_fee"));
            course.setAddedDate(rs.getDate("added_date"));
            course.setModifiedDate(rs.getDate("modified_date"));
            course.setStauts(rs.getBoolean("status"));
        }
        db.close();
        return course;
    }

    @Override
    public List<Courses> getAll() throws ClassNotFoundException, SQLException {
        List<Courses> courseList = new ArrayList<>();
        String sql = "SELECT * FROM tel_courses";
        db.open();
        stmt = db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while(rs.next()){
            Courses course = new Courses();
            course.setCourseID(rs.getInt("course_id"));
            course.setCourseName(rs.getString("course_name"));
            course.setCourseDescription(rs.getString("course_description"));
            course.setCourseFee(rs.getInt("course_fee"));
            course.setAddedDate(rs.getDate("added_date"));
            course.setModifiedDate(rs.getDate("modified_date"));
            course.setStauts(rs.getBoolean("status"));
            courseList.add(course);
        }
        db.close();
        return courseList;
    }
    
    
    


}
