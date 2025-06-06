class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(my_string.substring(0, s));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(my_string.substring(s, e + 1)).reverse();
        sb1.append(sb2).append(my_string.substring(e + 1, my_string.length()));
        return sb1.toString();
    }
}