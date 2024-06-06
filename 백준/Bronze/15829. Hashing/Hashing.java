import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (str.charAt(i) - 'a' + 1) * Math.pow(31, i);
        }
        System.out.println(answer);
    }
}