import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        int a, b, fact=1;
        System.out.println("Enter an integer to calculate its factorial");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        if (a<0) {
            System.out.println("Please enter a non negative number");
        }
        else {
            for (b=1; b<=a; b++)
                fact = fact*b;
            System.out.println("factorial of "+a+"is ="+fact);
        }
    }
}
