public class Mystery
{
    private Mystery a;
    private Mystery b;
    private int c;
    
    public Mystery(Mystery a, Mystery b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int run() {
        return c;
    }
    
    public static void doSomething(Mystery z) {
        if (z == null) {
            return;
        }
        doSomething(z.a);
        System.out.println(z.run());
        doSomething(z.b);
    }    
}
