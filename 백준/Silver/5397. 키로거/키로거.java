import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String inputCommand = br.readLine();
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            for (int j = 0; j < inputCommand.length(); j++) {
                char ch = inputCommand.charAt(j);
                if (ch == '<') {
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                } else if (ch == '>') {
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                } else if (ch == '-') {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(ch);
                }
            }
            StringBuilder leftSb = new StringBuilder();
            while (!leftStack.isEmpty()) {
                leftSb.append(leftStack.pop());
            }
            StringBuilder rightSb = new StringBuilder();
            while (!rightStack.isEmpty()) {
                rightSb.append(rightStack.pop());
            }
            sb.append(leftSb.reverse().toString()).append(rightSb.toString()).append("\n");
        }
        System.out.print(sb.toString());
    }
}