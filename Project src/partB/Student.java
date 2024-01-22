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
//Set the attributes of student
//"name" and "gender" are inheritance from class person
public class Student extends Person{
    private int stuId;

    // Constructor
    public Student(){}

    // Constructor
    public Student(String name, Gender studentGender, int stuId) {
        super(name, studentGender);
        this.stuId=stuId;
    }

    @Override
    public String toString(){
        return stuId + " " + name + " " + gender;
    }
    // Getters    
    public int getStuId() {
        return stuId;
    }    
}
