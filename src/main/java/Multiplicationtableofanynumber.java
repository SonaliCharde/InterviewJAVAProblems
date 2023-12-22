import java.util.Scanner;

public class Multiplicationtableofanynumber {
    public static void main(String[]args){
        int a,b,x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ranges for multiplication table");
        a=in.nextInt();
        x= in.nextInt();
        for (b=1;b<=10;b++) {
            System.out.println(a+"*"+b +" ="+ (b*a));
        }
        for (y=1;y<=10;y++){
            System.out.println(x+"*"+y+ "= "+(x*y));
        }
    }
}
