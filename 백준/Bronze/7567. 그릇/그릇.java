import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dish = br.readLine();
        char before = '0';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < dish.length(); i++) {
            stack.push(dish.charAt(i));
        }
        int sum = 10;
        before = stack.peek();
        stack.pop();
        for (int i = 1; i < dish.length(); i++) {
            if (stack.peek().equals(before)) {
                sum += 5;
            } else {
                sum += 10;
            }
            before = stack.pop();
        }
        System.out.println(sum);
    }    
}
