public class Program8 {
    public static void main(String args[]) {
        int x=5,y=6;
        System.out.println("Before swapping");
        System.out.println("x is= "+x+" and y is= "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping");
        System.out.println("x is= "+x+" and y is= "+y);
    }
}
