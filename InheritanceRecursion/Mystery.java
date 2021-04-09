
/**
 * Write a description of class Mystery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mystery
{
    public static void main(String[] args) {
        ExecutivePolitician e = new ExecutivePolitician("Executive");
        LegislativePolitician p = new LegislativePolitician("Legislative");
        
        e.blame(p);
    }
}
