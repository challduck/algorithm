import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            if (!set.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}