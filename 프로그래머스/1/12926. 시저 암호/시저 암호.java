class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                answer.append(' ');
            } else if (ch >= 'a' && ch <= 'z'){
                if (ch + n > 'z'){
                    ch = (char)(ch - 26 + n);
                    answer.append(ch);
                } else {
                    ch = (char)(ch + n);
                    answer.append(ch);
                }
            } else if (ch >= 'A' && ch <= 'Z'){
                if (ch + n > 'Z'){
                    ch = (char)(ch - 26 + n);
                    answer.append(ch);
                } else {
                    ch = (char)(ch + n);
                    answer.append(ch);
                }
            }
        }
        return answer.toString();
    }
}