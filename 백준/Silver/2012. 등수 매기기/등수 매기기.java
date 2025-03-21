import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int rank = Integer.parseInt(br.readLine());
            arr[i] = rank;
        }
        Arrays.sort(arr);
        long answer = 0;
        
        for (int i = 0; i < n; i++) {
            answer += Math.abs(arr[i] - (i + 1));
        }
        System.out.println(answer);
    }
}
