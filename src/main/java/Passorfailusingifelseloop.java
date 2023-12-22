
import java.util.Scanner;
public class Passorfailusingifelseloop {
    public static void main(String[]args){
        float sciencemarks, mathsmarks, historymarks, englishmarks;
        int totalmarks = 400;
        //float obtainedmarks = sciencemarks+mathsmarks+historymarks+englishmarks;

        System.out.println("Enter all subject marks here");
        Scanner in = new Scanner(System.in);
        sciencemarks =in.nextFloat();
        mathsmarks= in.nextFloat();
        historymarks= in.nextFloat();
        englishmarks= in.nextFloat();
        float obtainedmarks = sciencemarks+mathsmarks+historymarks+englishmarks;
        System.out.println("Total obtained marks are " + obtainedmarks);
        if (((obtainedmarks/totalmarks)*100)>=70) {
            System.out.println("Congratulations you have passed with first class");
        } else if (((obtainedmarks/totalmarks)*100)>=50) {
            System.out.println("Congratulations you have passed with second class");
        } else if (((obtainedmarks/totalmarks)*100)>=35) {
            System.out.println("Congratulations you have passed with third class, study well next time");
        }
         else{
            System.out.println("Unfortunately you have failed. All the best for your next attempt");
        }

    }
    }




