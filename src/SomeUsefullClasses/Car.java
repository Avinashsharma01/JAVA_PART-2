package SomeUsefullClasses;

public class Car {
    int NoOfWheels;
    int NoOfDoors;
    String CarName;
    int PlatNo;

    public Car(int noOfWheels, int noOfDoors, String carName, int platNo) {
        NoOfWheels = noOfWheels;
        NoOfDoors = noOfDoors;
        CarName = carName;
        PlatNo = platNo;
    }


    @Override
    public String toString() {
        return "Car{" +
                "NoOfWheels=" + NoOfWheels +
                ", NoOfDoors=" + NoOfDoors +
                ", CarName='" + CarName + '\'' +
                ", PlatNo=" + PlatNo +
                '}';
    }

    public static void main(String[] args) {
       Car c1 = new Car(4,4,"Maruti", 3432);
        System.out.println(c1);
    }
}
