package advancedConcepts.projects.parkingLot.model;


import advancedConcepts.projects.parkingLot.model.constants.ParkingSpotStatus;
import advancedConcepts.projects.parkingLot.model.constants.ParkingSpotType;
import advancedConcepts.projects.parkingLot.model.constants.VehicleType;

public class ParkingSpot extends BaseModel {
    private int number;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;

    public ParkingSpot(int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, ParkingSpotType parkingSpotType, Vehicle vehicle) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
