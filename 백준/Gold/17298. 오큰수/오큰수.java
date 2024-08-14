import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] OKeunSu = new int[n];
        Arrays.fill(OKeunSu, -1);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                OKeunSu[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        for (int i : OKeunSu) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}