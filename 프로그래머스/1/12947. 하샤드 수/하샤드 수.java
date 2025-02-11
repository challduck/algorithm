class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        boolean answer = x % sum == 0 ? true : false;

        return answer;
    }
}