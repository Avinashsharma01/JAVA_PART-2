package Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to the even odd calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter any number:- ");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println(number + " This is even number");
        }
        else {
            System.out.println(number + " This is odd nnumber");
        }
    }
}
