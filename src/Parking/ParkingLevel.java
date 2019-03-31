package Parking;

public class ParkingLevel {

  // number for level, starts with 0
  public int parkingLevel = 0;

  // the Parking spots on this level
  public ParkingSpot[] parkingSpots;

  public int numberOfParkingSpots;

  public ParkingLevel(int parkingLevel, int numberOfParkingSpots){

    this.parkingLevel = parkingLevel;
    this.parkingSpots = new ParkingSpot[numberOfParkingSpots];
    this.numberOfParkingSpots = numberOfParkingSpots;

    for(int i = 0; i < this.parkingSpots.length; i++){
      this.parkingSpots[i] = new ParkingSpot(this.parkingLevel, i);
    }
  }

  public void occupySpot(){

  }



}