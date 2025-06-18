import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'x') {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                }
                sb = new StringBuilder();

            } else {
                sb.append(ch);
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }
        String[] answer = {};
        answer = list.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}