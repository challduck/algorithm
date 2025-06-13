import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("americano", 4500);
        map.put("anything", 4500);
        map.put("cafelatte", 5000);

        for (int i = 0; i < order.length; i++) {
            String str = order[i];

            for (String string : map.keySet()) {
                if (str.contains(string)) {
                    answer += map.get(string);
                }
            }
        }
        return answer;
    }
}