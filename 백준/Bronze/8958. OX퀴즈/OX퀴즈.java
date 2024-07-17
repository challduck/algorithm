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
            String quiz = br.readLine();
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < quiz.length(); j++) {
                if (quiz.charAt(j) == 'O'){
                    cnt += 1;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}
