class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int[] answer = new int[arr.length - 1];
        int min_value = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
                min_index = i;
            }
        }
        int cnt =0;
        for (int i = 0; i < arr.length; i++) {
            if (i == min_index) continue;
            answer[cnt++] = arr[i];
        }
        return answer;
    }
}