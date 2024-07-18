import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] str1_arr = new String[n];
        String[] str2_arr = new String[n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            str1_arr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            str2_arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(str1_arr[i].charAt(j)).append(str1_arr[i].charAt(j));
            }
            if (!str2_arr[i].contentEquals(sb)) {
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }

    }
}
