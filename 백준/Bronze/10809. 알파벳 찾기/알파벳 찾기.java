import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.indexOf('a' + i);
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }

}
