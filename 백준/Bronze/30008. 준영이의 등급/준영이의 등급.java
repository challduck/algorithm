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
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            sb.append(solution(n, Integer.parseInt(st.nextToken()))).append(" ");
        }
        System.out.print(sb.toString());
    }

    private static int solution(int n, int a) {
        int result = 0;

        int num = (a * 100) / n;
        if (num < 5) {
            result = 1;
        } else if (num < 12) {
            result = 2;
        } else if (num < 24) {
            result = 3;
        } else if (num < 41) {
            result = 4;
        } else if (num < 61) {
            result = 5;
        } else if (num < 78) {
            result = 6;
        } else if (num < 90) {
            result = 7;
        } else if (num < 97) {
            result = 8;
        } else {
            result = 9;
        }

        return result;
    }
}
