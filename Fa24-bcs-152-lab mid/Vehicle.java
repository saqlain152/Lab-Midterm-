public class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;

    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Owner getOwner() {
        return owner;
    }

    public Vehicle shallowCopy() {
        return new Vehicle(this.licensePlate, this.type, this.owner);
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(this.owner.name);
        return new Vehicle(this.licensePlate, this.type, newOwner);
    }

    public String toString() {
        return "[License Plate: " + licensePlate + ", Type: " + type + ", Owner: [" + owner + "]]";
    }
}