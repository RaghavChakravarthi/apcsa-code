public class Mystery
{
    private Mystery x;
    private Mystery y;
    private int z;
    
    public Mystery(Mystery x, Mystery y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int run() {
        return z;
    }
    
    public static void doSomething(Mystery m) {
        if (m == null) {
            return;
        }
        doSomething(m.x);
        System.out.println(m.run());
        doSomething(m.y);
    }    
}
