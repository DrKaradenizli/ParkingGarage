import Parking.ParkingGarage;
import Vehicle.Car;
import Vehicle.Motorbike;
import Vehicle.Vehicle;
import java.util.ArrayList;

public class Main {

  public static ArrayList<Vehicle> vehicles = new ArrayList<>();

  public static void main(String[] args) {

    // change this for level
    int numberOfLevels = 5;
    int[] numberOfParkingSpots = new int[]{10, 20, 20, 30, 40};

    // declare parking garage
    ParkingGarage parkingGarage = new ParkingGarage(numberOfLevels, numberOfParkingSpots);

    // declare vehicles
    ParkingController parkingController = new ParkingController();

    Car c1 = new Car("ES-MN-611");
    Car c2 = new Car("ES-MN-611");
    Car c3 = new Car("S-LN-712");
    Motorbike m1 = new Motorbike("ES-MN-613");
    Motorbike m2 = new Motorbike("ES-MN-611");
    Motorbike m3 = new Motorbike("ES-MN-613");
    Motorbike m4 = new Motorbike("ES-MN-614");
    Motorbike m5 = new Motorbike("ES-MN-615");
    Motorbike m6 = new Motorbike("ES-MN-613");
    Motorbike m7 = new Motorbike("ES-MN-612");
    Motorbike m9 = new Motorbike("ES-MN-619");
    Motorbike m10 = new Motorbike("ES-MN-614");

    // do some operations on different parking levels
    parkingController.addIfUniquePlate(c1);
    parkingController.addIfUniquePlate(c2);
    parkingController.addIfUniquePlate(c3);
    parkingController.deleteVehicle(c1);
    parkingController.addIfUniquePlate(m1);
    parkingController.addIfUniquePlate(m2);
    parkingController.addIfUniquePlate(m3);
    parkingController.addIfUniquePlate(m4);
    parkingController.addIfUniquePlate(m5);
    parkingController.addIfUniquePlate(m6);
    parkingController.addIfUniquePlate(m7);
    parkingController.addIfUniquePlate(m9);
    parkingController.addIfUniquePlate(m10);

    parkingGarage.whereIsMyCar(c1.getLicensePlate());



    for (int i = 0; i < vehicles.size(); i++) {
     System.out.println(vehicles.get(i).getLicensePlate());
    }
  }

}
