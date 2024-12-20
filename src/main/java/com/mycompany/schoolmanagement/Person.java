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
public class Person {
void name() {
    Scanner input = new Scanner(System.in);
    String name;
    int age;
    String regno;
    String department;
    int level;

    while (true) {
        // Input Name
        System.out.println("Input your name:");
        name = input.nextLine();

        // Input Age with Validation
        while (true) {
            System.out.println("Input your age:");
            try {
                age = Integer.parseInt(input.nextLine());
                break; // Exit loop if valid age is provided
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age:");
            }
        }

        // Input Registration Number
        System.out.println("Input Regno:");
        regno = input.nextLine();

        // Input Department
        System.out.println("Input Department:");
        department = input.nextLine();

        // Input Level of Study with Validation
        while (true) {
            System.out.println("Input Level of Study:");
            try {
                level = Integer.parseInt(input.nextLine());
                break; // Exit loop if valid level is provided
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid level:");
            }
        }

        // Display Collected Information
        System.out.println("\nInformation Collected:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Regno: " + regno);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);

        // Check if the user wants to add another record
        System.out.println("Do you want to add another record (yes/no):");
        String response = input.nextLine().trim().toLowerCase();

        if (response.equals("no")) {
            System.out.println("Exiting the loop. Thank you!");
            break;
        }
    }
}

    
}
