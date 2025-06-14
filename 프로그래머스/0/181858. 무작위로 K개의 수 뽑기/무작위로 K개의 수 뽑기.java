import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.size() > k) {
                break;
            }

            if (!set.contains(arr[i])) {
                list.add(arr[i]);
                set.add(arr[i]);
            }
        }

        Arrays.fill(answer, -1);
        for (int i = 0; i < list.size(); i++) {
            if (i >= k) {
                break;
            }
            answer[i] = list.get(i);
        }
        return answer;
    }
}