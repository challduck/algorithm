import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.*;  
  
public class Main {
    static Queue<int[]> queue = new LinkedList<>();  
    static int[][][] graph;
    static boolean[][][] visited;
    static int m,n,h;
    static int cnt = 0;
    static int[] dx ={ 0, 0, 1, -1, 0, 0 };
    static int[] dy ={ 0, 0, 0, 0, 1, -1 };
    static int[] dh ={ 1, -1, 0, 0, 0, 0 };
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        graph = new int[h][n][m];
        visited = new boolean[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                    if (graph[i][j][k] == 1) {
                        queue.add(new int[]{i, j, k, 0});
                        visited[i][j][k] = true;
                    }
                }
            }            
        }

        bfs();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (graph[i][j][k] == 0 && !visited[i][j][k]) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(cnt);
    } 

    static void bfs(){
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_h = current[0];
            int cur_x = current[1];
            int cur_y = current[2];
            int cur_dist = current[3];
            cnt = Math.max(cnt, cur_dist);

            for (int i = 0; i < 6; i++) {
                int newH = cur_h + dh[i];
                int newX = cur_x + dx[i];
                int newY = cur_y + dy[i];

                if (newH >= 0 && newH < h && newX >= 0 && newY >= 0 && newX < n && newY < m && 
                    !visited[newH][newX][newY] && graph[newH][newX][newY] == 0) {
                    visited[newH][newX][newY] = true;
                    queue.add(new int[]{newH, newX, newY, cur_dist + 1});
                }
            }
        }

    }
}