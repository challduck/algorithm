class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr1 = s.split(" ", -1);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length(); j++) {
                if (j == 0 || j % 2 == 0) {
                    answer += Character.toUpperCase(arr1[i].charAt(j));
                } else {
                    answer += Character.toLowerCase(arr1[i].charAt(j));
                }
            }
            if (i != arr1.length - 1) {
                answer += " ";
            }
        }


        return answer;
    }
}