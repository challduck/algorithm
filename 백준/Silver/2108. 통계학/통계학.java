import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int average = 0;
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        int[] countArr = new int[8001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            countArr[num + 4000]++;
            average += num;
        }
        Arrays.sort(arr);

        int centerValue = arr[n / 2];

        int maxCount = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > maxCount) {
                maxCount = countArr[i];
                list.clear();
                list.add(i - 4000);
            } else if (countArr[i] == maxCount) {
                list.add(i - 4000);
            }
        }

        int mode = 0;
        if (list.size() == 1) {
            mode = list.get(0);
        } else {
            Collections.sort(list);
            mode = list.get(1);
        }

        int range = Math.max(Math.abs(arr[0] - arr[arr.length - 1]), Math.abs(arr[arr.length - 1] - arr[0]));

        System.out.println(Math.round(average / (double) n));
        System.out.println(centerValue);
        System.out.println(mode);
        System.out.println(range);
    }
}