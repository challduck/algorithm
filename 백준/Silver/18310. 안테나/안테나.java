import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] homeLocations = new int[n];
        for (int i = 0; i < n; i++) {
            int location = Integer.parseInt(st.nextToken());
            homeLocations[i] = location;
        }
        Arrays.sort(homeLocations);

        System.out.println(homeLocations[(n - 1) / 2]);
    }
}