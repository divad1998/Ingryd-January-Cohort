package Week1;

public class GraduateStudents extends Student {
    private String thesis;
    private String supervisorName;

    public GraduateStudents(String name, int age, String gender, String studentClass, String thesis, String supervisorName) {
        super(name, age, gender, studentClass);
        this.thesis = thesis;
        this.supervisorName = supervisorName;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public static void main(String[] args) {
        GraduateStudents graduateStudents = (GraduateStudents) (new Student("Man", 32, "Male", "Beginners")); //explicit type-casting essential for parent to child
        Student student = new GraduateStudents("Man", 32, "Male", "Beginners", "", ""); //implicit type casting from child to parent
    }
}
