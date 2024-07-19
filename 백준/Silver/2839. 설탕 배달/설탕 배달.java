import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int temp = n % 5;
        int bag = n / 5;

        while (true) {
            if (temp % 3 == 0) {
                bag += temp / 3;
                System.out.println(bag);
                break;
            } else if (bag == 0) {
                System.out.println(-1);
                break;
            }
            temp += 5;
            bag -= 1;
        }
    }
}
