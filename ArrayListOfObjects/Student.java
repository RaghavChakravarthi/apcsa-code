
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int height;
    private int weight;
    private boolean isAthlete;

    /**
     * Constructor for objects of class Student
     */
    public Student(int h, int w, boolean athlete)
    {
        height = h;
        weight = w;
        isAthlete = athlete;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public boolean getAthlete() {
        return isAthlete;
    }
    
    public String toString() {
        return height + " " + weight + " " + isAthlete;
    }
}
