class Solution {
    /*
     * Integer의 bitCount()를 활용하면 1의 개수를 셀수 있다.
     * 다음 숫자를 찾을때 까지 1씩 증가 시키며 1의 개수가 동일한 숫자를 찾는다.
     */
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);

        int next = n + 1;
        while (true) {
            int nextCnt = Integer.bitCount(next);

            if (cnt == nextCnt) {
                answer = next;
                break;
            }

            next++;
        }
        return answer;
    }
}