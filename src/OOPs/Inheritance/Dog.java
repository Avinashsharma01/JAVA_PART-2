package OOPs.Inheritance;

public class Dog extends Animal{
    public String DogColor = "Black";

    public void color(){
        System.out.println(DogColor);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
    }
}
