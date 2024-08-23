import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Queue<Docs> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.add(new Docs(j, Integer.parseInt(st.nextToken())));
            }

            int order = 0;

            while (!queue.isEmpty()) {
                Docs currentDocs = queue.poll();
                boolean flag = false;

                for (Docs docs : queue) {
                    if (docs.sequence > currentDocs.sequence) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    queue.add(currentDocs);
                } else {
                    order++;
                    if (currentDocs.index == m) {
                        sb.append(order).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}

class Docs {
    int index;
    int sequence;

    Docs(int index, int sequence) {
        this.index = index;
        this.sequence = sequence;
    }
}