package Week3;

public class Animals extends Organism {
    static int numberOfInstances;
    private int numberOfLegs;

    public Animals(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
        numberOfInstances++;
    }

    public Animals(String name) {
        super(name);
        numberOfInstances++;
    }

    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    void speak() {
        System.out.println("I can speak.");
    }

}
