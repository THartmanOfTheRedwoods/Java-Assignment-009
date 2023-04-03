/**
 * @author michael thoreson
 * @since 1.0
 */

import java.util.Scanner;
public class ArrayProcessing {
int[] theArray = new int[5];
Scanner theScanner = new Scanner(System.in);

public ArrayProcessing(){
    this.theArray = theArray;
    this.theScanner = theScanner;
    getNumbers();
    processNumbers();
}
private void getNumbers(){
    System.out.printf("Please enter %d integers", this.theArray.length);
    for(int i =0 ; i < this.theArray.length; i++){
        this.theArray[i] = theScanner.nextInt();
    }
}
private int printMenu(){
    System.out.print("Choose an option to perform:\n" +
            "1) Add numbers\n" +
            "2) Multiply numbers\n" +
            "3) Print numbers\n" +
            "4) Print number in reverse");
    return this.theScanner.nextInt();
}
private void add(){
    int sum = 0;
            for(int i = 0; i < this.theArray.length; i++){
                sum += this.theArray[i];
            }
     System.out.println(sum);
    }
private void mult(){
    int prod = 1;
    for(int i = 0; i < this.theArray.length; i++){
        prod *= this.theArray[i];
    }
    System.out.println(prod);
}
private void print() {
    for (int i = 0; i < this.theArray.length; i++){
        System.out.println(this.theArray[i]);
        }
    }
private void reverse() {
    for (int i = this.theArray.length - 1; i >= 0; i--) {
        System.out.println(this.theArray[i]);
    }
}
private boolean again(){
    System.out.println("Again? press 1 for more fun.");
    int selection = this.theScanner.nextInt();
    return selection == 1;
    }
private void processNumbers() {
    try {
        switch (printMenu()) {
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
        }
        }    catch (Exception e) {
       System.out.println(e);
    }
    if (again()) {
        ArrayProcessing aP = new ArrayProcessing();
    }
}

}
