package com.bootcampexercise.module10;

public class InterfaceActivityClass {
    /**
     * @author Markuss
     * @purpose The classes Car and Bike implement the defined `start`, `stop` methods of the Vehicle interface
     * @output The car's engine has started
     * The bike is starting to roll
     * The car's engine stopped
     * The bike stopped rolling
     *
     * Process finished with exit code 0
     */
    static void main() {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();

        car.stop();
        bike.stop();
    }
}
