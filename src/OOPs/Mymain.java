package OOPs;

public class Mymain {
 
    // static thing declare here
    static int b;
    static {
        b=20;
    }
    public static void display(){
        System.out.println("This is the value of B:-" + b);
    }

    public static void main(String[] args) {
        Mymain.display();


        First f1 = new First("Avinash", 20);
        First f2 = new First();
        f1.user();
        f2.user();
        First.pri();
    }
}
