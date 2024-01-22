/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 23713
 */
public class Q3 {
    /** Using the method in Class DataAccess to get the objects of student in the file
     */
    public static void showAllStudents() {
        List<Object> objectList = DataAccess.addStudentToList();
        if (objectList == null) {
            System.out.println("There is no student");
        } else {
            System.out.println(objectList.toString());
        }
    }
    
    /**
    * This method is to determine if the student exists in the file
    *Surprisingly, I found a concise way to lterating over the collection and judge 
    * whether the object exist in the file through forEach loop 
    * My understanding is that: the way to use of forEach loop is collection.forEach(item ->{operation to the item});
    * For example:
    * items.forEach(item ->
    *     {System.out.println(item});
    * Which is equivalent to
    * for(String item: items){
    *       System.out.println(item);
    *reference from: https://blog.csdn.net/weixin_30708203/article/details/112042645 
    *                https://blog.csdn.net/kone0611/article/details/79711970
    * // Using the method in Class DataAccess to get the objects of student in the file
    * // If the the file is empty
    * //In lambada expressions, it is not allowed to modify the value of variables outside the domain(outside the expression query)
    * //That is because the memory address will change if I modify the value of a variable outside the domain
    * //And modifying the value inside the array[] will not affect its address in memory.
    * Iterate through the objectlist collection, which holds the objects queried from the file
    * The type of query is "object", therefore I need to convert it to the specified Student object.
    * //This if structure is to determin whether a student's stuId is exist
    */
    public static boolean isStudentExist(int stuId) {
        // Using the method in Class DataAccess to get the objects of student in the file
        List<Object> objectList = DataAccess.addStudentToList();
        // If the file is empty
        if (objectList == null) {
            return false;
        }
        //In lambada expressions, it is not allowed to modify the value of variables outside the domain(outside the expression query)
        //That is because the memory address will change if I modify the value of a variable outside the domain
        //And modifying the value inside the array[] will not affect its address in memory.
        final boolean[] searchSuccess = {false};
        //Iterate through the objectlist collection, which holds the objects queried from the file
        //The type of query is "object", therefore I need to convert it to the specified Student object.
        objectList.forEach(object -> {
            Student student = (Student) object;
            //This if structure is to determin whether a student's stuId is exist
            if(student.getStuId() == stuId) {
                searchSuccess[0] = true;
                System.out.println(student.toString());
            }
        });
        return searchSuccess[0];
    }
    /**
     * This method is using the method of isStudentExist to search the object.
     * @param stuId 
     */
    public static void searchOneStudent(int stuId) {
        if (!isStudentExist(stuId)) {
            System.out.println("no student found!");
        }
    }
        /** 
         * Using the method in Class DataAccess to get the objects of course in the file
         * 
         */
        public static void showAllCourses() {
            List<Object> objectList = DataAccess.addCourseToList();
            if (objectList == null) {
                System.out.println("There is no course");
            } else {
                System.out.println(objectList.toString());
            }
        }

    /**
     * This method is to determine if the course exists in the file
     * 
     * @param courseId
     * @return 
     */    
    public static boolean isCourseExist(String courseId) {
        // Using the method in Class DataAccess to get the objects of course in the file
        List<Object> objectList = DataAccess.addCourseToList();
        // If the the file is empty
        if (objectList == null) {
            return false;
        }
        final boolean[] searchSuccess = {false};
        objectList.forEach(object -> {
            Course course = (Course) object;
            //This if structure is to determin whether a course's courseId is exist
            if(Objects.equals(course.getCourseId(), courseId)) {
                searchSuccess[0] = true;
                System.out.println(course.toString());
            }
        });
        return searchSuccess[0];
    }

