import Vehicle.Vehicle;

public class ParkingController {


  public void addIfUniquePlate(Vehicle vehicle) {

  //  System.out.println(Main.vehicles.size());
    if (Main.vehicles.size() == 0) {
      Main.vehicles.add(vehicle);
    } else {
      for (int i = 0; i < Main.vehicles.size(); i++) {
      // System.out.println(Main.vehicles.get(i).getLicensePlate());
        if (Main.vehicles.get(i).getLicensePlate() == vehicle.getLicensePlate()) {
          System.out.println(
              "You can't add this vehicle. There is already a vehicle with that license plate "
                  + vehicle.getLicensePlate());
          break;
         // System.out.println(vehicle.getLicensePlate());
        } else {
          Main.vehicles.add(vehicle);


        }
      }
    }
  }

  public void deleteVehicle(Vehicle vehicle){
    for (int i = 0; i < Main.vehicles.size(); i++) {

      if (Main.vehicles.get(i).getLicensePlate() != vehicle.getLicensePlate()) {
        Main.vehicles.remove(vehicle);
        // System.out.println(vehicle.getLicensePlate());
      } else {
        System.out.println(
            "Couldnt find license plate "
                + vehicle.getLicensePlate());

      }
    }
  }
}