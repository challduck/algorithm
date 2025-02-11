class Solution {
    public int solution(int num) {
        int answer = 0;
        long numL = num;
        if (numL == 0) {
            return 0;
        }
        while (numL != 1) {
            if (numL % 2 == 0) {
                numL /= 2;
            } else {
                numL = numL * 3 + 1;
            }
            answer++;
        }
        if (answer > 500) {
            return -1;
        }
        return answer;
    }
}