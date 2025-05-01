public class Supervisor extends Person {
    private int experience;

    public Supervisor(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    public String toString() {
        return "Supervisor: " + super.toString() + ", Experience: " + experience + " years";
    }
}