class Solution {
      public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;

        if (a == 1) {
            sum = b;
        } else {

            for (int i = 0; i < a - 1; i++) {
                sum += month[i];
            }
            sum += b;
        }
        switch (sum % 7) {
            case 0:
            answer = "THU";
                break;
            case 1:
            answer = "FRI";
                break;
            case 2:
            answer = "SAT";
                break;
            case 3:
            answer = "SUN";
                break;
            case 4:
            answer = "MON";
                break;
            case 5:
            answer = "TUE";
                break;
            case 6:
            answer = "WED";
                break;
        
            default:
                break;
        }

        return answer;
    }

}