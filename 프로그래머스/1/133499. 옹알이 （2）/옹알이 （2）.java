class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = { "aya", "ye", "woo", "ma" };

        for (String str : babbling) {
            int i = 0;
            String prev = "";
            boolean flag = true;

            while (i < str.length()) {
                boolean isMatch = false;

                for (String string : words) {
                    if (str.startsWith(string, i) && !string.equals(prev)) {
                        i += string.length();
                        prev = string;
                        isMatch = true;
                        break;
                    }
                }

                if (!isMatch) {
                    flag = false;
                    break;
                }
            }
            if (flag && i == str.length()) {
                answer++;
            }
        }

        return answer;
    }
}