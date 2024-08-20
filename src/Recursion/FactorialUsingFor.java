package Recursion;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = input.nextInt();

        int fact= 1;
        for (int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
