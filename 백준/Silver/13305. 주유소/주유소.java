import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long[] road = new long[N - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            road[i] = Long.parseLong(st.nextToken());
        }
        
        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }
        long totalCost = 0;
        long currentPrice = price[0];
        
        for (int i = 0; i < N - 1; i++) {
            if (price[i] < currentPrice) {
                currentPrice = price[i];
            }
            totalCost += currentPrice * road[i];
        }
        System.out.println(totalCost);
    }
}