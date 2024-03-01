package Week3;

public class Human extends LivingThings implements Living {

    public Human(int age, String name) {
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
        Human human = new Human(12, "David");
        System.out.println("My name is " + human.getName() + ", and I am " + human.getAge() + "years old.");
    }
}
