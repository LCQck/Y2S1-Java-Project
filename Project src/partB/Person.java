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
//Set the attributes of person
//Interface is indeed because class student and class teacher need information.
public class Person implements Serializable{
    String name;
    Gender gender;
    
    // Constructor
    Person(){}
    
    // Constructor
    Person(String name, Gender gender){
        this.name=name;
        this.gender= gender;
    }

    // Getters
    public String getName() {
            return name;
        }

    public Gender getGender() {
            return gender;
        }

}

