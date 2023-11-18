import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        double seconds=sc.nextDouble();
        double distance=(1.0/2)*32.174*seconds*seconds;
        System.out.println("Distance travelled: "+distance);
        sc.close();
    }
}
