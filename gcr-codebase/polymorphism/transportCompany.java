class Vehicle {

    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 2;
    }
}

public class transportCompany {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 10;

        for (Vehicle v : vehicles) {

            if (v instanceof Car) {
                Car car = (Car) v;
                System.out.println("Car Fuel Cost: " + car.fuelCost(km));

            } else if (v instanceof Bus) {
                Bus bus = (Bus) v;
                System.out.println("Bus Fuel Cost: " + bus.fuelCost(km));

            } else if (v instanceof Bike) {
                Bike bike = (Bike) v;
                System.out.println("Bike Fuel Cost: " + bike.fuelCost(km));

            } else if (v instanceof ElectricCar) {
                ElectricCar eCar = (ElectricCar) v;
                System.out.println("Electric Car Fuel Cost: " + eCar.fuelCost(km));
            }
        }
    }
}