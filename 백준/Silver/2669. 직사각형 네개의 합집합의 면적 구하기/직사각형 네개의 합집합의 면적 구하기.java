import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] area = new int[100][100];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    area[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for (int[] ints : area) {
            for (int anInt : ints) {
                if (anInt == 1){
                    cnt++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(cnt);

    }

}
