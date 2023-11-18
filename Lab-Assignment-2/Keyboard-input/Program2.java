import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a distance in km=");
        int distance = sc.nextInt();
        int meter = distance * 1000;
        double feet = distance * 3280.8399;
        double inch = distance * 39370.0787;
        int centimetre = distance * 100000;
System.out.println(distance+" km is "+meter+" meters");
System.out.println(distance+" km is "+feet+" feet");
System.out.println(distance+" km is "+inch+" inches");
System.out.println(distance+" km is "+centimetre+" centimetres");
sc.close();
    }
}
