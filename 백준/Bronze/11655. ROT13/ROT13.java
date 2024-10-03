import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solved(str);
    }

    private static void solved(String str) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.toString(ch).equals(" ")) {
                sb.append(" ");
                continue;
            } else if (ch >= 'A' && ch <= 'z') {
                if (ch >= 'A' && ch <= 'Z') {
                    ch += 13;
                    if (ch > 'Z') {
                        ch -= 'Z';
                        ch += 'A' - 1;
                    }
                } else if (ch >= 'a' && ch <= 'z') {
                    ch += 13;
                    if (ch > 'z') {
                        ch -= 'z';
                        ch += 'a' - 1;
                    }
                }
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}