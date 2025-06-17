class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int start = numLog[0];

        for (int i = 1; i < numLog.length; i++) {
            if (Math.abs(start - numLog[i]) == 1) {
                if (numLog[i] - start == -1) {
                    sb.append("s");
                } else {
                    sb.append("w");
                }
            } else {
                if (numLog[i] - start == -10) {
                    sb.append("a");
                } else {
                    sb.append("d");
                }
            }
            start = numLog[i];
        }
        return sb.toString();
    }
}