/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.Scanner;

public class ArrayProcessing {
    private int[] arr;
    private Scanner sc;
    public ArrayProcessing(){
        arr = new int[5];
        sc = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }
    public void getNumbers(){
        System.out.println("Enter 5 integers: ");
       for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
       }

    }
    public void processNumbers(){
        boolean runAgain = true;
        while(runAgain){
            int choice = printMenu();
            if(choice == 1){
                add();
            }
            else if(choice == 2){
                mult();
            }
            else if(choice == 3){
                print();
            }
            else if(choice == 4){
                reverse();
            }
            else{
                System.out.println("Invalid option. Please enter a number from 1 to 4.");
            }
            runAgain = again();
        }
    }

    public int printMenu(){
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        while(!sc.hasNextInt()){
            System.out.println("Invalid input. Please enter a number from 1 to 4.");
            sc.next();
        }
        return sc.nextInt();
    }
    public void add(){
        int sum  = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
    public void mult(){
        int product = arr[0];
        for(int i = 1; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println("Product: " + product);
    }
    public void print(){
        System.out.print("List: ");
        for(int i = 0; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public void reverse(){
        System.out.print("Reversed list: ");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public boolean again(){
        System.out.println("Enter 1 to choose another option or 2 to exit: ");
        int input = sc.nextInt();
        return input == 1;
    }
    public static void main(String[]args){
        ArrayProcessing a = new ArrayProcessing();
    }

}
