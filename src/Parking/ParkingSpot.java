package Parking;

public class ParkingSpot {

  public boolean isOccupied;
  public int spotID;
  public String vehiclePlate;
  public int parkingLevel;


  public ParkingSpot(int parkingLevel, int spotID){
    this.parkingLevel = parkingLevel;
    this.isOccupied = false;
    this.spotID = spotID;
  }

  public String getVehiclePlate(){
    if(this.isOccupied){
      return this.vehiclePlate;
    }

    return "";

  }
  public void setVehiclePlate(String vehiclePlate) {
    this.vehiclePlate = vehiclePlate;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }

  public ParkingSpotID returnParkingSpotId(){
    return new ParkingSpotID(this.parkingLevel, this.spotID);
  }

}