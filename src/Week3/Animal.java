package Week3;

public class Animal extends LivingThings implements Living {
    public Animal(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("I am alive and can eat.");
    }

    @Override
    public void move() {
        System.out.println("I am alive and can move.");
    }

    @Override
    public void speak() {
        System.out.println("I am alive and can speak.");
    }

    @Override
    public void sleep() {
        System.out.println("I am a alive and can sleep.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal(12, "Doge");
        System.out.println("I am a dog named " + animal.getName() + ", and I am " + animal.getAge() + "years old.");
    }
}
