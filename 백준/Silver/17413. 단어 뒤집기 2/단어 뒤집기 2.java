import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                while (true) {
                    if (str.charAt(i) == '>') {
                        sb.append(str.charAt(i));
                        break;
                    }

                    sb.append(str.charAt(i));
                    i++;
                }
                continue;
            }
            if (str.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            } else {
                stack.add(str.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}