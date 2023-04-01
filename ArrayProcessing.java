/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 3/31/2023
 * @since version 1.0
 */
import java.util.Scanner;

public class ArrayProcessing { //Create a class named, ArrayProcessing
    int[] myArray = new int[5];//One array that will hold 5 objects of type int. You pick the name.
    Scanner newScanner;//One Scanner object. You pick the name.
    public ArrayProcessing(){

        this.newScanner = new Scanner(System.in);

        getNumbers(); //* Calls the method getNumbers.

        processNumbers(); // * Calls the method processNumbers.


    }
    //* Create a method named, getNumbers, with a return type of void and no parameters that does the following:
    //    * Uses a for loop to prompt and grab five integers from the terminal window using the Scanner object and assign each one to an array element.
    //        * NOTE: Do not use the constant 5 in the for-loop test, use the length field.
        public void getNumbers() {
        for(int i = 0; i<myArray.length;i++){
            System.out.println("Enter numbers one at a time here. Press enter after each number.");
            this.myArray[i] = Integer.parseInt(newScanner.nextLine());
        }
    }
    //Create a method named, processNumbers, with a return type of void and no parameters that does the following:
    //    * Uses an appropriate loop statement to:
    //    * Call the method printMenu.
    public void processNumbers(){
        int operation = printMenu();
        if(operation == 1){
            add();
        } else if (operation == 2) {
            mult();
        } else if (operation == 3) {
            print();
        } else if (operation == 4) {
            reverse();
        }
        else{
            System.out.println("Please enter an accepted value");
        }
        if(again()){
            ArrayProcessing newArray;
            newArray = new ArrayProcessing();
        }
    }
    //Create a method named, printMenu, with a return type of int and no parameters that does the following:
    //    * Prints the following menu to the terminal window:
    //    ```
    //    Choose an option to perform:
    //    1) Add numbers
    //    2) Multiply numbers
    //    3) Print numbers
    //    4) Print number in reverse
    //    ```
    //    * Grabs input from the Scanner object and returns it to the calling statement.
    public int printMenu(){ //Create a method named, printMenu, with a return type of int and no parameters
        System.out.println("Choose an option to perform:\n" +
                "  1) Add numbers\n" +
                "  2) Multiply numbers\n" +
                "  3) Print numbers\n" +
                "  4) Print numbers in reverse");
        return Integer.parseInt(newScanner.nextLine());
    }
    public boolean again(){ //Create a method named, again, with a return type of boolean and no parameters
        System.out.format("Would you like to select another option?\n1 to select another option 2 to quit.");
        int answerNum = Integer.parseInt(newScanner.nextLine());
        if(answerNum == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void add(){ //* Create a method named, add, with a return type of void and no parameters
        int sum=0;
        for(int i=0;i< myArray.length;i++){
            sum += this.myArray[i];
        }
        System.out.println("The sum is " + sum);
    }
    public void mult(){ //Create a method named, mult, with a return type of void and no parameters
        int product = 1;
        for(int i=0;i< myArray.length;i++){
            product *= this.myArray[i];
        }
        System.out.println("The product is " + product);
    }
    public void print(){ //Create a method named, print, with a return type of void and no parameters
        System.out.print("The list of numbers is:    ");
        for(int i=0;i< myArray.length;i++){
            System.out.printf("%d\t", myArray[i]);
        }
        System.out.println();
    }
    public void reverse(){ // Create a method named, reverse, with a return type of void and no parameters
        System.out.print("The reversed list of numbers is:    ");
        for(int i=0;i< myArray.length;i++){
            System.out.printf("%d\t", myArray[myArray.length-i-1]);
        }
        System.out.println();
    }
 }
