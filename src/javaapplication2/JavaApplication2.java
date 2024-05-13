/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author vagha
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[3];//
        Student s1 = new Student();
        s1.setName("Parth Vaghani");
         Student s2 = new Student();
        s2.setName("Parth"); 
        Student s3 = new Student();
        s3.setName("Vaghani");
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        
        
    }
    
}