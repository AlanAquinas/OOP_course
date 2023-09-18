package lab.lab_1;

import lab.lab_1.Car.CarType;

public class testCar {

	public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, CarType.SEDAN);
        car1.accelerate();
        car1.displayInfo();

        Car car2 = new Car();
        car2.setMake("Ford");
        car2.setModel("Mustang");
        car2.setType(CarType.SPORTS);
        car2.accelerate(50);
        car2.displayInfo();
    }

}
