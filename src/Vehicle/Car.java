package Vehicle;
import Parking.ParkingSpot;

public class Car extends Vehicle{

  public String licensePlate;
  public ParkingSpot parkingSpot;

  public Car(String licensePlate){
   this.licensePlate = licensePlate;
  }

  @Override
  public void assignParkingPosition() {

  }

  @Override
  public String getLicensePlate() {
    return this.licensePlate;
  }

}