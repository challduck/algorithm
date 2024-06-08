import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
            }
        }
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}