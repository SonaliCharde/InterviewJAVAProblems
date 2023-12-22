

import java.math.BigInteger;
import java.util.Scanner;
public class AddingLargenumbers {
    public static void main(String[]args){
        String number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter large number1" );
        number1= in.nextLine();
        System.out.println("Enter large number2");
        number2 = in.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum= first.add(second);
        System.out.println("Result is "+sum);


    }
}
