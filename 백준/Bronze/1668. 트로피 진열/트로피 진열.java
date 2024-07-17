import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int leftMax = arr[0];
        int leftCnt = 1;
        int leftIdx = 0;
        int rightMax = arr[N - 1];
        int rightCnt = 1;
        int rightIdx = N - 1;

        for (int i = 0; i < N - 1; i++) {
            leftIdx++;
            if (leftMax < arr[leftIdx]){
                leftMax = arr[leftIdx];
                leftCnt++;
            }
            rightIdx--;
            if (rightMax < arr[rightIdx]){
                rightMax = arr[rightIdx];
                rightCnt++;
            }
        }
        System.out.println(leftCnt);
        System.out.println(rightCnt);
    }
}
