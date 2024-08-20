package ControlStatement;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        // Swap a and b
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
