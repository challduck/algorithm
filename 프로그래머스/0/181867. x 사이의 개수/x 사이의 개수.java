import java.util.*;
public class Solution {

    public int[] solution(String myString) {
        int capacity = 1;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                capacity++;
            }
        }

        int[] answer = new int[capacity];
        int cnt = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                cnt++;
            } else {
                answer[cnt]++;
            }
        }

        return answer;
    }


}