import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String num = Integer.toString(a * b * c);
        for (int i = 0; i <= 9; i++) {
            int cnt = 0;
            while (num.contains(Integer.toString(i))){
                num = num.replaceFirst(Integer.toString(i), "");
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}