import java.util.Scanner;

public class CompareStrings {
    public static void main(String[]args){
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter s1");
        s1=in.nextLine();
        System.out.println("Enter s2");
        s2=in.nextLine();
        if (s1.compareTo(s2)<0) {
            System.out.println("s1 is a greater string");
        } else if (s1.compareTo(s2)>0) {
            System.out.println("s2 is a greater string");
        }
        else {
            System.out.println("Both the Strings are equal");
        }

        }
    }


