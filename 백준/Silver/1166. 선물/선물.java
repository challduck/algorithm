import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        System.out.println(binarySearch(n, l, w, h));
    }

    private static double binarySearch(int n, int l, int w, int h) {
        double left = 0;
        double right = Math.min(Math.min(l, w), h);

        double result = 0;
        while (left < right) {
            double mid = (left + right) / 2;
            long temp = (long) (l / mid) * (long) (w / mid) * (long) (h / mid);

            if (temp < n) {
                if (right == mid) {
                    break;
                }
                right = mid;
            } else {
                if (left == mid) {
                    break;
                }
                left = mid;
                result = mid;
            }
        }

        return result;
    }
}