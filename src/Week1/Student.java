package Week1;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return o.getAge() - this.getAge(); //24 - 22 = 2
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Adebola Jegede", 22, "Male", "Java");
        Student student2 = new Student("Donatus Nwigwe", 24, "Female", "Go");
        Student student3 = new Student("Romanus Nwigwe", 39, "Male", "Python");

//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(Student.getNumberOfStudents());

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3 );

        studentList.stream()
                    .sorted() //calls compareTo within Student //+ve number returned //24, 39, 22
                    .forEach(System.out::println);

        //collects all 'elements' and stores them in a buffer
        // sorts and returns the sorted elements
        //RunnableDemo::run
    }
}