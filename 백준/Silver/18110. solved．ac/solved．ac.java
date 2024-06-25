import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int[] opinions = new int[n];
        for (int i = 0; i < n; i++) {
            opinions[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(opinions);
        
        int excludeCount = (int) Math.round(n * 0.15);
        int sum = 0;
        int count = 0;
        
        for (int i = excludeCount; i < n - excludeCount; i++) {
            sum += opinions[i];
            count++;
        }
        
        int average = (int) Math.round((double) sum / count);
        
        System.out.println(average);
    }
}
