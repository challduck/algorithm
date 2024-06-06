import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(arr1[i]));
        }
        int m = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            System.out.println(set.contains(Integer.parseInt(arr2[i])) ? 1 : 0);
        }
    }
}