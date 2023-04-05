import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayProcessing {
    public static int[] mainArray = {1, 2, 3, 4, 5};
    Scanner in = new Scanner(System.in);

    public ArrayProcessing(int[] array) {
        int[] mainArray = new int[5];
        getNumbers();
        processNumbers();
    }

    void getNumbers() {
        for (int i = 0; i < mainArray.length; i++) {
            System.out.print("Please enter an integer: ");
            mainArray[i] = Integer.parseInt(in.nextLine());
        }
    }

    void processNumbers() {
        int a = 0;
        int select = printMenu(a);
        while (again()) {
            new ArrayProcessing(mainArray);
            try {
                if (select == 1) {
                    add();
                } else if (select == 2) {
                    multi();
                } else if (select == 3) {
                    print();
                } else if (select == 4) {
                    reverse();
                }
            } catch (NumberFormatException ime) {
                System.out.println("Your input is invalid, please try again");
            }
        }
    }

    int printMenu(int a) {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        return Integer.parseInt(in.nextLine());
    }

    void add() {
        int sum = 0;
        for (int i = 0; i < mainArray.length; i++) {
            sum += mainArray[i];}
        System.out.println("The sum of your array is: " + sum);
    }

    void multi() {
        int result = 1;
        for (int i = 0; i < mainArray.length; i++) {
            result *= mainArray[i];
        }
        System.out.println("Your array multiplied together is: " + result);
    }

    void print() {
        for (int j : mainArray) {
            System.out.println(mainArray[j]);
        }
    }

    void reverse() {
        for (int i = 4; i < mainArray.length; i--) {
            System.out.println(mainArray[i]);
        }
    }

    boolean again() {
        int a = 0;
        boolean ret = false;
        System.out.println("Please enter 1 to restart the program, or 2 to exit: ");
        try {
            a = Integer.parseInt(in.nextLine());
            ret = (a == 1);
        } catch (Exception e) {
            System.out.println("Your input is invalid, please try again");
        }
        return ret;
    }

        public static void main (String[]args){
            new ArrayProcessing(mainArray);
        }
    }