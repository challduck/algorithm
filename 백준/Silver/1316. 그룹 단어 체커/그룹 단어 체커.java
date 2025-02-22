import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            String str = br.readLine();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (set.contains(ch) && (ch == str.charAt(j - 1))){
                    continue;
                } else if (set.contains(ch) &&( ch != str.charAt(j - 1))) {
                    flag = false;
                    break;
                } else {
                    set.add(ch);
                }
            }
            if (flag){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}