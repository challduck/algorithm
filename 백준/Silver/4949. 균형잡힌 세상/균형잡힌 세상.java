import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '[') {
                    stack.add(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    } else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }

            if (stack.isEmpty() && flag) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
