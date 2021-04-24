/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author sofiajonsson
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Menu
        // Create variables to recieve user input
        // Perform operations
        // Check for errors
        double num1;
        double num2;
        int operantionNum;
        
        
        System.out.println("Calculator");
        System.out.println("Operation List");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.println("Enter the first number");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextDouble();
        
        System.out.println("Enter the second number");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextDouble();
        
        System.out.println("Select the operation to be performed (1-4)");
        Scanner scanner3 = new Scanner(System.in);
        operantionNum = scanner3.nextInt();
        
        
        if(operantionNum==1){
            System.out.println("Result is:");
            System.out.println(num1+num2);
        } else if(operantionNum==2){
            System.out.println("Result is:");
            System.out.println(num1-num2);
        } else if(operantionNum==3){
            System.out.println("Result is:");
            System.out.println(num1*num2);
        } else if(operantionNum==4){
            System.out.println("Result is:");
            System.out.println(num1/num2);
        } else {
            System.out.println("Wrong input, select a number from the operation list");
        }
    }
    
}
