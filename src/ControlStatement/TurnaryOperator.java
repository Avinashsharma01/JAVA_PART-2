package ControlStatement;

import java.util.Scanner;

public class TurnaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter any number:- ");
        int num2 = input.nextInt();

        int greatorNumber = num1 > num2 ? num1 : num2;
        System.out.println("This is the greator number enterd by you:- " + greatorNumber);

    }
}
