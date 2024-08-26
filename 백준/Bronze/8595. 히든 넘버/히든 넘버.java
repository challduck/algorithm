import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (sb.length() > 0) {
                    sum += Long.parseLong(sb.toString());
                    sb = new StringBuilder();
                }
                continue;
            } else {

                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            sum += Long.parseLong(sb.toString());
        }
        System.out.println(sum);
    }
}
