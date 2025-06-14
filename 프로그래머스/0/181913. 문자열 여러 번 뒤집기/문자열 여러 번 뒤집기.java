import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            String sub = sb.substring(start, end + 1);
            String reversedSub = new StringBuilder(sub).reverse().toString();

            sb.replace(start, end + 1, reversedSub);
        }

        return sb.toString();
    }

}