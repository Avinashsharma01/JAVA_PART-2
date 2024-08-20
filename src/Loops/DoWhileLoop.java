package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to print- ");
        int n = input.nextInt();
        int i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);
    }
}
