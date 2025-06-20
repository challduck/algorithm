import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);

            if (ch == 'a' || ch == 'b' || ch == 'c') {
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
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(answer);
    }
}