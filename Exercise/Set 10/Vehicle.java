package Homework.Set10;

/*
Chloe Antonozzi
1670980

17/10/2021
*/

class Vehicle {

    int registrationNumber; 
    int weight;

    public Vehicle(int registrationNumber, int weight) {
      this.registrationNumber = registrationNumber;
      this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle with reg.nr. : " + registrationNumber + "\nWeight: " + weight;
    }
    
  }
  
  class Car extends Vehicle {

    private String vehicleType;
    private String fuelType;
  
    public Car(int registrationNumber,int weight, String vehicleType, String fuelType) {
      super(registrationNumber, weight);
      this.vehicleType = vehicleType;
      this.fuelType = fuelType;
    }
  
    public String toString() {
        return super.toString() + "\nVehicle Type: " + vehicleType + "\nFuel Type: " + fuelType;
    }
  }

  class Motorcycle extends Vehicle {

    private String hasSidecar;
    private String vehicleType;

    public Motorcycle(int registrationNumber, int weight, String vehicleType, String hasSidecar) {
      super(registrationNumber, weight);
      this.vehicleType = vehicleType;
      this.hasSidecar = hasSidecar;
    }
  
    public String toString() {
        return super.toString() + "\nVehicle Type: " + vehicleType + "\nSidecar: " + hasSidecar;
    }
  }

  class Truck extends Vehicle {

    private String vehicleType;

    public Truck(int registrationNumber, int weight, String vehicleType) {
      super(registrationNumber, weight);
      this.vehicleType = vehicleType;
    }
  
    public String toString() {
        return super.toString() + "\nVehicle Type: " + vehicleType;
    }
  }