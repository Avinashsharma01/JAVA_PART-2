package Recursion;

import java.util.Scanner;

public class FactorialUsingRecursive {
    public static void main(String[] args) {
        System.out.println("Welcome to the factorial calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = input.nextInt();
        long fact = FactUsingRecursive(n);
        System.out.println("factorial using recursive:- "+ fact);

        // factorial using for loop
        long factorial = FactUsingFor(n);
        System.out.println("Fact using for loop:- "+ factorial);

    }

    public static long FactUsingRecursive(int n){
        if (n==1){
            return 1;
        }else {
            return n*FactUsingRecursive(n-1);
        }
    }

    public static long FactUsingFor(int n){
        int fact=1;
        for (int i=1;i<=n; i++){
            fact*=i;
        }
        return fact;
    }


}
