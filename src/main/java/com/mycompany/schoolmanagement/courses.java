/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmanagement;

/**
 *
 * @author USER
 */
public class courses {
    void yearI(){
        System.out.println("YEAR 1 FIRST SEMESTER");
        String[] arrr = {"CSC 101: Introduction to Computer Science", "CSC 181: Computer Lab 1A ", "GSS 101: Use of English 1", "MTH 101: Elementary Mathematics 1", "PHY 111: General Physics 1", "PHY 181: Practical Physics I"};
        for(int  i = 0; i < arrr.length ; i++){
            System.out.println(arrr[i]);
        }
    }
    
    void yearI2nd(){
    System.out.println("\nYEAR 1 SECOND SEMESTER");
    String[] array = {
        "GSS 102: Use of English II",
        "CSC 102: Intorduction to Problem Solving",
        "CSC 182: Computer Lab 1B",
        "PHY 152: General Physics II",
        "MTH 102: Elementary Mathematics II",
        "STA 102: Probability and Statistics"    
    };
    for(int i = 0; i < array.length ; i++){
        System.out.println(array[i]);
    }
}
    void year2(){
    System.out.println("\nYEAR 2 FIRST SEMESTER");
    String[] arrray = {
        "CSC 201: Computer Programming I",
        "CSC 211: Discrete Structure",
        "CSC 241: Computer Hardware",
        "CSC 281: Computer Lab 2A",
        "MTH 231: Advanced Calculus",
        "MTH 211: Liner Algebra I",
        "MTH 261: Vector Analysis"
    };
    
    for(int i = 0 ; i < arrray.length; i++){
        System.out.println(arrray[i]);
    }
    }
    
    void year2Second (){
        System.out.println("\nYEAR 2 SECOND SEMESTER");
        String [] jca = {
            "CSC 202: Computer Programming II",
            "CSC 282: Computer Lab 2B",
            "CSC 232: Foundation of Sequential Program",
            "CSC 242: Foundation of Data Structures",
            "CSCS 222: Survey of Programming Languages",
            "STA 282 Statistical Inference I",
            "PHY 262: Electrical Circuits and Electronics"
        };
        
        for(int i = 0; i < jca.length; i++){
            System.out.println(jca[i]);
        }
    } 
}
