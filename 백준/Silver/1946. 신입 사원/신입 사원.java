import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] docs_arr = new int[n+ 1];
            int[] interview_arr = new int[n + 1];

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int docs = Integer.parseInt(st.nextToken());
                int interview = Integer.parseInt(st.nextToken());
                docs_arr[docs] = interview;
                interview_arr[interview] = docs;
            }
            int answer = 1;
            int top =docs_arr[1];
            for (int j = 2; j <= n; j++) {
                if (top > docs_arr[j]){
                    answer++;
                    top = docs_arr[j];
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}