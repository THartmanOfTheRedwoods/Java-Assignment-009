import java.util.Scanner;


/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 * @since Version 1.0 2023-04-02
 */
public class ArrayProcessing {

    private final int[] intArr = new int[5];
    private final Scanner sc = new Scanner(System.in);

    // I added this because otherwise processNumbers() will still run even if getNumbers throws an err
    private boolean bad = false;

    public ArrayProcessing() throws Exception {
        this.bad = false;
        /*
         I don't think it is necessary to 'create' the instance variables
         since they do not change based on args passed in this constructor
         */
        getNumbers();
        processNumbers();

    }

    public void getNumbers() throws Exception {

        System.out.println("Please enter 5 numbers: \n");

        for (int k = 0; k < intArr.length; k++) {

            System.out.printf("Number %d : ", (k+1));
            try {
                this.intArr[k] = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("Uh oh! Not a valid input, goodbye...");
                this.bad = true;
                k = intArr.length;
            }

        }
    }

    public void processNumbers() throws Exception{
        if (this.bad) {return;};
        boolean ag = true;
        while (ag) {
            int pm = printMenu();
            switch (pm) {
                case 1 -> add();
                case 2 -> mult();
                case 3 -> print();
                case 4 -> reverse();
                default -> { // do nothing;
                }
            }
            ag = again();
        }
        System.err.println("Now Exiting...");
    }

    public int printMenu() {
        System.out.println("""

                Choose an option to perform:
                1) Add numbers
                2) Multiply numbers
                3) Print Numbers
                4) Print numbers in reverse
                """);
        try {return sc.nextInt();}
        catch (Exception e) {
            System.err.println("Error: Invalid input\n");
            sc.nextLine();
            return 0;}

    }

    public void add() {

        int sum = 0;

        // I am assuming enhanced for-loop is fine? I believe it uses intArr.length under the hood?
        for (int i : intArr) {
            sum += i;
        }
        System.out.printf("The sum of your numbers is: %d",sum);
    }

    public void mult() {

        int prod = 1;
        for (int i : intArr) {
            prod *= i;
        }
        System.out.printf("\nThe product of your numbers is: %d\n",prod);
    }

    public void print() throws Exception {

        int k = 1;
        for (int i : intArr) {
            System.out.printf("\nThe %s number is: %d\n", kth(k), i);
            k++;
        }
    }

    public void reverse() throws Exception {

        for (int k = (intArr.length - 1); k > -1; k-- ) {
            System.out.printf("\nThe %s number is: %d\n", kth(k+1), intArr[k]);
        }
    }

    public boolean again() {
        System.out.println("""

                Please choose a number:\s
                1) Choose another option
                2) Exit""");
        try {
            if (sc.nextInt() == 1) {
                return true;
            }

        } catch (Exception e) {return false;}

        // annoying that I have to include a return outside the try-catch -_-
        return false;
    }





    public static String kth(int k) throws Exception {
        return switch (k) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "fourth";
            case 5 -> "fifth";
            default -> throw new Exception("Invalid");
        };
    }

}
