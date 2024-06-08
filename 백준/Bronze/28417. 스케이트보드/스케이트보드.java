import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int player = Integer.parseInt(br.readLine());
        int[] player_score = new int[player];

        for (int i = 0; i < player; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            int run_max_score = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            for (int j = 0; j < 5; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }

            player_score[i] = run_max_score + pq.poll() + pq.poll();
        }
        Arrays.sort(player_score);
        System.out.println(player_score[player_score.length - 1]);
    }
}