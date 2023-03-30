import java.util.Scanner;
public class ArrayProcessing {
    int[] placeHolderNum = new int[5];
    Scanner in;
    public ArrayProcessing() {
        this.in = new Scanner(System.in);
        getNumbers(); //array of ints created within this method
        processNumbers();
    }
    public void getNumbers(){
        for(int i=0;i<placeHolderNum.length;i++){
            System.out.println("Enter number");
            this.placeHolderNum[i] = Integer.valueOf(in.nextLine());
        }
    }
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
            ArrayProcessing newArray = new ArrayProcessing();//I am not sure if this is considered a recursive call or not, as it eventually calls processNumbers, but not directly
        }
    }
    public int printMenu(){
        System.out.println("Choose an option to perform:\n" +
                "  1) Add numbers\n" +
                "  2) Multiply numbers\n" +
                "  3) Print numbers\n" +
                "  4) Print number in reverse");
        return Integer.valueOf(in.nextLine());
    }
    public boolean again(){
        System.out.format("Would you like to select another option?\t\t\t1 to select another option\n%78s\n",  "2 to quit");
        int answerNum = Integer.valueOf(in.nextLine());
        if(answerNum == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void add(){
        int sum=0;
        for(int i=0;i< placeHolderNum.length;i++){
            sum += this.placeHolderNum[i];
        }
        System.out.println("The sum is " + sum);
    }
    public void mult(){
        int product = 1;
        for(int i=0;i< placeHolderNum.length;i++){
            product *= this.placeHolderNum[i];
        }
        System.out.println("The product is " + product);
    }
    public void print(){
        System.out.print("The list of numbers is:    ");
        for(int i=0;i< placeHolderNum.length;i++){
            System.out.printf("%d\t", placeHolderNum[i]);;
        }
        System.out.println();
    }
    public void reverse(){
        System.out.print("The reversed list of numbers is:    ");
        for(int i=0;i< placeHolderNum.length;i++){
            System.out.printf("%d\t", placeHolderNum[placeHolderNum.length-i-1]);;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayProcessing array = new ArrayProcessing();
    }
}