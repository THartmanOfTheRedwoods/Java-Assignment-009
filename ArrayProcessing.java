/**
 * @author Jason Carr
 * @since v1.0
 */

import java.util.Scanner;

public class ArrayProcessing {
    // Define the class fields
    final private int[] arrayOne; // array object
    final private Scanner sc; // Scanner object for input from the terminal

    // Define the constructor
    public ArrayProcessing() {
        // Initialize the class fields
        arrayOne = new int[5]; // array that holds 5 integers
        sc = new Scanner(System.in);

        // Call the methods to get input and process the numbers
        getNumbers();
        processNumbers();
    }

    // Method to get input from the terminal
    public void getNumbers() {
        System.out.println("Enter 5 integers: ");
        // Use a loop to read 5 integers from the terminal and store them in the array
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = sc.nextInt();
        }
    }

    // Define the main processing loop
    public void processNumbers() {
        boolean again = true;
        while (again) {
            // Call the method to print the menu and get the user's choice
            int choice = printMenu();

            // Use a switch statement to call the appropriate method based on the user's choice
            switch (choice) {
                case 1 -> {
                    System.out.println("1) Add numbers");
                    add();
                }
                case 2 -> {
                    System.out.println("2) Multiply numbers");
                    mult();
                }
                case 3 -> {
                    System.out.println("3) Print numbers");
                    print();
                }
                case 4 -> {
                    System.out.println("4) Print numbers in reverse");
                    reverse();
                }
                default -> System.out.println("Error no such option");
            }

            // Call the method to check if the user wants to continue or exit the program
            again = again();
        }
    }

    // Method to print the menu and get the user's choice
    public int printMenu() {
        System.out.println("Choose an option to preform: ");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        return sc.nextInt(); // read an integer from the terminal and return it
    }

    // Method to add the numbers in the array
    public void add() {
        int sum = 0;
        // Use a for-each loop to add up the numbers in the array
        for (int j : arrayOne) {
            sum += j;
        }
        // Print the sum of the numbers in the array
        System.out.print("The sum of the number in the array is: " + sum);
    }

    /**
     * Prompts the user to choose whether they want to select another option or exit
     *
     * @return true if the user inputs 1 to select another option, false otherwise
     */
    public boolean again() {
        // Print empty lines for formatting
        System.out.println();
        System.out.println();
        // Prompt the user to enter 1 to select another option or 2 to exit
        System.out.println("Enter 1 to choose another option or 2 to exit!");
        // Read the user's input from the scanner object
        int choice = sc.nextInt();
        // Return true if the user inputs 1, false otherwise
        return choice == 1;
    }


    // Method to multiply the numbers in the array
    public void mult() {
        int sum = 1;
        // Use a for-each loop to multiply the numbers in the array
        for (int j : arrayOne) {
            sum *= j;
        }
        // Print the product of the numbers in the array
        System.out.print("The numbers in the array multiplied together is: " + sum);
    }

    // Method to print the numbers in the array
    public void print() {
        // Use a loop to print the numbers in the array
        System.out.print("{" + arrayOne[0]);
        for (int i = 1; i < arrayOne.length; i++) {
            System.out.print(", " + arrayOne[i]);
        }
        System.out.println("}");
    }

    // Method to print the numbers in the array in reverse order
    public void reverse() {
        // Print opening curly brace
        System.out.print("{");
        // Loop through the array in reverse order, starting from the last element
        for (int i = arrayOne.length - 1; i >= 1; i--) {
            // Print the current element, followed by a comma and a space
            System.out.print(arrayOne[i] + ", ");
        }
        // Print the first element (which wasn't printed in the loop), followed by a closing curly brace
        System.out.println(arrayOne[0] + "}");
    }

    public static void main(String[] args) {
        // Create a new instance of the ArrayProcessing class
        new ArrayProcessing();
    }

}