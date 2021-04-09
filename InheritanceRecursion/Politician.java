
/**
 * Write a description of class Politician here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Politician
{
    private String name;
    
    public Politician(String name) {
        this.name = name;
    }
    
    public void blame(Politician other) {
        System.out.println(name + " blames " + other);
        other.blame(this);
    }
    
    public String toString() {
        return name;
    }
}
