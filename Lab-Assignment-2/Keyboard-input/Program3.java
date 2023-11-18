import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary:");
        int salary=sc.nextInt();
        double DA=(40.0/100)*salary;
        double HRA=(20.0/100)*salary;
        int gross=salary+(int)DA+(int)HRA;
        System.out.println("DA is "+DA);
        System.out.println("HRA is "+HRA);
        System.out.println("Gross salary is "+gross);
        sc.close();
    }
}
