package car;
public class Main {
    public static void main(String arg[]){
        Car car1 = new Car("Tesla", "v3", 2023, 160);
        Car car2 = new Car("BMW", "v4", 2024, 160);

        System.out.println("Car 1: ");
        car1.brake();
        car1.accelerate();
        car1.displayInfo();
        
        System.out.println("Car 2: ");
        car2.brake();
        car2.displayInfo();
    }
}
