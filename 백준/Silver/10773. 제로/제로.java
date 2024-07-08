import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String num_str = br.readLine();

            if (num_str.equals("0")) {
                int a = stack.pop();
                sum -= a;
            } else {
                sum += Integer.parseInt(num_str);
                stack.push(Integer.parseInt(num_str));
            }
        }
        System.out.println(sum);
    }
}