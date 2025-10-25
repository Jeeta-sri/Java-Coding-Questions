class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    // Overriding the run() method of parent class
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Vehicle v = new Bike();  // Upcasting
        v.run();                 // Calls the overridden method in Bike
    }
}

//Bike inherits from Vehicle.

//It overrides the run() method with its own version.

//When we call v.run(), the child class method executes, even though v is a Vehicle reference.

//This demonstrates runtime polymorphism (decision made at runtime).
    

