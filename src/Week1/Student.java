package Week1;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String studentClass;
    private static int numberOfStudents;

    public Student(String name, int age, String gender, String studentClass) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentClass = studentClass;
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String toString() {
        return "Student name: " + getName() + ", " + "Age: " + getAge() + ", " + "Gender: " + getGender() + ", " + "Student Class: " + getStudentClass() + ".";
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("David Dinneya", 22, "Male", "Java");
        Student student2 = new Student("Enesi George", 24, "Female", "Java");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(Student.getNumberOfStudents());
    }


}