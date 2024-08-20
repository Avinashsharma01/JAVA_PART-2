package Practice;

import java.util.Scanner;

public class AreaAndCircumferenceOfcircle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Circle calculator:-  ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius:- ");
        int R = input.nextInt();
        // Area of circle method
        double area = AreaOfCircle(R);
        System.out.println("Area od circle is: "+ area);


        // circumference of circle method
        double circumference = Circumference(R);
        System.out.println("Circumferece of circle is: " + circumference);
    }


    // Area of circle
    public static double AreaOfCircle(int r){
        double PI = Math.PI;
        return (PI*Math.pow(r,2));
    }

    // circumference of circle
    public static double Circumference(int r){
        double PI = Math.PI;
        return 2*PI*r;
    }
}
