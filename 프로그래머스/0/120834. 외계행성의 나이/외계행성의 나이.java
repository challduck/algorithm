class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            answer += Character.toString(str.charAt(i) - '0' + 'a');
        }
        return answer;
    }

}