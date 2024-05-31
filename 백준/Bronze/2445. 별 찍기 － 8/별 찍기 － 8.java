import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2 * sc.nextInt() - 1;

        for (int i = 1; i <= a; i++) {
            if ((a / 2) >= i - 1) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= a - i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 0; j <= a - i; j++) {
                    System.out.print("*");
                }
                for (int j = a - i; j < i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= a - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}