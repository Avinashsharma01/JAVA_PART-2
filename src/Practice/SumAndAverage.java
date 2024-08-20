package Practice;

import java.util.Arrays;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and average calculator");
        int[] array =  getElements();

        int arraySum= sum(array);
        System.out.println("Sum of Array" + Arrays.toString(array) + " is = " + arraySum);

        double ArrayAverage = Average(array);
        System.out.println("Average:- "+ ArrayAverage/array.length);
    }

public static int sum(int[] arr){
    int i=0;
    int arraySum=0;
    while (i<arr.length){
        arraySum+=arr[i];
        i++;
    }
    return arraySum;
}



public static double Average(int[] array){
        int i=0;
        double total = 0;
        while (i<array.length){
            total+=array[i];
            i++;
        }
    return total;
}



public static int[]   getElements(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the size of element : - ");
    int size = input.nextInt();
    int nums[] = new int[size];
    int i=0;
    while (i<size){
        System.out.print("please enter element no "+ (i+1)+ ": ");
        nums[i] = input.nextInt();
        i++;
    }
    return nums;

}
}

