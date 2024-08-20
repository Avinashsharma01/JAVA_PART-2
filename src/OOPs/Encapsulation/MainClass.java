package OOPs.Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Myclass m1 = new Myclass();
        String name = m1.Name;
        System.out.println(name);

        m1.setName("Hello Avinash");
        m1.setAge(20);

        String nn = m1.getName();
        System.out.println(nn);
        int mm = m1.getAge();
        System.out.println(mm);

    }
}
