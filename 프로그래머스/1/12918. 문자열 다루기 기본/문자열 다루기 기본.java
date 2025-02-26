class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSUVWXYZ";
        if(4 != s.length() && s.length() != 6){return false;}
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (s.charAt(i) == abc.charAt(j)) {
                    return false;
                }
            }
        }

        return answer;
    }
}