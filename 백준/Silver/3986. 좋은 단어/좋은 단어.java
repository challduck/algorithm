import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            if (str.length() % 2 != 0) {
                continue;
            }
            
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}