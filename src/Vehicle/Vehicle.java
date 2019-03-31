package Vehicle;

import Parking.ParkingSpot;

public abstract class Vehicle {


  public String licensePlate;
  public ParkingSpot parkingSpot;

  public Vehicle(){

  }

  public void assignParkingPosition() {
  }


  public abstract String getLicensePlate();
}
