import java.util.*;

class Solution {
    /*
     * 선택할 수 있는 포켓몬의 수 = n / 2
     * 최대한 다양한 포켓몬을 가져가야하므로 set에 저장
     */
    public int solution(int[] nums) {
        int answer = 0;
        int select = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (select < set.size()) {
            answer = select;
        } else {
            answer = set.size();
        }
        return answer;
    }
}