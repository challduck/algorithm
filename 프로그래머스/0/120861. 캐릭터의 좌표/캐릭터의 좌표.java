import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        int max_x = board[0] / 2;
        int max_y = board[1] / 2;
        for (int i = 0; i < keyinput.length; i++) {
            String command = keyinput[i];

            if (command.equals("left")) {
                if (answer[0] > -max_x) {
                    answer[0]--;
                }
            } else if (command.equals("right")) {
                if (answer[0] < max_x) {
                    answer[0]++;
                }
            } else if (command.equals("up")) {
                if (answer[1] < max_y) {
                    answer[1]++;
                }
            } else if (command.equals("down")) {
                if (answer[1] > -max_y) {
                    answer[1]--;
                }
            }
        }

        return answer;
    }
}