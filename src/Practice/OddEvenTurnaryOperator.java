package Practice;

import java.util.Scanner;

public class OddEvenTurnaryOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to the oddeven calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any number:- ");
        int number = input.nextInt();

        String result = number%2==0? "Even":"Odd";
        System.out.println(result);
    }
}
