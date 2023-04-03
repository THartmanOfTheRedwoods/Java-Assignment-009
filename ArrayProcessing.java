/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ArrayProcessing {

    private Scanner sc;
    private int[] intArray;


    public ArrayProcessing() {

        this.sc = new Scanner(System.in);
        this.intArray = new int[5];

        getNumbers();
        processNumbers();

    }


    public void getNumbers() {

        for (int i = 0; i < this.intArray.length; i++) {

            System.out.print("Enter an integer for the Array: ");
            this.intArray[i] = this.sc.nextInt();
            this.sc.nextLine();

        }

    }

    public void processNumbers() {

        while (again()) {

            switch (printMenu()) {
                case 1 -> add();
                case 2 -> mult();
                case 3 -> print();
                case 4 -> reverse();
                default -> System.err.println("Input invalid.");
            }

        }

    }

    public int printMenu() {

        System.out.println("Choose an option to perform:\n1) Add numbers\n2) Multiply numbers\n3) Print numbers\n4) Print number in reverse");
        int result = sc.nextInt();
        sc.nextLine();
        return result;

    }

    public void add() {

        int sum = 0;

        for (int element : this.intArray) {
            sum += element;
        }

        System.out.printf("Sum: %d\n", sum);

    }

    public void mult() {

        int product = 1;

        for (int element : this.intArray) {
            product *= element;
        }

        System.out.printf("Product: %d\n", product);

    }

    public void print() {

        for (int i = 0; i < this.intArray.length; i++) {
            System.out.printf("Index: %d\tValue: %d\n", i, this.intArray[i]);
        }

    }

    public void reverse() {

        for (int i = this.intArray.length - 1; i >= 0; i--) {
            System.out.printf("Index: %d\tValue: %d\n", i, this.intArray[i]);
        }

    }

    public boolean again() {

        System.out.print("1) Choose another option\n2) Exit");
        int response = this.sc.nextInt();
        this.sc.nextLine();

        return response == 1;

    }

}
