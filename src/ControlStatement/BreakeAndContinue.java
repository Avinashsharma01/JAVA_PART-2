package ControlStatement;

public class BreakeAndContinue {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if (i==8){
                break;  // this is the use of break statement
            } else if (i==4) {
                continue;   // and this is the use of continue statement
            }
            System.out.println(i);
        }
    }
}
