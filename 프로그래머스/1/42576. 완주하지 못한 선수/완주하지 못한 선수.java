import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        /*
         * participant 에는 참가자 명단이 들어있음
         * completion 에는 완주자 명단이 들어있음
         * 완주자 명단에 없는 단 한명
         * 
         * map으로 해서 이름이 나올때마다 getOrDefault로 1씩 늘리기
         * completion에 이름이 나왔다면 값을 1씩 줄여보기
         * map을 전부 순회해서 1인 값이 나온다면 해당 값이 정답이므로 key값 반환
         */

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }

        for (Map.Entry<String, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) {
                answer = i.getKey();
                break;
            }
        }
        return answer;
    }

}