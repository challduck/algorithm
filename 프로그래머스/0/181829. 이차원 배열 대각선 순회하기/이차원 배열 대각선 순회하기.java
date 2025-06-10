class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        out: for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i >= k && j >= k) {
                    break out;
                }
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}