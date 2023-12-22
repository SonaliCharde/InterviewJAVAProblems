import java.util.Scanner;

public class MultipleTable {
    public static void main(String[]args){
        int a, b;
        System.out.println("Enter a number to print multiplication table");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for (b=1; b<=10;b++){
            System.out.println(a+" * "+b+"="+(a*b));
        }
    }
}
