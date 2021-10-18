
/**
 * Write a description of class StudentP322 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentP322
{
    private String firstName;
    private String lastName;
    private double GPA;
    private int age;
    private int studentID;
    private static int nextStudentID;
    
    public StudentP322(String fN, String lN, double g, int a) {
        firstName = fN;
        lastName = lN;
        GPA = g;
        age = a;
        studentID = nextStudentID;
        nextStudentID++;
    }
    
    public StudentP322(String fN) {
        firstName = fN;
    }
    
    public StudentP322() {
        this("M", "W", 0.0, 3);
    }
    
    public void setGPA(double GPA) {
        if (GPA >= 0.0 && GPA <= 5.0) {
            this.GPA = GPA;
        }
    }
    
    public String toString() {
        return firstName + " " + lastName + " " + studentID + ": " + GPA;
    }
}
