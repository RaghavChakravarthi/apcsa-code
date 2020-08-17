
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    public static String groupChars(String s) {
        if (s.length() == 0) {
            return "*";
        } else if (s.length() < 3) {
            return "[" + s + "]";
        } else {
            int last = s.length() - 1;
            return "(" + s.charAt(0) + groupChars(s.substring(1, last)) + s.charAt(last) + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println(groupChars("-..-"));
    }
}
