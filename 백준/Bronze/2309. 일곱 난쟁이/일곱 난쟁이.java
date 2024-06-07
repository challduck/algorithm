import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
            sum += height[i];
        }
        boolean is_found = false;

        for (int i = 0; i < 8; i++) {
            if (!is_found) {
                for (int j = i + 1; j < 9; j++) {
                    if (sum - height[i] - height[j] == 100) {
                        height[i] = -1;
                        height[j] = -1;
                        is_found = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        int[] res = new int[7];
        int index = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] != -1) {
                res[index++] = height[i];
            }
        }
        Arrays.sort(res);
        StringBuffer sb = new StringBuffer();
        for (int i : res) {
            sb.append(i).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}