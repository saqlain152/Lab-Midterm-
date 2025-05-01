public class ParkingSystem {
    private static ParkingSystem instance = null;
    private String campus;
    private Supervisor supervisor;
    private ParkingZone[] zones = new ParkingZone[2];
    private PermitHolder[] permitHolders = new PermitHolder[2];
    private int zoneCount = 0, permitCount = 0;

    private ParkingSystem(String campus, Supervisor supervisor) {
        this.campus = campus;
        this.supervisor = supervisor;
    }

    public static ParkingSystem getInstance(String campus, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(campus, supervisor);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone zone) {
        if (zoneCount < zones.length) {
            zones[zoneCount++] = zone;
        }
    }

    public void addPermitHolder(PermitHolder p) {
        if (permitCount < permitHolders.length) {
            permitHolders[permitCount++] = p;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus: " + campus + "\n");
        sb.append(supervisor + "\n");
        sb.append("Zones: ");
        for (int i = 0; i < zoneCount; i++) {
            sb.append(zones[i]);
            if (i < zoneCount - 1) sb.append(", ");
        }
        sb.append("\nPermit Holders: ");
        for (int i = 0; i < permitCount; i++) {
            sb.append(permitHolders[i]);
            if (i < permitCount - 1) sb.append(", ");
        }
        return sb.toString();
    }
}