package com.leapfrog.sjp.entity;

import java.util.Date;

public class Courses {
    private String courseName,courseDescription;
    private int courseID, courseFee;
    private Date addedDate, modifiedDate;
    private boolean stauts; 

    public Courses() {
    }

    
    public Courses(String courseName, String courseDescription, int courseID, int courseFee, boolean stauts) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseID = courseID;
        this.courseFee = courseFee;
        this.stauts = stauts;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public boolean isStauts() {
        return stauts;
    }

    public void setStauts(boolean stauts) {
        this.stauts = stauts;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
    
    
}
