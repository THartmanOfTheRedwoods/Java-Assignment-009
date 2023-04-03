import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers;
    private Scanner scanner;

    public ArrayProcessing() {
        numbers = new int[5]; // initializes an integer array of size 5
        scanner = new Scanner(System.in);
        getNumbers(); // calls the getNumbers() method to populate the array
        processNumbers(); // calls the processNumbers() method to perform operations on the array
    }

    public void getNumbers() {
        for (int i = 0; i < numbers.length; i++) { // loop through the array
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // read in the number and store it in the array
        }
    }

    public boolean again() {
        System.out.print("Do you want to perform another action (y/n): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else if (choice.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Invalid choice. Please choose again.");
            return again();
        }
    }

    public void processNumbers() {
        boolean doAgain = true; // initializes a boolean variable to control the loop
        while (doAgain) { // loop until doAgain is false
            int choice = printMenu();
            switch (choice) {
                case 1:
                    add(); // call the add() method
                    break;
                case 2:
                    mult(); // call the mult() method
                    break;
                case 3:
                    print(); // call the print() method
                    break;
                case 4:
                    reverse(); // call the reverse() method
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again."); // error message for invalid choice
            }
            doAgain = again(); // calls again() to determine if the loop should continue
        }
    }

    public int printMenu() {
        // displays a menu and prompts the user to choose an operation
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print numbers in reverse");
        System.out.print("Enter your choice: ");
        return scanner.nextInt(); // returns the user's choice
    }

    public void add() {
        int sum = 0; // initializes a variable to hold the sum of the numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers is: " + sum);
    }

    public void mult() {
        int product = 1; // initializes a variable to hold the product of the numbers
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i]; // multiply each number by the product variable
        }
        System.out.println("The product of the numbers is: " + product);
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) { // loop through the array
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    public void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]); // print each number in reverse order
        }
    }
}