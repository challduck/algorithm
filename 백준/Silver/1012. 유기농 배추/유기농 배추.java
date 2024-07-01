import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            graph = new int[m][n];
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            int cnt = 0;
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (graph[j][l] == 1 && !visited[j][l]) {
                        dfs(j,l,m,n);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }



    }

    public static void dfs(int x, int y, int m, int n) {
        if (x < 0 || x >= m || y < 0 || y >= n || graph[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        dfs(x - 1,y,m,n);
        dfs(x + 1,y,m,n);
        dfs(x,y + 1,m,n);
        dfs(x,y - 1,m,n);
    }
}