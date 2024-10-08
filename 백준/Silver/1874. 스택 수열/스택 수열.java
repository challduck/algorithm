import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int temp = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (temp <= num) {
                stack.push(temp);
                sb.append("+").append("\n");
                temp++;
            }

            if (stack.peek() == num) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb);
    }
}