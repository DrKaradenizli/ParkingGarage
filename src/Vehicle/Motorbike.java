package Vehicle;

import Parking.ParkingSpot;

public class Motorbike extends Vehicle{


  private String parkingPosition;
  private String licensePlate;
  private ParkingSpot parkingSpot;

  public Motorbike(String licensePlate) {
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