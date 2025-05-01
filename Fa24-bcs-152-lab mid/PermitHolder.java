public class PermitHolder extends Person {
    private static int counter = 1000;
    private int permitId;

    public PermitHolder(String name) {
        super(name);
        this.permitId = counter++;
    }

    public int getPermitId() {
        return permitId;
    }

    public String toString() {
        return "[Name: " + name + ", Permit ID: " + permitId + "]";
    }
}