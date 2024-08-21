import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        String target = br.readLine();

        for (char ch : str.toCharArray()) {
            stack.push(ch);

            if (stack.size() >= target.length()) {
                boolean match = true;
                for (int i = 0; i < target.length(); i++) {
                    if (stack.get(stack.size() - i - 1) != target.charAt(target.length() - 1 - i)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    for (int i = 0; i < target.length(); i++) {
                        stack.pop();
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            for (Character character : stack) {
                sb.append(character);
            }
            System.out.println(sb);
        } else {
            System.out.println("FRULA");
        }
    }
}