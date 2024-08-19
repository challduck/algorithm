import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Score> pq = new PriorityQueue<>(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o1.korean == o2.korean) {
                    if (o1.english == o2.english) {
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;
                    }
                    return o1.english - o2.english;
                }
                return o2.korean - o1.korean;
            }
        });
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll().name).append("\n");
        }
        System.out.println(sb);
    }
}

class Score {
    String name;
    int korean;
    int english;
    int math;

    Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}