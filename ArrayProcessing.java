/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ArrayProcessing {
    public static int[] intArray = new int[5]; // Not sure on why this is declared here and in constructor

    public static Scanner in = new Scanner(System.in); // Creates publicly accessible Scanner object

    public ArrayProcessing() { // Constructor - Not sure how to call

        int[] intArray = new int[5];

        Scanner in = new Scanner(System.in);

        getNumbers(); // Calls method that prompts user to enter numbers

        processNumbers(); // Call up menu and selection methods

    }

    public static void getNumbers() { // Loads intArray with user defined numbers | WORKS

        try {
            int saveInput;

            for (int i = 0; i < intArray.length; i++) {

                System.out.println("Enter a number");

                intArray[i] = in.nextInt();

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        } catch (StackOverflowError e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        }

    }

    public static void processNumbers() { // Method calls up menu and processes user selection input } | WORKS

// While loop that prompts menu, allows menu selection , and on invalid input kicks back error message
// and closes program

        int choice = printMenu(); // There was easier ways to do this :(

        try {

            while (true) {

                if (choice == 1) {
                    add();
                    again();
                    break;
                }
                if (choice == 2) {
                    mult();
                    again();
                    break;
                }
                if (choice == 3) {
                    print();
                    again();
                }
                if (choice == 4) {
                    reverse();
                    again();
                } else {
                    System.out.println("Invalid input");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        } catch (StackOverflowError e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        }

    }

    public static int printMenu() { // Displays menu and accepts input from user | WORKS

        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");

        int menuSlc = in.nextInt();

        return menuSlc;

    }

    public static void add() { // Method sums all elements in intArray | WORKS

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {

            sum = intArray[i] + sum ;

        }

        System.out.println("The sum of all elements in the array is " + sum);

    }

    public static void mult() { // Method multiplies all elements in intArray | WORKS


        int sum = 1;

        for (int i = 0; i < intArray.length; i++) {

            int lastElm = intArray[i];
            sum = intArray[i] * sum;

        }

        System.out.println("The results of all elements in the array multiplied together is " + sum);

    }

    public static void print() { // Method prints contents of intArray | WORKS


        for (int i = 0; i < intArray.length; i++) {

            int currentElm = intArray[i];

            System.out.println(currentElm);

        }

    }

    public static void reverse(){ // Method reverse prints contents of intArray | WORKS

        int[] tempArray = new int[intArray.length]; // Creates new temp Array
        int j = 5; // tempArrays length value for progression just like i


        for (int i = 0; i < intArray.length; i ++) {

            tempArray[j - 1] = intArray[i]; // tempArray starting at 5 by minus 1 offset, decrements by 1 each iteration,
            // while intArray increments copying Array elements in reverse to tempArray
            j = j - 1; // decrements j by one each iteration
            //System.out.println(tempArray[j]);

        }

        // using k as a new i variable, outputs tempArray's elements that are the reverse order of intArray
        for (int k = 0; k < intArray.length; k++) {

            System.out.println(tempArray[k]);

        }

    }

    public static boolean exitMenu() { // Uses boolean values to output binary choice of 1 or 2 in menu | WORKS

        boolean exitValue = false;


        System.out.println("1) Choose another option");
        System.out.println("2) Exit");

        int menuSlc = in.nextInt();

        if (menuSlc == 1) {
            exitValue = true;
        } if (menuSlc == 2) {
            exitValue = false;
        }

        return exitValue;

    }

    public static void again() { // Using boolean values from exitMenu method (above), | WORKS
        // determines menu course of action

        boolean choice = exitMenu();

        try {

            if (choice == true) {
                processNumbers();
            }
            if (choice == false) {
                System.exit(0);
            } else {
                System.out.println("Invalid input");
                again();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        }  catch (StackOverflowError e) {
            System.out.println("Invalid input");
            System.out.println("Program Terminating");
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        ArrayProcessing arryP = new ArrayProcessing(); // Creates object out of constructor ArrayProcessing

        arryP.getNumbers(); // Calls method from object -  Also calls all associated sub methods
        // HAHAHA I think I figured it out!








    }

}
