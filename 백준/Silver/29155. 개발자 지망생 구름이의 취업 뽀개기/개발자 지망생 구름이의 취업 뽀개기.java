import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] p = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer>[] list = new ArrayList[6];
        for (int i = 1; i <= 5; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int diff = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            list[diff].add(time);
        }

        for (int i = 1; i <= 5; i++) {
            Collections.sort(list[i]);
        }

        List<Integer> problemSelect = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < p[i]; j++) {
                problemSelect.add(list[i + 1].get(j));
            }
        }

        int answer = 0;
        int prevDiff = 1, prevTime = problemSelect.get(0);

        for (int i = 0; i < problemSelect.size(); i++) {
            int currentTime = problemSelect.get(i);
            int currentDiff;
            if (i < p[0]) {
                currentDiff = 1;
            } else if (i < p[0] + p[1]) {
                currentDiff = 2;
            } else if (i < p[0] + p[1] + p[2]) {
                currentDiff = 3;
            } else if (i < p[0] + p[1] + p[2] + p[3]) {
                currentDiff = 4;
            } else {
                currentDiff = 5;
            }
            answer += currentTime;
            if (i > 0) {
                if (currentDiff == prevDiff) {
                    answer += Math.abs(currentTime - prevTime);
                } else {
                    answer += 60;
                }
            }

            prevDiff = currentDiff;
            prevTime = currentTime;
        }

        System.out.println(answer);
    }
}
