import java.util.*;
public class Program1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a degree in Fahrenheit:");
double f=sc.nextDouble();
double c=(5.0/9)*(f-32);
System.out.println(f+" Fahrenheit is "+c+" Celcius");
sc.close();
}
}