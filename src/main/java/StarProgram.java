public class StarProgram {
    public static void main(String[]args){
        int row, stars;
        for (row=1; row<=10; row++){
            for (stars=1; stars<=row;stars++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