    public static void searchOneCourse(String courseId) {
            if (!isCourseExist(courseId)) {
                System.out.println("no course found!");
            }
    }
        // Using the method in Class DataAccess to get the objects of teacher in the file
        public static void showAllTeachers() {
        List<Object> objectList = DataAccess.addTeacherToList();
        if (objectList == null) {
            System.out.println("There is no teacher");
        }
        System.out.println(objectList.toString());
        }
        //This method is to determine if the teacher exists in the file
    public static boolean isTeacherExist(String teacherId) {
        // Using the method in Class DataAccess to get the objects of teacher in the file
        List<Object> objectList = DataAccess.addTeacherToList();
        // If the file is empty
        if (objectList == null) {
            return false;
        }
        final boolean[] searchSuccess = {false};
        objectList.forEach(object -> {
            Teacher teacher = (Teacher) object;
            //This if structure is to determine whether a teacher's teacherId is existed
            if(Objects.equals(teacher.getTeacherId(), teacherId)) {
                searchSuccess[0] = true;
                System.out.println(teacher.toString());
            }
        });
        return searchSuccess[0];
    }

    public static void searchOneTeacher(String stuId) {
        if (!isTeacherExist(stuId)) {
            System.out.println("no teacher found!");
        }
    }

        // Using the method in Class DataAccess to get the objects of grade in the file
        public static void showAllGrades() {
        List<Object> objectList = DataAccess.addGradeToList();
        if (objectList == null) {
            System.out.println("There is no grade");
        }
        System.out.println(objectList.toString());
    }
        /**This method is to determine if the grade exists in the file
         * //This if structure is to determin whether a student's grade is exist
            //Grades are composed of students and course, therefore they should be judged together
         * @param stuIdForGrade
         * @param courseName
         * @return 
         */
    public static boolean isGradeExist(int stuIdForGrade, String courseName) {
        // Using the method in Class DataAccess to get the objects of student's grade in the file
        List<Object> objectList = DataAccess.addGradeToList();
        // If the file is empty
        if (objectList == null) {
            return false;
        }
        final boolean[] searchSuccess = {false};
        objectList.forEach(object -> {
            Grade grade = (Grade) object;
            //This if structure is to determin whether a student's grade is exist
            //Grades are composed of students and course, therefore they should be judged together
            if(grade.getStuId() == stuIdForGrade && courseName.equals(grade.getCourseId())) {
                searchSuccess[0] = true;
                System.out.println(grade.toString());
            }
        });
        return searchSuccess[0];
    }

    public static void searchOneGrade(int stuIdForGrade, String courseName) {
        if (!isGradeExist(stuIdForGrade, courseName)) {
            System.out.println("no grade found!");
        }
    }
        
        public static void printMenu(){
            System.out.println("***** Operation Menu ******");
            System.out.println("1: add a student.");
            System.out.println("2: add a course.");
            System.out.println("3: add a teacher.");
            System.out.println("4: add a grade.");
            System.out.println("5: List all students");
            System.out.println("6: List all courses.");
            System.out.println("7: List all teachers.");
            System.out.println("8: List all grades.");
            System.out.println("9: Search a student,");
            System.out.println("10: Search a course.");
            System.out.println("11: Search a teacher.");
            System.out.println("12: Search a grade.");
            System.out.println("0: exit the program.");
        }

