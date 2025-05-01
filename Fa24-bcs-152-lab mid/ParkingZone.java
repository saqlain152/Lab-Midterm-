public class ParkingZone {
    private static int zoneCounter = 1;
    private String zoneId;
    private Vehicle[] vehicles = new Vehicle[5];
    private int vehicleCount = 0;

    public ParkingZone() {
        this.zoneId = "Z" + zoneCounter++;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void addVehicle(Vehicle v) {
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getLicensePlate().equals(v.getLicensePlate())) {
                System.out.println("Error: duplicate license plate '" + v.getLicensePlate() + "' is not allowed.");
                return;
            }
        }
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount++] = v;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Zone ID: " + zoneId + ", Vehicles: ");
        for (int i = 0; i < 5; i++) {
            sb.append(i < vehicleCount ? vehicles[i] : "null");
            if (i < 4) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}