/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schoolmanagement;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Schoolmanagement {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to St Annes  Database");
        System.out.println("Which of the following services would you like to use?");
        System.out.println("1. Input Student information");
        System.out.println("2. View Student Result");
        System.out.println("3. View Staff List");
        System.out.println("4. View Courses");
        System.out.println("5. View Student Biodata");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                Person obj = new Person();
                obj.name();
                break;
                
            case 2: 
               Result object = new Result();
               object.main();
               object.logic();
               object.displayresult();
               break;
               
            case 3:
                Staff view = new Staff();
                view.displayInfo();
                break;
                
            case 4:
                courses suki = new courses();
                suki.yearI();
                suki.yearI2nd();
                suki.year2();
                suki.year2Second();
                
              
        }
        
        
    }
}
