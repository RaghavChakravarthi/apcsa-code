
/**
 * Write a description of class P322Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P322Runner
{
    public static void main(String[] args) {
        StudentP322 neal = new StudentP322("N", "M", 5.0, 15);
        StudentP322 joseph = new StudentP322();
        
        System.out.println(neal);
        neal.setGPA(-1.0);
        System.out.println(neal);
        neal.setGPA(4.9);
        System.out.println(neal);
        System.out.println(joseph);
    }
}
