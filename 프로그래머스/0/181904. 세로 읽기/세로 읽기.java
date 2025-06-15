class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i += m) {
            if (i + m > my_string.length()) {
                break;
            }
            String str = my_string.substring(i, i + m);
            sb.append(str.charAt(c - 1));
        }
        return sb.toString();
    }
}