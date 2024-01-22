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
//Set the attributes of course
public class Course implements Serializable {
    private String courseId;
    private String courseName;
    
    // Constructor
    Course(){
        
    }
    // Constructor
    Course(String courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    @Override
    public String toString(){
        return courseId+" "+courseName;
    }
    // Getters
public String getCourseId() {
        return courseId;
    }

public String getCourseName() {
        return courseName;
    }
}
