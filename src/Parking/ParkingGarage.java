package Parking;

import Vehicle.Vehicle;

public class ParkingGarage {

  public ParkingLevel[] parkingLevels;

  /**
   * Specify the number of spots in an int[], where the first element is the number of spots for the
   * 0th floor (ground floor). Negative floors are not allowed.
   */
  public ParkingGarage(int numberOfParkingLevels, int[] numberOfParkingSpots) {

    // Fewer levels than specified spots
    if (numberOfParkingLevels < numberOfParkingSpots.length) {
      // TODO: Throw error
      System.out.println("You entered more parkingspots than level the Parking Garage has.");
    }

    this.parkingLevels = new ParkingLevel[numberOfParkingLevels];

    for (int i = 0; i < numberOfParkingSpots.length; i++) {

      this.parkingLevels[i] = new ParkingLevel(i, numberOfParkingSpots[i]);

    }
  }

  /*
  Returns number of empty spots in the whole Parking Garage
   */
  public int numberOfEmptyParkingSpotsGeneral() {

    int emptyParkingSpots = 0;

    for (int i = 0; i < this.parkingLevels.length; i++) {
      emptyParkingSpots += numberOfEmptyParkingSpotsInLevel(i);
    }

    return emptyParkingSpots;
  }

  /*
  Returns number of the empty spots in a given level
   */
  public int numberOfEmptyParkingSpotsInLevel(int parkingLevel) {

    int emptyParkingSpots = 0;

    ParkingLevel tempParkingLevel = this.parkingLevels[parkingLevel];

    for (int i = 0; i < tempParkingLevel.parkingSpots.length; i++) {

      if (!tempParkingLevel.parkingSpots[0].isOccupied) {
        emptyParkingSpots++;
      }
    }

    return emptyParkingSpots;
  }


  /**
   * Doesnt matter where I park, I just want to!
   */
  public void justParkMyVehicle(Vehicle vehicle) {
    // see if there are any empty parking lots
    if (numberOfEmptyParkingSpotsGeneral() > 0) {
      for (int i = 0; i < this.parkingLevels.length; i++) {
        for (int j = 0; j < this.parkingLevels[i].parkingSpots.length; j++) {
          ParkingSpot tempSpot = this.parkingLevels[i].parkingSpots[j];
          // any spot is free, so we park there
          if (!tempSpot.isOccupied) {
            tempSpot.setVehiclePlate(vehicle.getLicensePlate());
            tempSpot.setOccupied(true);
          }
        }
      }
    } else {
      System.out.println("There is no parking lot left, sorry.");
    }

  }

  /**
   * If you want to park in a specific level
   */
  public void justParkMyVehicle(Vehicle vehicle, int parkingLevel) {
    if (numberOfEmptyParkingSpotsInLevel(parkingLevel) > 0) {

      for (int i = 0; i < this.parkingLevels[parkingLevel].parkingSpots.length; i++) {
        ParkingSpot tempSpot = this.parkingLevels[parkingLevel].parkingSpots[i];
        // spot at desired parking spot is free
        if (!tempSpot.isOccupied) {
          tempSpot.setVehiclePlate(vehicle.getLicensePlate());
          tempSpot.setOccupied(true);
        }
      }
    } else {
      System.out.println("There is no parking lot left, sorry.");
    }

  }

  /**
   * If you want to park in a specific level and specific spot
   */
  public void justParkMyVehicle(Vehicle vehicle, int parkingLevel, int parkingSpot) {
    if (numberOfEmptyParkingSpotsInLevel(parkingLevel) > 0) {

      ParkingSpot tempSpot = this.parkingLevels[parkingLevel].parkingSpots[parkingSpot];

      // the one desired spot is free
      if (!tempSpot.isOccupied) {
        tempSpot.setVehiclePlate(vehicle.getLicensePlate());
        tempSpot.setOccupied(true);
      }else {
        System.out.println("There is no parking lot left, sorry.");
      }

    } else {
      System.out.println("There is no parking lot left, sorry.");
    }


  }

  public void whereIsMyCar(String vehiclePlate) {

    if (numberOfEmptyParkingSpotsGeneral() > 0) {
      for (int i = 0; i < this.parkingLevels.length; i++) {
        for (int j = 0; j < this.parkingLevels[i].parkingSpots.length; j++) {
          ParkingSpot tempSpot = this.parkingLevels[i].parkingSpots[j];
          // any spot is free, so we park there
          if (tempSpot.getVehiclePlate() == vehiclePlate) {
            System.out.println("Your car is parked at level " + tempSpot.returnParkingSpotId().getLevel() + " and spot " + tempSpot.returnParkingSpotId().getSpot());
          }
        }
      }
    } else {
      System.out.println("There is no parking lot left, sorry.");
    }
  }
}