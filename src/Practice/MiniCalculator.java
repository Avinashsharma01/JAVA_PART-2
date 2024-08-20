package Practice;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        System.out.println(".......................Welcome to the miniCalculator........................ ");
        System.out.println("     ------------------------------------------------------------------      ");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        Scanner input = new Scanner(System.in);
        System.out.print("Input your choice:- ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                Sum();
                break;
            case 2:
                Sub();
                break;
            case 3:
                Mul();
                break;
            case 4:
                Div();
                break;
            default:
                System.out.println("You have entered wrong choice");
        }
    }

    public static void Sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = input.nextInt();
        System.out.print("Enter first number:- ");
        double num2 = input.nextInt();
        double sum = num1+num2;
        System.out.println("This is the total of " + (int)num1 + " + " + (int)num2 + " = "+ (sum));
    }


    public static void Mul(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = input.nextInt();
        System.out.print("Enter first number:- ");
        double num2 = input.nextInt();
        double sum = num1*num2;
        System.out.println("This is the total of " + (int)num1 + " * " + (int)num2  + " = "+ (sum));
    }


    public static void Sub(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = input.nextInt();
        System.out.print("Enter first number:- ");
        double num2 = input.nextInt();
        double sum = num1-num2;
        System.out.println("This is the total of " + (int)num1 + " - " + (int)num2 + " = "+ (sum));
    }


    public static void Div(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = input.nextInt();
        System.out.print("Enter first number:- ");
        double num2 = input.nextInt();
        double sum = num1/num2;
        System.out.println("This is the total of " + (int)num1 + " / " + (int)num2 + " = "+ (sum));
    }

}
