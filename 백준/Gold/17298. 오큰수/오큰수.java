import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int[] OkeunSu = new int[n];
        Arrays.fill(OkeunSu, -1);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        for (int i = n - 1; i >= 0; i--) {
            // 1번째 조건문
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // 2번째 조건문
            if (!stack.isEmpty()) {
                OkeunSu[i] = stack.peek();
            }
            // 3번째
            stack.push(arr[i]);
        }

        for (int i : OkeunSu) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}