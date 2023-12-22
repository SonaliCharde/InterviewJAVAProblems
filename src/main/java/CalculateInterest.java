public class CalculateInterest {
    public static void main(String[]args){
        MOR_Bank1 mor1 = new MOR_Bank1();
        MOR_Bank2 mor2 = new MOR_Bank2();

        System.out.println("Interest rate of Bank1 = "+ mor1.getInterest());
        System.out.println("Interest rate of Bank2 = "+ mor2.getInterest());
    }
}
