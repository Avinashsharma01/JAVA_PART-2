package Practice;

import java.util.Scanner;

public class minimumOfTwoNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the minimun number finder:-  ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter any number:- ");
        int num2 = input.nextInt();

        int smallestNumber = num1<num2? num1:num2;
        System.out.println(smallestNumber);
    }
}
