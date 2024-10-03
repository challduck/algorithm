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
        solved(a, b, c);
        
    }

    private static void solved(int a, int b , int c) {
        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
            return;
        }
        if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
            return;
        }
        if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
            return;
        }
        if (b != 0 && a / b == c) {
            System.out.println(a + "/" + b + "=" + c);
            return;
        }

        if (a == b + c) {
            System.out.println(a + "=" + b + "+" + c);
            return;
        }
        if (a == b - c) {
            System.out.println(a + "=" + b + "-" + c);
            return;
        }
        if (a == b * c) {
            System.out.println(a + "=" + b + "*" + c);
            return;
        }
        if (b != 0 && a == b / c) {
            System.out.println(a + "=" + b + "/" + c);
            return;
        }

        if (b + c == a) {
            System.out.println(b + "+" + c + "=" + a);
            return;
        }
        if (b - c == a) {
            System.out.println(b + "-" + c + "=" + a);
            return;
        }
        if (b * c == a) {
            System.out.println(b + "*" + c + "=" + a);
            return;
        }
        if (c != 0 && b / c == a) {
            System.out.println(b + "/" + c + "=" + a);
            return;
        }
    }
}