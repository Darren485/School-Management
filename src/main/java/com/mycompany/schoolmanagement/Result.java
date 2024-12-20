/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmanagement;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Result extends Person {
   Scanner input = new Scanner(System.in);
  private String  subject;
  private String grade;
  private int score;
   
    void main(){
    System.out.println("Which result do you want to input?");
    String subject = input.nextLine();
    System.out.println("Input result score");
     score = input.nextInt();
    }
    void logic(){
        if (score >= 70) {
           grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade =  "C";
        } else if (score >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
         
    }
    
    public void displayresult(){
        System.out.println("\n Result");
        System.out.println("Course: " + subject);
        System.out.println("Score: " + score);
        System.out.println("Grade: "+ grade);
         
    }
}
    
    
    

