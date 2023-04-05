import java.util.Scanner;

public class ArrayProcessing {
        private int[] numbers;
        private Scanner scanner;

        public ArrayProcessing() {
            numbers = new int[5];
            scanner = new Scanner(System.in);
            getNumbers();
            processNumbers() ;
        }

        public void getNumbers() {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i+1) + ": ");
                numbers[i] = scanner.nextInt();
            }
        }

        public void processNumbers() {
            boolean repeat = true;
            while (repeat) {
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
                        System.out.println("Invalid choice. Try again.");
                }
                repeat = again();
            }
        }

        public int printMenu() {
            System.out.println("Choose an option to perform:");
            System.out.println("1) Add numbers");
            System.out.println("2) Multiply numbers");
            System.out.println("3) Print numbers");
            System.out.println("4) Print numbers in reverse");
            System.out.print("Enter your choice: ");
            return scanner.nextInt();
        }

        public void add() {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("The sum is: " + sum);
        }

        public void mult() {
            int product = 1;
            for (int i = 0; i < numbers.length; i++) {
                product *= numbers[i];
            }
            System.out.println("The product is: " + product);
        }

        public void print() {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Number " + (i+1) + ": " + numbers[i]);
            }
        }

        public void reverse() {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println("Number " + (i+1) + ": " + numbers[i]);
            }
        }

        public boolean again() {
            System.out.print("Enter 1 to choose another option or 2 to exit: ");
            int choice = scanner.nextInt();
            return choice == 1;
        }
    }
