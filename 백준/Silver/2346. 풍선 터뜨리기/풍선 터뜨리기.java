import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] balloons = new int[n];

        for (int i = 0; i < n; i++) {
            balloons[i] = Integer.parseInt(str[i]);
        }

        List<Integer> list = new ArrayList<>();
        boolean[] pop = new boolean[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            list.add(index + 1);
            pop[index] = true;

            int move = balloons[index];

            if (i == n -1) {
                break;
            }

            if (move > 0) {
                for (int j = 0; j < move;) {
                    index = (index + 1) % n;
                    if (!pop[index]) {
                        j++;
                    }
                }
            } else {
                for (int j = 0; j < Math.abs(move);) {
                    index = (index - 1 + n) % n;
                    if (!pop[index]) {
                        j++;
                    }
                }
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }    
}
