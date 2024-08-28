import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[][] arr = new int[3][2];
        int damage = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (j == 1) {
                    damage += arr[i][j];
                }
            }
        }

        int pinkbinHp = Integer.parseInt(br.readLine());

        int time = 0;
        while (true) {
            if (damage >= pinkbinHp) {
                System.out.println(time);
                break;
            }
            time++;

            for (int i = 0; i < arr.length; i++) {
                if (time % arr[i][0] == 0) {
                    damage += arr[i][1];
                }
            }
        }
    }
}