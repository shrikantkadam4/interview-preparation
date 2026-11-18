package creationalDesignPatterns.factoryDesignPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Vehicle car =
                VehicleFactory.createVehicle(VehicleType.CAR);

        Vehicle bike =
                VehicleFactory.createVehicle(VehicleType.BIKE);

        car.drive();
        bike.drive();
    }
}