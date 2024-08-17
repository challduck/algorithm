import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while (!(str = br.readLine()).equals(".")) {
            sb.append(isBalanced(str) ? "yes" : "no").append("\n");
        }

        System.out.print(sb);
    }

    private static boolean isBalanced(String str) {
        stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty() || !isPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}