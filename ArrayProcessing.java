/**
 * @author MK Ripley
 * @since Version 1.0
 * 4/01/2023
 **/

import java.util.Scanner;

public class ArrayProcessing {

    private static int[] myArray = new int[5];
    Scanner myScanner = new Scanner(System.in);

    public ArrayProcessing(){
        getNumbers();
        processNumbers();
        /** System.out.println(sumArray()); */ //for my own reference

    }

    public void getNumbers() {
        System.out.println("I will ask you to enter 5 numbers, one per line. ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Input a number and press enter:");
            myArray[i] = Integer.parseInt(myScanner.nextLine());
        }
        System.out.println("Done. ");

    }

    public void processNumbers(){
        int userSelection = printMenu();
        if(userSelection == 1){
            add();
        } else if (userSelection == 2) {
            mult();
        } else if (userSelection == 3) {
            print();
        } else if (userSelection == 4) {
            reverse();
        }
        else{
            System.out.println("Please enter one of the numbered options (1, 2, 3, or 4).");
        }
        if(again()){
            processNumbers();
        } //I went outside what the instructions asked and added some extra options
        // so you could choose to work with the numbers you already input, or start the whole process over.
        //I hope that's alright, I liked being able to see all the outputs for the same number set without
        // retyping everything.
        else { System.out.format("Would you like to enter new numbers?\n" +
                "  1) Yes\n" +
                "  2) No\n" );
            int userAnswer = Integer.parseInt(myScanner.nextLine());
            if (userAnswer==1){
                ArrayProcessing myObj = new ArrayProcessing();
            }
            else {return;}

        }
    }
    public int printMenu(){
        System.out.println("Choose an option to perform:\n" +
                "  1) Add numbers\n" +
                "  2) Multiply numbers\n" +
                "  3) Print numbers\n" +
                "  4) Print number in reverse");
        return Integer.parseInt(myScanner.nextLine());
    }
    public boolean again(){
        System.out.format("Would you like to select a different option?\n" +
                "  1) Yes\n" +
                "  2) No\n" );
        int answerNum = Integer.parseInt(myScanner.nextLine());
        return answerNum == 1;
    }
    public void add(){
        int sum=0;
        for(int i=0;i< myArray.length;i++){
            sum += myArray[i];
        }
        System.out.println("Summation: " + sum);
    }
    public void mult(){
        int product = 1;
        for(int i=0;i< myArray.length;i++){
            product *= myArray[i];
        }
        System.out.println("Product: " + product);
    }
    public void print(){
        System.out.print("The numbers you entered were:\n");
        for(int i=0;i< myArray.length;i++){
            System.out.printf("%d\n", myArray[i]);;
        }
        System.out.println();
    }
    public void reverse(){
        System.out.print("The reversed list of numbers is:\n");
        for(int i=0;i< myArray.length;i++){
            System.out.printf("%d\n", myArray[myArray.length-i-1]);;
        }
        System.out.println();
    }


   /** just stuff for my own reference

    public static void printArray() {
        System.out.print("{" + myArray[0]);
        for (int i = 1; i < myArray.length; i++) {
            myArray[i]=i;
            System.out.print(", " + myArray[i]);
        }
        System.out.println("}");
    }
    public static int sumArray() {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=i;
            sum += myArray[i];
        }
        return sum;
    }

    */

    public static void main(String[] args) {
        ArrayProcessing myObj = new ArrayProcessing();

    }

}
