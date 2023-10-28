import java.util.*;

class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of lines");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 43; j++) {
                if (i == 1 || i == n) {
                    System.out.print("#");
                } else if (j == 1 || j == 2 || j == 42 || j == 43) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}