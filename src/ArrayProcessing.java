import java.util.Scanner;

/**
 * @author crazyne55
 *
 * 4/2/2023 @ 2058
 */
class ArrayProcessing {
    int[] intArrayWithFiveObj;
    Scanner s;

    ArrayProcessing() {
        this.intArrayWithFiveObj = new int[5];
        this.s = new Scanner(System.in);

        getNumbers();
        processNumbers();
    }

    void getNumbers() {
        for (int i = 0; i < intArrayWithFiveObj.length; i++) {
            System.out.printf("Enter an integer (%s/%s): ",i+1,intArrayWithFiveObj.length);
            intArrayWithFiveObj[i] = Integer.parseInt(s.nextLine());
        }
    }
    void processNumbers() {
        do {
            System.out.println("""
                    Choose an option to perform:
                      1) Add numbers
                      2) Multiply numbers
                      3) Print numbers
                      4) Print number in reverse
                    """);
            switch(s.nextLine()) {
                case "1":
                    add();
                    break;
                case "2":
                    mult();
                    break;
                case "3":
                    print();
                    break;
                case "4":
                    reverse();
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;
            }

        }
        while(again());
    }

    void add() {
        int sum = 0;
        for (int i = 0; i < intArrayWithFiveObj.length; i++) {
            sum += intArrayWithFiveObj[i];
        }
        System.out.println(String.format("The sum of all elements in the array is: %s", sum));
    }
    void mult() {
        int prod = 1;
        for (int i = 0; i < intArrayWithFiveObj.length; i++) {
            prod *= intArrayWithFiveObj[i];
        }
        System.out.println(String.format("The product of all elements in the array is: %s", prod));
    }
    void print() {
        for (int i = 0; i < intArrayWithFiveObj.length; i++) {
            System.out.println(String.format("[%s] %s",i,intArrayWithFiveObj[i]));
        }
    }
    void reverse() {
        for (int i = intArrayWithFiveObj.length-1; i >= 0; i--) {
            System.out.println(String.format("[%s] %s",i,intArrayWithFiveObj[i]));
        }
    }
    boolean again() {
        System.out.println("Enter (1) to continue or (2) to exit");
        if(s.nextLine().equals("1")) {
            return true;
        }
        return false;
    }





    public static void main(String[] args) {
        ArrayProcessing ap;
        ap = new ArrayProcessing();
    }
}