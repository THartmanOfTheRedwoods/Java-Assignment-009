
import java.util.Scanner;

/**
 * Assignment 09
 * Author: Ricky G
 * Date: 2023-04-02
 * Accidently pushed to the main branch so here is the Spring2023 idk if if matters now
 */
public class ArrayProcessing {
    private int[] numbers = new int[5];
    private Scanner scanner;

    // Constructor
    public ArrayProcessing() {
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    // Get user input for numbers
    private void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    // Process user input based on menu choice
    private void processNumbers() {
        boolean shouldContinue;
        do {
            int choice = printMenu();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    mult();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    reverse();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            shouldContinue = again();
        } while (shouldContinue);
    }

    // Print menu and get user choice
    private int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        return scanner.nextInt();
    }

    // Add numbers in the array
    private void add() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum is: " + sum);
    }

    // Multiply numbers in the array
    private void mult() {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("The product is: " + product);
    }

    // Print numbers in the array
    private void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    // Print numbers in the array in reverse order
    private void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    // Prompt user to continue or exit
    private boolean again() {
        System.out.println("Enter 1 to choose another option, 2 to exit.");
        int choice = scanner.nextInt();
        return choice == 1;
    }

    // Main method to run the program
    public static void main(String[] args) {
        new ArrayProcessing();
    }
}

