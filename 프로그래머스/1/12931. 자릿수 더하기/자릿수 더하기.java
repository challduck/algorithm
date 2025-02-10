import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] ch = String.valueOf(n).toCharArray();

        for (int i = 0; i < ch.length; i++) {
            answer += Character.getNumericValue(ch[i]);
        }
        return answer;
    }
}