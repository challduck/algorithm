class Solution {
    public int solution(int n) {
        int answer = 1;
        int slice = 6;
        while (true) {
            if ((slice * answer) % n != 0) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}