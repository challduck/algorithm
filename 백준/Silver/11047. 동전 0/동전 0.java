import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[n - 1 - i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for(int num : arr) {
            if (k >= num){
                cnt += k / num;
                k = k % num;
            }
        }
        System.out.println(cnt);
    }
}