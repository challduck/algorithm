import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        int[] arr = new int[m];
        sequence(n,m,1,0,arr);

    }
    public static void sequence(int N, int M, int start, int depth, int[] selected) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i <= N; i++) {
            selected[depth] = i;
            sequence(N, M, i + 1, depth + 1, selected);
        }
    }
}