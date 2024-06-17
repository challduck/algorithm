import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int[][] safe_area = new int[board.length][board[0].length];
        int[][] area = {{-1,-1},{-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                safe_area[i][j] = board[i][j];
            }
        }
        
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    for(int[] dir : area){
                        int next_r = i + dir[0];
                        int next_c = j + dir[1];

                        if (next_r >= 0 && next_r < rows && next_c >= 0 && next_c < cols) {
                            safe_area[next_r][next_c] = 1;
                        }
                    }
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (safe_area[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}