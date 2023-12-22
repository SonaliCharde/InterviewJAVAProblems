public class MethodOverloading1 {
    public void addvalues(int a, int b){
        int c = a+b;
        System.out.println("First method "+c);
    }
    public void addvalues(int a, int b, int c){
        int d = a+b+c;
        System.out.println("Second method "+d);
    }
    public void addvalues(){
        System.out.println("no parameters");
    }
    public static void main(String[]args){
        MethodOverloading1 mo1 = new MethodOverloading1();
        mo1.addvalues(10, 10);
        mo1.addvalues(10,10,10);
        mo1.addvalues();


    }

}
