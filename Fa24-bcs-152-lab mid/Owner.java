public class Owner extends Person {
    private static int counter = 1;
    private String ownerId;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("O%03d", counter++);
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String toString() {
        return super.toString() + ", Owner ID: " + ownerId;
    }
}
