import java.util.Scanner;
public class ArrayProcessing {
    private int newArray[];
    Scanner scanner;

    public ArrayProcessing() {
        scanner = new Scanner(System.in);
        newArray = new int[5];
        getNumbers();
        processNumbers();



    }
    public void processNumbers() {
        boolean again = true;
        while (again) {
            int menue = printMenu();
            System.out.println("");
            if (menue == 1) {add();}
            else if (menue == 2) {multiply();}
            else if (menue == 3) {print();}
            else if (menue == 4) {reverse();}
            else {
                System.out.println("error");
            }
            System.out.println("");
            again = again();
        }
    }

    public void getNumbers() {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("please enter a value");
            newArray[i] = scanner.nextInt();
        }
    }

    public void print() {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("value "+i+" in the array is:");
            System.out.println(newArray[i]);
        }
    }
    public void reverse() {
        for (int i = newArray.length-1; i >= 0; i--) {
            System.out.println("value "+i+" in the array is:");
            System.out.println(newArray[i]);
        }
    }

    public int printMenu() {
        System.out.println("chose an option:");
        System.out.println("1) add numbers");
        System.out.println("2) multiply numbers");
        System.out.println("3) print numbers");
        System.out.println("4) print numbers in reverse");

        return(scanner.nextInt());
    }

    private void add() {
        int b = 0;
        for (int i = 0; i < newArray.length; i++) {
            b += newArray[i];
        }
        System.out.println("The sum of values added together is: "+ b);
    }
    private void multiply() {
        int c = 1;
        for (int i = 0; i < newArray.length; i++) {
            c *= newArray[i];
        }

        System.out.println("All of the values multiplied together equals: "+ c);
    }
    private boolean again() {
        System.out.println("");
        System.out.println("1) to chose another option");
        System.out.println("2) to exit");
        if (scanner.nextInt() == 1) {
            return true;
        }
        return false;
    }

}
