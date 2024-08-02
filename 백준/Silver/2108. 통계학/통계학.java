import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[8001];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
            num1 += a;
            count[a + 4000]++;
        }

        Arrays.sort(arr);
        num2 = arr[n / 2];

        int maxCount = 0;
        List<Integer> modes = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                modes.clear();
                modes.add(i - 4000);
            } else if (count[i] == maxCount) {
                modes.add(i - 4000);
            }
        }

        if (modes.size() > 1) {
            Collections.sort(modes);
            num3 = modes.get(1);
        } else {
            num3 = modes.get(0);
        }

        sb.append(Math.round(num1 / (double) n)).append("\n");
        sb.append(num2).append("\n");
        sb.append(num3).append("\n");
        sb.append(Math.max(Math.abs(arr[n - 1] - arr[0]), Math.abs(arr[0] - arr[n - 1])));
        System.out.println(sb);

    }
}