import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }

        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        answer = Arrays.stream(arr).mapToInt(i -> i).toArray();

        return answer;
    }
}