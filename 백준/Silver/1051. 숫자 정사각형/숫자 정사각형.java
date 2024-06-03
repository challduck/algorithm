import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        
        char[][] rectangle = new char[N][M];
        for (int i = 0; i < N; i++) {
            rectangle[i] = br.readLine().toCharArray();
        }
        int max_size = 1;
        
        int max = Math.min(N, M);
        for (int size = 1; size <= max; size++) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    if (rectangle[i][j] == rectangle[i][j + size - 1] &&
                        rectangle[i][j] == rectangle[i + size - 1][j] &&
                        rectangle[i][j] == rectangle[i + size - 1][j + size - 1]) {
                        max_size = Math.max(max_size, size);
                    }
                }
            }
        }
        
        System.out.println(max_size * max_size);
    }
}
