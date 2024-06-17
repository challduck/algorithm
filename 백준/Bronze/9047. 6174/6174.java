import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String str_num = br.readLine();
            str_num = String.format("%04d", Integer.parseInt(str_num));
            int cnt = 0;
            while (!str_num.equals("6174")){
                char[] asc_chars = str_num.toCharArray();
                Arrays.sort(asc_chars);
                String asc_str = new String(asc_chars);

                String desc_str = new StringBuilder(asc_str).reverse().toString();

                int asc_num = Integer.parseInt(asc_str);
                int desc_num = Integer.parseInt(desc_str);

                int diff = desc_num - asc_num;

                str_num = String.format("%04d", diff);
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}