/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

import java.io.Serializable;

/**
 *
 * @author 23713
 */
//Set the attributes of grade
public class Grade implements Serializable{
    private int stuId;
    private String courseId;
    private int grade;
    
    // Constructor
    Grade(){
        
    }
    // Constructor
    Grade(int stuId, String courseId,int grade){
        this.stuId=stuId;
        this.courseId= courseId;
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        return stuId + " " + courseId + " " + grade;
        
    }
    
// Getters
public int getStuId() {
        return stuId;
    }

public String getCourseId() {
        return courseId;
    }

public int getGrade() {
        return grade;
    }
    
}
