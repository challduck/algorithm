import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            System.out.println(set.contains(num) ? 1 : 0);
        }
    }
}