import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) == '1') {
                    sb.append(str.length() - 1 - j).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}