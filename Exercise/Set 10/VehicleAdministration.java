package Homework.Set10;

/*
Chloe Antonozzi
1670980

17/10/2021
Main Vehcile class
*/

class VehicleAdministration {
    Vehicle[] vehicles;
    Car car1 = new Car(654321, 500, "Car", "Petrol");
    Motorcycle motorcycle1 = new Motorcycle(123456, 300,"Motorcycle", "No");
    Truck truck1 = new Truck(4352, 1000, "Truck");

    void administrate() {
        vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = motorcycle1;
        vehicles[2] = truck1;

        printVehicles();
    }

    void printVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println("-------------------------------");
            System.out.println(v);
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        VehicleAdministration va = new VehicleAdministration();
        va.administrate();
    }
}