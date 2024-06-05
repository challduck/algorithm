import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append("Case #" + (i + 1) + ": ");
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < str.length; j++) {
                stack.push(str[j]);
            }
            for (int j = 0; j < str.length; j++) {
                sb.append(stack.pop() + " ");
            }
            System.out.println(sb);
        }

    }    
    
}