class Person{
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person [Name = " + name + ", Age = " + age + "]";
    }
}
class Student extends Person {
    private final int studentId;
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);      // Calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Student [ID = " + studentId +
               ", GPA = " + gpa + "]";
    }
}
class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {

        super(name, age, studentId, gpa);   // Calls Student constructor
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", GradStudent [Thesis = " + thesis + "]";
    }
}
public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Sona",
                23,
                101,
                9.2,
                "Artificial Intelligence");

        System.out.println(gs);

        // Demonstrating IS-A relationship
        Student s = gs;   // GradStudent IS-A Student
        Person p = gs;    // GradStudent IS-A Person

        System.out.println("\nUsing Student reference:");
        System.out.println(s);

        System.out.println("\nUsing Person reference:");
        System.out.println(p);
    }
}
