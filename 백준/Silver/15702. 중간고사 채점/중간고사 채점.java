import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] problemScore = new int[n];
        for (int i = 0; i < n; i++) {
            problemScore[i] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Score> pq = new PriorityQueue<>(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.score == o2.score) {
                    return o1.code - o2.code;
                }
                return o2.score - o1.score;
            }
        });

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (st.nextToken().equals("O")) {
                    sum += problemScore[j];
                }
            }
            pq.add(new Score(key, sum));
        }

        Score answer = pq.poll();
        System.out.println(answer.code + " " + answer.score);
    }
}

class Score {
    int code;
    int score;

    public Score(int code, int score) {
        this.code = code;
        this.score = score;
    }
}