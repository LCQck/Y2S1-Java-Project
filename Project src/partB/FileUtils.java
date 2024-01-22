/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 23713
 */
public class FileUtils {
    /**
    * This method is used to write content to a specified document.
    *In this method, two parameters are indeed.
    * 1. object: the content to be written (String)
    * 2. fileName: the name of the file being written (String)
    * //Since this method throws an Exception, a try catch structure is indeed.
    * //The channel must be closed after finish writing.
    */
    public static void writeObjToFile(Object object, String fileName){
        //Since this method throws an Exception, a try catch structure is indeed.
        try{
            FileOutputStream fos=new FileOutputStream(fileName, true);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(object);
            //The channel must be closed after finish writing.
            oos.close();
        }
         catch (Exception e) {
            System.out.println(e.toString());
        } 
    }
    
    /**
    *In this method, I packaging "ArrayList<>()"into collection List Object objectList, which return ArrayList to Class DataAccess.
    *This method reads the content from a text document file and returns content.
    *A String parameter is required to indicate the name of the file being read
    * Here I create an empty Object to store the contents of the information read later.
    * To determine whether the file exists or not, if not, create it in the root of the Package and creat a file object instance.
    * Since this method throws an IOException, a try catch structure is indeed.
    * Read the file from the beginning to the end of file.
    * Since this method throws an IOException, a try catch structure is indeed.
    * The channel must be closed after finish reading.
    * Finally return object List which has been defined before.
    */
    public static List<Object> readObjFromFile(String fileName){
        List<Object> objectList = new ArrayList<>();
        //Here I create an empty Object to store the contents of the information read later.
        Object object = null;
        //To determine whether the file exists or not, if not, create it in the root of the Package and creat a file object instance.
        File file = new File(fileName);
        if (!file.exists()) {
            //Since this method throws an IOException, a try catch structure is indeed.
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("file create fail, result is " + e.toString());
            }
        }
        //Read the file from the beginning to the end of file.
        //Since this method throws an IOException, a try catch structure is indeed.
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = null;
            while(fis.available()>0){
                ois=new ObjectInputStream(fis);
                object=ois.readObject();
                objectList.add(object);
            }
            //The channel must be closed after finish reading.
            ois.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        //Finally return object List which has been defined before. 
        return objectList;
    } ;
}