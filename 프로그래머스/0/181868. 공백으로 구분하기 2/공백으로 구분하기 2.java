import java.util.*;
public class Solution {

    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] answer = my_string.split(" ");
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}