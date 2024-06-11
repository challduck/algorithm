import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        boolean[] visited = new boolean[100001];
        
        System.out.println(bfs(visited, N, K));
    }

    private static int bfs (boolean[] visited, int start, int end){
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start , 0});
        visited[start] = true;

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == end) {
                answer = current[1];
                break;
            }

            int[] next_location = {current[0] - 1, current[0] + 1, current[0] * 2};

            for (int i : next_location) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    queue.add(new int[]{i, current[1] + 1});
                    visited[i] = true;
                }
            }
        }
        return answer;
    }
}
