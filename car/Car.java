package car;
public class Car {  
    String brand;
    String model;
    int year;
    double speed;

// Methods
    void accelerate() {
        speed += 10.0;
        System.out.println(brand + " accelerating. Current speed: " + speed + " km/h");
    }
    
    void brake() {
        speed = Math.max(0, speed - 15.0);
        System.out.println(brand + " braking. Current speed: " + speed + " km/h");
    }

    public void displayInfo(){
        System.out.println("Car Brand is: "+ brand + "\nModel: "+ model);
        System.out.println("Car speed is :" + speed +" k/h");
        System.out.println("Launched Year is :" + year);

    }
//constractor
    Car(String brand, String model, int year, double speed){
        this.brand = brand;
        this.model = model;
        this.year = year; 
        this.speed = speed;
    }
    
}

