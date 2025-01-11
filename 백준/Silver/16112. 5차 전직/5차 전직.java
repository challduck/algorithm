import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 1; i < n; i++) {
            BigInteger temp = BigInteger.valueOf(0);
            if (i > k) {
                temp = temp.add(BigInteger.valueOf((long) (arr[i])).multiply(BigInteger.valueOf((long) k)));
            } else {
                temp = temp.add(BigInteger.valueOf((long) (arr[i])).multiply(BigInteger.valueOf((long) i)));
            }
            sum = sum.add(temp);
        }

        System.out.println(sum.toString());

    }
}