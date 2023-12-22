import java.util.Scanner;

public class WhileloopusingBreakandContinue {
    public static void main (String[]args){
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for i");
        while (true){
            i=in.nextInt();
            if (i!=0) {
                System.out.println("You have entered value for i as "+i);
                continue;
            }
            else {
                System.out.println("0 is not valid for this program to run");
                break;
            }

        }
    }
}
