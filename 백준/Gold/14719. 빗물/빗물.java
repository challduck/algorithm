import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] arr = new int[w]; 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(rainWater(arr));
    }

    private static int rainWater(int[] heights) {
        int W = heights.length;
        if (W == 0)
            return 0;

        int[] leftMax = new int[W];
        int[] rightMax = new int[W];

        // 왼쪽 최대 높이 계산
        leftMax[0] = heights[0];
        for (int i = 1; i < W; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // 오른쪽 최대 높이 계산
        rightMax[W - 1] = heights[W - 1];
        for (int i = W - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        // 고인 물의 양 계산
        int totalWater = 0;
        for (int i = 0; i < W; i++) {
            totalWater += Math.max(0, Math.min(leftMax[i], rightMax[i]) - heights[i]);
        }

        return totalWater;
    }
}