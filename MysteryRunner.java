public class MysteryRunner
{
    public static void main(String[] args) {
        Mystery c = new Mystery(null, null, 0);
        Mystery d = new Mystery(null, null, 2);
        Mystery b = new Mystery(c, d, 1);
        Mystery e = new Mystery(null, null, 4);
        Mystery a = new Mystery(b, e, 3);
        
        Mystery.doSomething(a);
    }
}
