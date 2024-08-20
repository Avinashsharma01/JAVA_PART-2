package Practice;

public class UseToString {
    String name;
    int age;

    @Override
    public String toString() {
        return "UseToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public UseToString(String name, int age){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        UseToString s1 = new UseToString("Avinash", 20);
        System.out.println(s1.toString());
    }
}
