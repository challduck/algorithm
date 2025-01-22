import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        int ans = 0;
        int length = 0;

        for (int i = 0; i < n; i++) {
            int d = arr[i][0];
            int v = arr[i][1];
            length -= v;
            if (length < 0) {
                ans -= length;
                length = 0;
            }
            length += d;
        }

        System.out.println(ans);

    }
}
