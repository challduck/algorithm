import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int min = Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));

        int[] arr = {a,b,c,d,e};

        for (int i = min; i < 1000000; i++) {
            int cnt = 0;
            for (int k : arr) {
                if (i % k == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3){
                System.out.println(i);
                break;
            }
        }
    }
}