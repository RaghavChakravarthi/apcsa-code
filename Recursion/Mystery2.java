
/**
 * Write a description of class Mystery2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mystery2
{
    public static boolean mystery(int n) {
        return n > 3 && !mystery(n - 3);
        // return !mystery(n - 3) && n > 3;
    }

    public static void main(String[] args) {
        System.out.println(mystery(10));
        // System.out.println(mystery(50));
        // printStars(3);
    }

    public static void printStars(int n) {
        if (n == 1) {
            // base case; just print one star
            System.out.println("*");
        } else {
            // recursive case; print one more star
            printStars(n - 1);
            System.out.print("*");
        }
    }

}
