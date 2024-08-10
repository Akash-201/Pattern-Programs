package String;

import java.util.Stack;

interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop()
    {
        System.out.println("Stopping the vehicle.");
    }

    // Static method
    static void horn() {
        System.out.println("Beep beep!");
    }
}

// Implementing class
class Car implements Vehicle {
    // Implementing abstract method
    public void start() {
        System.out.println("Starting the car.");
    }

  
}

public class InterfaceProgram {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.start();  // Calls start() method of Car
        car.stop();   // Calls overridden stop() method of Car
        Vehicle.horn();  // Calls static method horn() of Vehicle interface
    }
}

