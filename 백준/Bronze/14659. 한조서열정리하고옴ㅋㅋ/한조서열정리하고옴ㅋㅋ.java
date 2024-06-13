import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] peaks = new int[n];
        for (int i = 0; i < n; i++) {
            peaks[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int cnt = 0;

        for(int height : peaks){
            if (!stack.isEmpty()){
                if (height > stack.peek()){
                    stack.push(height);
                    cnt = 0;
                } else {
                    cnt++;
                }
            } else {
                stack.push(height);
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}