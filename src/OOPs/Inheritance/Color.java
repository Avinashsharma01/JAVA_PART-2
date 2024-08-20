package OOPs.Inheritance;

public class Color extends Dog {
    public void Testing(){
        System.out.println("This is the testing methods");
    }

    public static void main(String[] args) {
        Color c1 = new Color();
        c1.color();
        c1.bark();
    }
}
