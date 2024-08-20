package Practice.Encapsulation;

public class BackAccount {
    private String AccountNo;
    private String AccountHolderName;
    private double Balance;



    public void Deposit( int AccountNo, String AccountHolderName,double money ){
        if(money<=0){
            System.out.println("invalid Deposit");
        }else{
//            Balance+=money;
            Balance=Balance+money;
            System.out.printf(" %f Deposit successfully", money);
            System.out.println(Balance);
        }

    }

    public double withdrow(double money){
        if (Balance <= money){
            System.out.println("You Can't withdrew");
        }else {
            Balance-=money;
            System.out.println("withdrew successfully");

        }
        return Balance;
    }

    public static void main(String[] args) {
        BackAccount bank = new BackAccount();
        bank.Deposit(12345678, "Avinash", 500);
        double with = bank.withdrow(50);
        System.out.printf(" Current Balance is %f : ", with );

    }
}
