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
    
    public static void traverse(Mystery z) {
        if (z == null) {
            return;
        }
        
        traverse(z.a);
        System.out.println(z.run());
        traverse(z.b);
    }
        
}
