import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] flags = new boolean[1000001];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            if (!flags[num1] && !flags[num2] && !flags[num3]) {
                answer++;
            }

            flags[num1] = true;
            flags[num2] = true;
            flags[num3] = true;
        }
        System.out.println(answer);
    }
}