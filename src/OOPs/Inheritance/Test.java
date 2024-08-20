package OOPs.Inheritance;

public class Test extends Color{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.Testing();
        t1.bark();
        t1.color();
        System.out.println(t1.toString());
        System.out.println(t1.hashCode());
        System.out.println(t1.getClass());
    }
}
