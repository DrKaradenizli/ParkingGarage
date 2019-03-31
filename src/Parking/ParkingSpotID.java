package Parking;

public class ParkingSpotID {

  public int level;
  public int spot;

  public ParkingSpotID(int parkingLevel, int spotID) {
    this.level = parkingLevel;
    this.spot = spotID;
  }

  public int getLevel() {
    return level;
  }

  public int getSpot() {
    return spot;
  }
}