package OOPs;

public class First {
    String name;
    int age;
    static int a;


    static {
        a=10;
    }

    First(String name, int age) {
        this.name = name;
        this.age = age;
    }

    First(){
        this.name="Soumya";
        this.age=19;
    }


    public static void pri(){
        System.out.println("This is the value of B:-" +a);
    }


    public void user() {
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
    }

}
