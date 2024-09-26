package com.may2.hashtest;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDatabase 
{

    private static HashMap<String, Integer> studentDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("1. Add a student\n2. View student information\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudentInformation();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();

        studentDatabase.put(name, grade);
        System.out.println("Student added successfully!\n");
    }

    private static void viewStudentInformation()
    {
    	
    	System.out.println(studentDatabase.toString()); 
    }
}
