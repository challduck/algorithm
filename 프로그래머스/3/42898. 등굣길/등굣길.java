class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[m][n];
        // 웅덩이는 -1
        for (int i = 0; i < puddles.length; i++) {
            dp[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
        }
        // dp 시작점 초기화
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1) {
                    continue;
                }
                if (i + 1 < m && dp[i + 1][j] != -1) {
                    dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % 1000000007;
                }
                if (j + 1 < n && dp[i][j + 1] != -1) {
                    dp[i][j + 1] = (dp[i][j + 1] + dp[i][j]) % 1000000007;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}