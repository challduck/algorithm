import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int max = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int stack_value = stack.pop();
            if (stack_value > max) {
                max = stack_value;
                cnt++;
            }
        }
        System.out.println(cnt);

    }    
}