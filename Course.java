import java.util.ArrayList;
import java.util.List;
class Course {
    private String departmentName;
    private String title;
    private int courseNumber;
    private int credits;
    private List<Student> enrolledStudents;
    private ArrayList<Student> waitListedStudents;


    //Constructs a new CourseE object with the specified title and credits
    public Course(String title, int credits) {
        this.title = title; // Initialize course title
        this.credits = credits; // Initialize credits
        this.enrolledStudents = new ArrayList<>(); // Initialize list of students
        this.departmentName = departmentName;
        this.courseNumber = courseNumber;
        this.waitListedStudents = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        boolean alreadyEnrolled = false;
        for (Student enrolledStudent : enrolledStudents) {
            if (enrolledStudent.equals(student)) {
                alreadyEnrolled = true;
            }
        }
        if (!alreadyEnrolled) { // Check if student is not already enrolled
            enrolledStudents.add(student); // Add the student to the list
        }
    }

    // Removes the specified student from the list of enrolled students.
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    // Returns a string representation of the course including its title, credits, and enrolled students.
    public String toString() {
        String result = "Course title: '" + title + "', credits: " + credits + "\n"; // Course information
        result += "Enrolled Students:\n"; // Header for enrolled students
        for (Student student : enrolledStudents) {
            result += student.toString() + "\n"; // Append each student's information
        }
        return result; // Return the complete course details
    }
}// End of Course