import java.util.Scanner;

public class FindEvenorOddNumber {
    public static void main(String[]args){
        int x;
        System.out.println("Enter value for x");
        Scanner in = new Scanner(System.in);
        x= in.nextInt();
        if (x%2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
