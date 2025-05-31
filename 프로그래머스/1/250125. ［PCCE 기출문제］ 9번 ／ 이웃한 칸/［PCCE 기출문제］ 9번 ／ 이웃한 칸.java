import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;

        String targetColor = board[h][w];

        for (int i = 0; i < 4; i++) {
            int new_h = h + dx[i];
            int new_w = w + dy[i];

            if (new_h >= 0 && new_h < n && new_w >= 0 && new_w < n) {
                if (board[new_h][new_w].equals(targetColor)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}