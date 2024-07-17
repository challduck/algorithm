import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());

        Queue<Character> queue = new ArrayDeque<>();
        String str = "SciComLove";
        for (int i = 0; i <str.length() ; i++) {
            queue.offer(str.charAt(i));
        }

        for (int i = 0; i < n % str.length(); i++) {
            char ch = queue.poll();
            queue.offer(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : queue) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
