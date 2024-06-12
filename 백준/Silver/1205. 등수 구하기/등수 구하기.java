import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int taesu_score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        if (n == 0) {
            System.out.println(1);
            return;
        }
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int taesu_rank = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > taesu_score) {
                taesu_rank++;
            } else if (arr[i] == taesu_score) {
                break;
            } else {
                break;
            }
        }
        
        if (n == p && arr[n - 1]>= taesu_score) {
            System.out.println(-1);
        } else {
            System.out.println(taesu_rank);
        }
    }
}