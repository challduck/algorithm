import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        int len = words.length;

        for (int i = 0; i < len; i++) {
            String word = words[i];
            if (i > 0 && word.charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            if (set.contains(word)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            set.add(word);
        }

        return answer;
    }

}