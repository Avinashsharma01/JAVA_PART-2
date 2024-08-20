package Practice;

public class Mohit {
    public String name="Mohit";
    public int age=20;
    public int Id=123345;

    public void ShowDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Id);
    }

    public void MohitRoutine(){
        System.out.println("Mohit study everyday");
    }

    public static void main(String[] args) {
        Mohit m1 = new Mohit();
        m1.ShowDetails();
        m1.MohitRoutine();

    }

}