    public static void main(String[] args) {

        printMenu();
        System.out.print("Please input a number to run the program: ");
        Scanner scan=new Scanner(System.in);
        while (scan.hasNext()) {
            int i= scan.nextInt();
            switch (i){
                case 1:
                    while (true){
                        System.out.println("Please input student information (input '-1' to end)");
                        System.out.print("Input student Id: ");
                        int stuId = scan.nextInt();
                        if (stuId== -1){
                            System.out.println("Press any key to continue...");
                            break;
                        } else if(isStudentExist(stuId)) {
                            System.out.println("该学生id已经存在");
                            break;
                        } else{
                            System.out.print("Input student name: ");
                            String name = scan.next();
                            System.out.print("Input student gender(M/F): ");
                            String studentGenderStr = scan.next();
                            Gender studentGender;
                            if ("M".equals(studentGenderStr)) {
                                studentGender = Gender.male;
                            } else {
                                studentGender = Gender.female;
                            }
                            Student student = new Student(name, studentGender, stuId);
                            DataAccess.writeObjToFile(student);
                        }
                    }break;
                          
                case 2:
                    while (true){
                        System.out.println("Please input course information (input '-1' to end)");
                        System.out.print("Input course Id: ");
                        String courseId = scan.next();
                        if (Objects.equals(courseId, "-1")){
                            System.out.println("Press any key to continue...");
                            break;
                        } else if(isCourseExist(courseId)) {
                            System.out.println("该课程id已经存在");
                            break;
                        } else{
                            System.out.print("Input course name: ");
                            String courseName = scan.next();
                            Course course = new Course(courseId, courseName);
                            DataAccess.writeObjToFile(course);
                        }
                    }  break;                  
                case 3:
                    while (true){
                        System.out.println("Please input teacher information (input '-1' to end)");
                        System.out.print("Input teacher Id: ");
                        String teacherId = scan.next();
                        if (Objects.equals(teacherId, "-1")){
                            System.out.println("Press any key to continue...");
                            break;
                        } else if(isTeacherExist(teacherId)) {
                            System.out.println("The teacher id already exists");
                            break;
                        } else{
                            System.out.print("Input teacher name: ");
                            String name = scan.next();
                            System.out.print("Input teacher gender(M/F): ");
                            String teacherGenderStr = scan.next();
                            Gender teacherGender;
                            if ("M".equals(teacherGenderStr)) {
                                teacherGender = Gender.male;
                            } else {
                                teacherGender = Gender.female;
                            }
                            System.out.print("Input teacher login name: ");
                            String loginName = scan.next();
                            System.out.print("Input teacher login password: ");
                            String password = scan.next();
                            Teacher teacher = new Teacher(name, teacherGender,teacherId, loginName, password);
                            DataAccess.writeObjToFile(teacher);
                        }
                    }break;
                    
                case 4:
                    while (true){
                        System.out.println("Please input grade information (input '-1' to end)");
                        System.out.print("Input student Id: ");
                        int stuId = scan.nextInt();
                        if (stuId== -1){
                            System.out.println("Press any key to continue...");
                            break;
                        } else{
                            System.out.print("Input course id: ");
                            String courseName = scan.next();
                            if(isGradeExist(stuId, courseName)) {
                                System.out.println("The student score already exists");
                                break;
                            }
                            System.out.print("Input student grade: ");
                            int studentGrade = scan.nextInt();
                            Grade grade = new Grade(stuId, courseName,studentGrade);
                            DataAccess.writeObjToFile(grade);
                        }
                    }break;
                case 5:
                    showAllStudents();
                    System.out.println("press any key to continue...");
                    break;
                case 6:
                    Q3.showAllCourses();
                    System.out.println("press any key to continue...");
                    break;
                case 7:
                    Q3.showAllTeachers();
                    System.out.println("press any key to continue...");
                    break;
                case 8:
                    Q3.showAllGrades();
                    System.out.println("press any key to continue...");
                    break;
                case 9:
                    System.out.print("Input student Id for search:");
                    int stuId = scan.nextInt();
                    Q3.searchOneStudent(stuId);
                    System.out.println("press any key to continue...");
                    break;
                case 10:
                    System.out.print("Input course Id for search:");
                    String courseId = scan.next();
                    Q3.searchOneCourse(courseId);
                    System.out.println("press any key to continue...");
                    break;
                case 11:
                    System.out.print("Input teacher Id for search:");
                    String teacherId = scan.next();
                    Q3.searchOneTeacher(teacherId);
                    System.out.println("press any key to continue...");
                    break;
                case 12:
                    System.out.print("Input student Id for search:");
                    int stuIdForGrade = scan.nextInt();
                    System.out.print("Input course Id for search: ");
                    String courseName = scan.next();
                    Q3.searchOneGrade(stuIdForGrade, courseName);
                    System.out.println("press any key to continue...");
                    break;
                case 0:
                    System.out.println("Thanks for using! Goodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, please enter the correct option:");
            }
        }
    }

}
