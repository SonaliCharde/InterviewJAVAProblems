import java.util.Scanner;

public class WhileLoopUsingBreak {
    public static void main(String[]args){
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for i");
        while (true){
            i= in.nextInt();
            if (i==0) {
                break;
            }
            System.out.println("You entered value of i "+i);
            }
        }

    }

