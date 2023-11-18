import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere:");
        double radius=sc.nextDouble();
        double surface_area=3*(Math.PI)*radius*radius;
        double volume_area=(2.0/3)*(Math.PI)*radius*radius*radius;
        System.out.println("The surface area of the hemisphere is "+surface_area);
        System.out.println("The volume area of the hemisphere is "+volume_area);
        sc.close();

    }
}
