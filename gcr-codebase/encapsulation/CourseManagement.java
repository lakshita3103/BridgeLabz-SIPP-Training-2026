class Course{
    private String courseName;
    private int duration;
    private double fee;

    static String instituteName = "ABC Training Institute";

    Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails(){
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println();
    }

    static void updateInstitueName(String newName){
        instituteName = newName;
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Python Programming", 4, 12000);
        Course c3 = new Course("Web Development", 5, 18000);

        System.out.println("----- Before Updating Institute Name -----");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstitueName("XYZ Skill Academy");

        System.out.println("----- After Updating Institute Name -----");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
