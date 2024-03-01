package Week3;

public class Plant extends Organism {
    static int numberOfInstances;
    private double length;
    public Plant(String name, double length) {
        super(name);
        this.length = length;
        numberOfInstances++;
    }

    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    void sleep() {
        System.out.println("I can sleep.");
    }
}
