import java.util.Scanner;

public class ArrayProcessing {
    private final int[] array;
    public final Scanner scanner;

    public ArrayProcessing() {
        array = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        for (int a = 0; a < array.length; a++) {

            System.out.println("Enter integer " + (a+1) + ": ");
            array[a] = scanner.nextInt();
        }
    }
    public void processNumbers() {
        boolean repeat = true;
        while (repeat) {
            int choice = printMenu();
             switch (choice) {
                case 1: add(); break;
                case 2: mult(); break;
                case 3: print(); break;
                case 4: reverse(); break;
                default:
                    System.out.println("Invalid choice");
            }
            repeat = again();
        }
    }
   public int printMenu () {
       System.out.println("Choose an option to perform:\n1) Add Numbers\n2) Multiply Numbers\n3) Print Numbers\n4) Print Numbers in Reverse");
        int choice = scanner.nextInt();
        return choice;
   }
    public void add() {
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum += array[a];
        }
        System.out.println("sum: "+sum);
    }
        public void mult() {
            int product = 1;
            for (int a = 0; a < array.length; a++) {
                product *= array[a];
            }
            System.out.println("Product: "+product);
    }
    public void print() {
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
    }
    public void reverse() {
        for (int a = array.length-1; a >= 0; a--) {
            System.out.println(array[a]);
        }
    }
    public boolean again() {
        System.out.println("Press 1 to choose another option, or any other number to quit: ");
         int choice = scanner.nextInt();
        if (choice ==1){
            return true;
        } else {
            System.out.println("Goodbye");
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
    }
}
