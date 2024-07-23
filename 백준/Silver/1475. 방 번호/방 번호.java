import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int[] arr = new int[10];

        for (int i = 0; i < n.length(); i++) {
            arr[Character.getNumericValue(n.charAt(i))]++;
        }

        int sixNine = arr[6] + arr[9];
        int snSet = (int) Math.ceil(sixNine / 2.0);

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                max = Math.max(max, arr[i]);
            }
        }

        System.out.println(Math.max(max, snSet));

    }

}