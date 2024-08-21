import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum = (sum * sum(i)) % 14579;
        }
        System.out.println(sum);
    }

    static int sum(int a) {
        int temp = 0;
        for (int i = 1; i <= a; i++) {
            temp += i;
        }
        return temp;
    }
}