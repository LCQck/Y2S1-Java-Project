/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

/**
 *
 * @author 23713
 */
//Set the attributes of teacher
//"name" and "gender" are inheritance from class person
public class Teacher extends Person{
        private String teacherId;
        private String loginName;
        private String password;
        
        // Constructor
        public Teacher(){}

        // Constructor
        public Teacher(String name ,Gender teacherGender, String teacherId, String loginName, String password){
            super(name, teacherGender);
            this.teacherId=teacherId;
            this.loginName= loginName;
            this.password= password;
        }

        @Override
        public String toString(){
            return name + " "+ gender + " " + teacherId+ " " + loginName + " " + password;
        }
        
        // Getters
        public String getTeacherId() {
                return teacherId;
            }
        public String getLoginName() {
                return loginName;
            }
        public String getPassword() {
                return password;
            }

}

