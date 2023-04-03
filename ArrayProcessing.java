import java.util.Scanner;

public class ArrayProcessing {
    private int[] numbers = new int[5];
    private Scanner scanner;

    public ArrayProcessing() {
        scanner = new Scanner(System.in);
        getNumbers();
        processNumbers();
    }

    public void getNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void processNumbers() {
        while (again()) {
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
                    System.out.println("Invalid choice.");
            }
        }
    }

    public int printMenu() {
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        return scanner.nextInt();
    }

    public void add() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    public void mult() {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product: " + product);
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    public void reverse() {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    public boolean again() {
        System.out.println("Enter 1 to choose another option or 2 to exit.");
        int input = scanner.nextInt();
        return input == 1;
    }

    public static void main(String[] args) {
        new ArrayProcessing();
    }
}