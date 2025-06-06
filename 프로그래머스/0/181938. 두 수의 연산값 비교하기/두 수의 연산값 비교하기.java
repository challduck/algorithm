class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int num1 = Integer.parseInt(str1.concat(str2));
        int num2 = 2 * a * b;
        return num1 > num2 ? num1 : num2;
    }
}