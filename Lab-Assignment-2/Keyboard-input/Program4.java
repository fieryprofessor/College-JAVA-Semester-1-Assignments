import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int num=sc.nextInt();
        int d1=num%10;
        int d2=(num/10)%10;
        int d3=num/100;
        int sum=d1+d2+d3;
        System.out.print("The sum of the digits is "+sum);
        sc.close();
    }
}
