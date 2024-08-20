package Practice.Encapsulation;

public class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    String ShowDetails(){
        return "Name: " + name+ " age: "+ age+ " Salary: "+salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Avinash", 20, 10000);
        emp.setAge(30);
        emp.setSalary(50000);


        String s= emp.ShowDetails();
        System.out.println(s);
    }
}
