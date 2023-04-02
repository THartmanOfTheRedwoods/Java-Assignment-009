/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ArrayProcessing {
    Scanner console;
    int[] array;

    public ArrayProcessing() {
        console = new Scanner(System.in);
        array = new int[5];

        getNumbers();
        processNumbers();
    }
    public void getNumbers() {
        System.out.println("Please type five(5) numbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type your number and press enter: ");
            array[i] = console.nextInt();
        }
        System.out.println("Task complete");
    }
    public void processNumbers() {
        boolean repeat = true;
        while (repeat) {
            int option = printMenu();
            if (option == 1) {
                add();
            }
            else if (option == 2) {
                multiply();
            }
            else if (option == 3) {
                print();
            }
            else if (option == 4) {
                reverse();
            }
            else {
                System.out.println("Not a valid input. Type an integer from 1 - 4");
            }
            repeat = again();
        }
    }
    public void add() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Array Sum: "+sum);
        System.out.println();
    }
    public void multiply() {
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            prod *= array[i];
        }
        System.out.println("Array Product: "+prod);
        System.out.println();
    }
    public void print() {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void reverse() {
        System.out.println("Reversed: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public int printMenu() {
        System.out.println("Pick an operation to execute: ");
        System.out.println("1.) Add Integers");
        System.out.println("2.) Multiply Integers");
        System.out.println("3.) Print Integers");
        System.out.println("4.) Print Integers in reverse");
        while (!console.hasNextInt()) {
            System.out.println("Not a valid input. Type an integer from 1 - 4");
            console.next();
        }
        return console.nextInt();
    }
    public boolean again() {
        System.out.println("Press 1 to run again or press 2 to exit: ");
        int in = console.nextInt();
        return in == 1;
    }

    public static void main(String[]args) {
        ArrayProcessing a = new ArrayProcessing();
    }
}
