/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 * I feel goofy since I had originally written all the code here inside another Project I used for the Quiz (lol)
 *
 */

import java.util.Scanner;


public class ArrayProcessing {

    private int [] monkeyD;
    private Scanner wannaRock;


    public ArrayProcessing() {
        System.out.println("I NEED 5 NUMBERS:");
        monkeyD = new int[5];
        wannaRock = new Scanner(System.in);

        getNumbers();
        processNumbers();
    }

    public void getNumbers() {

        for (int i = 0; i < monkeyD.length; i++) {
            monkeyD[i] = wannaRock.nextInt();

        }
    }

    public void processNumbers () {

        boolean mrBeast = true;
        while(mrBeast) {

            int chicharrones = printMenu();

            switch (chicharrones) {
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
                    System.out.println("You need some Horchata buddy...");
                    break;
            }
            mrBeast = again();
        }
    }

    public int printMenu () {

        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers\n2) Multiply numbers\n3) Print numbers\n4) Print number in reverse");
        return wannaRock.nextInt();

    }

    public void add() {

        int plus = 0;
        for (int i = 0; i < monkeyD.length; i++) {
            plus += monkeyD[i];

        }
        System.out.println("The sum of the numbers is: " + plus);
    }

    public void mult() {

        int times = 1;
        for (int i = 0; i < monkeyD.length; i++) {
            times *= monkeyD[i];

        }
        System.out.println("The product of the numbers is: " + times);
    }

    public void print() {

        for (int i = 0; i < monkeyD.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + monkeyD[i]);

        }
    }

    public void reverse() {

        for (int i = monkeyD.length-1; i >= 0; i--) {
            System.out.println("Number " + (i + 1) + ": " + monkeyD[i]);

        }
    }

    public boolean again() {
        System.out.print("Enter 1 to choose another option or 2 to exit: ");
        int choice = wannaRock.nextInt();
        return (choice == 1);
    }

    public static void main(String[] args) {

        new ArrayProcessing();

    }
}