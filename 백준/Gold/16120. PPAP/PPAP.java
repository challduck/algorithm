import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();

        for (char p : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == 'A') {
                if (p == 'P' && stack.size() >= 3) {
                    if (stack.get(stack.size() - 3) == 'P' &&
                            stack.get(stack.size() - 2) == 'P') {
                        stack.pop();
                        stack.pop();
                        stack.pop();
                    } else {
                        System.out.println("NP");
                        return;
                    }
                } else {
                    System.out.println("NP");
                    return;
                }
            }
            stack.push(p);
        }

        if (stack.size() == 1 && stack.peek() == 'P') {
            System.out.println("PPAP");
        } else {
            System.out.println("NP");
        }
    }
}
