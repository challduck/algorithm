import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
     * 그림에 나타난 나이트의 모든 이동 방향을 배열로 저장
     */
    private static final int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
    private static final int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 테스트 케이스의 수 n
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            // 체스판의 한변의 길이
            int l = Integer.parseInt(br.readLine());
            // 나이트의 현재 위치
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            // 나이트가 이동한 위치
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            System.out.println(bfs(l, startX, startY, endX, endY));
        }
    }

    private static int bfs(int l, int start_x, int start_y, int end_x, int end_y) {
        // 만약 현재 위치와 이동해야하는 위치가 같다면 0 리턴
        if (start_x == end_x && start_y == end_y) {
            return 0;
        }

        // 방문 여부 판단 배열
        boolean[][] visited = new boolean[l][l];
        // bfs Queue 초기화
        Queue<int[]> queue = new LinkedList<>();
        // queue 초기값에는 시작위치 x, y, 움직인 횟수를 넣는다.
        queue.offer(new int[] { start_x, start_y, 0 }); // {x, y, moves}
        visited[start_x][start_y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];
            // 나이트의 움직임 방향 경우의 수 모두 적용
            for (int i = 0; i < 8; i++) {
                int new_x = x + dx[i];
                int new_y = y + dy[i];

                // 새로운 위치가 체스판 범위 내에 있고 방문한 적이 없다면
                if (new_x >= 0 && new_x < l && new_y >= 0 && new_y < l && !visited[new_x][new_y]) {
                    // 목표 위치에 도달하면 (현재 이동 횟수 + 1)
                    if (new_x == end_x && new_y == end_y) {
                        return moves + 1;
                    }
                    // 목표 위치가 아니라면 새로운 위치와 움직인 횟수를 1 증가하여 queue에 추가
                    queue.offer(new int[] { new_x, new_y, moves + 1 });
                    visited[new_x][new_y] = true;
                }
            }
        }

        return -1; // 도달할 수 없는 영역이라면 -1을 리턴
    }
}