class Solution {
    public int solution(int number) {
        int[] f = new int[number+1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= number ; i++) {
            f[i] = f[i-1] + f[i-2];
            f[i] %= 1234567;
        }
        return f[number];
    }
}