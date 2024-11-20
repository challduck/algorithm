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
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (str.charAt(i) == '>') {
                flag = false;
                queue.add(str.charAt(i));
                while (!queue.isEmpty()) {
                    sb.append(queue.poll());
                }
                continue;
            }

            if (flag) {
                queue.add(str.charAt(i));
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
