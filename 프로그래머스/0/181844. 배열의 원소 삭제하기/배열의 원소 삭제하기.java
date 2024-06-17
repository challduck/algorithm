import java.util.*;
class Solution {
     public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < delete_list.length; i++) {
            set.add(delete_list[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}