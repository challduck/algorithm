class Solution {
    public String solution(int n, int t, int m, int p) {
        String s = "0123456789ABCDEF";
        StringBuilder sb = new StringBuilder();

        int num = 0;
        while (sb.length() < t * m) {
            int temp = num;
            StringBuilder converted = new StringBuilder();

            if (temp == 0) {
                converted.append('0');
            } else {
                while (temp > 0) {
                    converted.insert(0, s.charAt(temp % n));
                    temp /= n;
                }
            }
            sb.append(converted);
            num++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = p - 1; i < sb.length() && answer.length() < t; i += m) {
            answer.append(sb.charAt(i));
        }

        return answer.toString();
    }

}