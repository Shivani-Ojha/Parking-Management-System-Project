package projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Vehicle {
    String licensePlate;
    String location;

    public Vehicle(String licensePlate, String location) {
        this.licensePlate = licensePlate;
        this.location = location;
    }
}

public class ParkingManagementSystem {
    
    private Map<String, Vehicle> vehicles;
    private Scanner scanner;

    public ParkingManagementSystem() {
        this.vehicles = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void parkVehicle() {
        System.out.println("Enter license plate: ");
        String var1 = this.scanner.nextLine();
        System.out.println("Enter location (e.g., A1, B2, etc.): ");
        String var2 = this.scanner.nextLine();
        this.vehicles.put(var1, new Vehicle(var1, var2));
        System.out.println("Vehicle parked successfully!");
    }

    public void locateVehicle() {
        System.out.println("Enter license plate: ");
        String var1 = this.scanner.nextLine();
        if (this.vehicles.containsKey(var1)) {
            Vehicle var2 = (Vehicle)this.vehicles.get(var1);
            System.out.println("Vehicle located at: " + var2.location);
        } else {
            System.out.println("Vehicle not found!");
        }

    }

    public void run() {
        while(true) {
            System.out.println("1. Park Vehicle");
            System.out.println("2. Locate Vehicle");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int var1 = Integer.parseInt(this.scanner.nextLine());
            switch (var1) {
                case 1:
                this.parkVehicle();
                break;
                case 2:
                this.locateVehicle();
                break;
                case 3:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid option!");
            }
        }
   }

    public static void main(String[] var0) {
        ParkingManagementSystem var1 = new ParkingManagementSystem();
        var1.run();
    }
}

