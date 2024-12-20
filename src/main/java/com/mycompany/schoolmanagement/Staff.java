/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmanagement;

/**
 *
 * @author USER
 */
public class Staff {
    String[][][]arr = {
    {
        {"Mr Dennis Ashieashie", "Senior Lecturer", "Computer Science"},
        {"Mr Sylvester Ele", "Senior Lecturer", "Computer Science"},
        {"Mrs Idongesit Eteng", "Head of Department", "Computer Science"},
        {"Mr Bassey Edim" , "Associate Lecturer", "Computer Science"}
    }
};

public void displayInfo(){
    System.out.println("Staff list");
    for (String[][] arr1 : arr) {
        // Iterate through 3D array
        for (String[] arr11 : arr1) {
            // Iterate through 2D array
            System.out.printf("%-25s %-20s %-20s%n", arr11[0], arr11[1], arr11[2]); // Format each row
        }
        System.out.println(); // Add space between 2D arrays
    }
}

}
