import java.util.Scanner;

public class ScannerClass {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        String Total;
        System.out.println("Enter an integer a");
        a= in.nextInt();
        System.out.println("Enter an integer b");
        b= in.nextInt();

        System.out.println("Storing the sum in addition total");
        Total= in.nextLine();

        int c = a+b;
        System.out.println("Total is = "+c);


    }
}
