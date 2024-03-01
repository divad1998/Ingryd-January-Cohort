package Week3;

public abstract class LivingThings {
    private int age;
    private String name;

    public LivingThings(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void speak();
    public abstract void sleep();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
