/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystems;

import java.util.Scanner;

/**
 *
 * @author sofiajonsson
 */
public class StudentManagementSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        double grades;
        
        
        System.out.println("Student Record Management System");
        System.out.println("Enter the name of the student");
        
        Scanner scanner1 = new Scanner(System.in);
        name = scanner1.nextLine();
        
        System.out.println("Enter the age of the student");
        age = scanner1.nextInt();
        
        System.out.println("Enter the grades of the student");
        grades = scanner1.nextDouble();
        
        System.out.println("Name of the student");
        System.out.println(name);
        
        System.out.println("Age of the student");
        System.out.println(age);
       
        System.out.println("Grades of the student");
        System.out.println(grades);

    }
    
}
