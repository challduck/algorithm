class Solution {
    public int[] solution(int[] arr) {

        int size = 0;
        for (int i = 1; i <= (int) Math.pow(2, arr.length / 2); i *= 2) {
            if (i >= arr.length) {
                size = i;
                break;
            }
        }
        int[] answer = new int[size];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}