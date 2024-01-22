/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

import java.util.List;

/**
 * Declare the filename that only could be used in Class DataAccess  
 * Setting 4 files' names as 4 static constants that will not be modified.
 * This method uses the if branch structure to determine whether the object is the corresponding object.
 *In this method, the function of the key word "instanceof" is to determine if an object is an instance of a class.
 * The left side is an object, the right side is a class, and the return type is Boolean.
 * This key word is to test whether the object on the left is an instance object created by the class on the right or a subclass of that class.
 * If yes, then return true, otherwise return false.
 * reference from:https://blog.csdn.net/qq_37680825/article/details/107580782
 * @author 23713
 */
public class DataAccess {
    
    //Declare the filename that only could be used in Class DataAccess   
    private static String fileName;
    
    //Setting 4 files' names as 4 static constants that will not be modified.
    private static final String STUDENT_DATA_FILE_NAME = "studentData.txt";
    private static final String TEACHER_DATA_FILE_NAME = "teacherData.txt";
    private static final String GRADER_DATA_FILE_NAME = "gradeData.txt";
    private static final String COURSE_DATA_FILE_NAME = "courseData.txt";
    
    /**
    * This method uses the if branch structure to determine whether the object is the corresponding object.
    * In this method, the function of the key word "instanceof" is to determine if an object is an instance of a class.
    * The left side is an object, the right side is a class, and the return type is Boolean.
    * This key word is to test whether the object on the left is an instance object created by the class on the right or a subclass of that class.
    * If yes, then return true, otherwise return false.
    * reference from:https://blog.csdn.net/qq_37680825/article/details/107580782
    */
    public static void writeObjToFile(Object object){
        if(object instanceof partB.Student) {
            fileName = STUDENT_DATA_FILE_NAME;
        } else if (object instanceof Course){
            fileName= COURSE_DATA_FILE_NAME;
        } else if(object instanceof partB.Teacher){
            fileName=TEACHER_DATA_FILE_NAME;
        } else if (object instanceof partB.Grade){
            fileName=GRADER_DATA_FILE_NAME;
        }

        partB.FileUtils.writeObjToFile(object, fileName);
    }

        /**
         * This method should use an ArrayList to hold the objects retrieved from the file
         * Take the objects(student) retrieved from the file and put them into ArrayList.
         * @return 
         */
        public static List<Object> addStudentToList(){
        List<Object> objectList = null;
        try {
            objectList = partB.FileUtils.readObjFromFile(STUDENT_DATA_FILE_NAME);
        } catch (Exception e) {

        }
        return objectList;
    }
        /**This method should use an ArrayList to hold the objects retrieved from the file
         * Take the objects(teacher) retrieved from the file and put them into ArrayList.
         * @return 
         */
        public static List<Object> addTeacherToList(){
        List<Object> objectList= null;
        try {
            objectList = partB.FileUtils.readObjFromFile(TEACHER_DATA_FILE_NAME);
        } catch (Exception e) {
        }
        return objectList;
    }
        /**This method should use an ArrayList to hold the objects retrieved from the file
         * Take the objects(course) retrieved from the file and put them into ArrayList.
         * @return 
         */
        public static List<Object> addCourseToList(){
        List<Object> objectList= null;
        try {
            objectList = partB.FileUtils.readObjFromFile(COURSE_DATA_FILE_NAME);
        } catch (Exception e) {
        }
        return objectList;
    }
    
    /**
     * this method should use an ArrayList to hold the objects retrieved from the file
     * Take the objects(grade) retrieved from the file and put them into ArrayList.
     * @return 
     */
    public static List<Object> addGradeToList(){
        List<Object> objectList= null;
        try {
            objectList = FileUtils.readObjFromFile(GRADER_DATA_FILE_NAME);
        } catch (Exception e) {
        }
        return objectList;
    }

}