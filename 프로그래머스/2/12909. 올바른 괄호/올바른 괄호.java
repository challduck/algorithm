class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for (int j = 0; j < s.length(); j++){
            if(cnt < 0){
                break;
            } else {
                if (s.charAt(j) == '(') {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }
        if (cnt == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}