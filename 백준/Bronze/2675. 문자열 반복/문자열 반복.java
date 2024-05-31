import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String c = sc.next();
            for (int j = 0; j < c.length(); j++) {
                for (int j2 = 0; j2 < b; j2++) {
                    System.out.print(c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}