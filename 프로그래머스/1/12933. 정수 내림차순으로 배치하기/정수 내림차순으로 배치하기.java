class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i < ch.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[min] < ch[j]) {
                    min = j;
                }
            }
            char temp = ch[min];
            ch[min] = ch[i];
            ch[i] = temp;
        }
        answer = Long.valueOf(String.copyValueOf(ch));
        return answer;
    }
}