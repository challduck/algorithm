import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int cnt = 1;
        int prev = 0;

        while (true) {
            if (x <= prev + cnt) {
                if (cnt % 2 == 1) {
                    System.out.println((cnt - (x - prev - 1)) + "/" + (x - prev));
                    break;
                } else {
                    System.out.println((x - prev) + "/" + (cnt - (x - prev - 1)));
                    break;
                }
            } else {
                prev += cnt;
                cnt++;
            }
        }
    }
}
