import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int cnt = 1;

        while (a != b){
            if (a > b) {
                cnt = -1;
                break;
            }

            if (b % 10 == 1){
                b /= 10;
                cnt++;
            } else if (b % 2 == 0) {
                b /= 2;
                cnt++;
            } else {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}