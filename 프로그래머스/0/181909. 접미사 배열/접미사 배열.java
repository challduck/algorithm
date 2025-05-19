import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(my_string.length() - i - 1, my_string.length()));

        }
        return list.stream().distinct().sorted().toArray(String[]::new);
    }
}