import java.util.*;

class Solution {
   public int[][] solution(int n) {
        int[][] rotate = {{0 , 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] answer = new int[n][n];
        int row = 0;
        int col = 0;
        int direction = 0;

        int num = 1;
        while (num <= n *n) {
            answer[row][col] = num++;

            int next_row = row + rotate[direction][0];
            int next_col = col + rotate[direction][1];
            if (next_row >= 0 && next_col >= 0 && next_row < n && next_col < n && answer[next_row][next_col] == 0) {
                row = next_row;
                col = next_col;
            } else {
                direction = (direction + 1) % 4;
                row = row + rotate[direction][0];
                col = col + rotate[direction][1];
            }
        }

        return answer;
    }
}