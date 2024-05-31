import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a != b && b != c && a != c) {
            int max = a;
            if (b > max)
                max = b;
            if (c > max)
                max = c;
            System.out.println(max * 100);
        } else {
            int value = 0;
            if (a == b) {
                value = a;
            } else if (a == c) {
                value = a;
            } else if (b == c) {
                value = b;
            }
            System.out.println(1000 + (value * 100));
        }

    }
}