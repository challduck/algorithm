class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cola = n;

        while (true) {
            if (cola < a) {
                break;
            } else {
                answer += (cola / a) * b;
                cola = ((cola / a) * b) + (cola % a);
            }
        }

        return answer;
    }

}