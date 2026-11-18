package creationalDesignPatterns.factoryDesignPattern;

public final class VehicleFactory {

    private VehicleFactory() {
        // Prevent instantiation
    }

    public static Vehicle createVehicle(VehicleType type) {

        return switch (type) {

            case CAR -> new Car();

            case BIKE -> new Bike();

        };
    }
}