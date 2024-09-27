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
        int f = Integer.parseInt(st.nextToken());
        // x y => 2
        for (int i = -999; i <= 999; i++) { // x
            for (int j = -999; j <= 999; j++) { // y
                if (a * i + b * j == c && d * i + e * j == f) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}