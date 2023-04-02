import java.util.Scanner;
public class ArrayProcessing {
    private int[] objects;
    private Scanner scanner;

    public ArrayProcessing() {
        objects = new int[5];
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    private void getNumbers() {
        for(int i = 0; i < objects.length; i++) {
            System.out.println("Enter an Integer " + (i + 1) + ":");
            objects[i] = scanner.nextInt();
        }
    }

    public void processNumbers() {
        while (true) {
            int choice = printMenu();
            switch (choice) {
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
                    System.out.println("Invalid choice!");
            }
            if (!again()) {
                break;
            }
        }
    }




    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i];
        }
        System.out.println("The sum of the numbers is: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int i = 0; i < objects.length; i++) {
            product *= objects[i];
        }
        System.out.println("The product of the numbers is: " + product);
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println("Integer " + (i + 1) + ": " + objects[i]);
        }
    }

    public void reverse() {
        for (int i = objects.length - 1; i >= 0; i--) {
            System.out.println("Integer " + (i + 1) + ": " + objects[i]);
        }
    }

    public boolean again() {
        System.out.print("Enter 1 to choose another option or 2 to exit: ");
        int input = scanner.nextInt();
        return input == 1;
    }

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();

    }

}
