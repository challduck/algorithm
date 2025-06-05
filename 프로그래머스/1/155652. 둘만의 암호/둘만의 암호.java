import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char ch : skip.toCharArray()) {
            set.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // 현재 변환할 문자
            int count = 0; // 유효한 이동 횟수 카운트

            // 유효한 이동 횟수가 index가 될 때까지 반복
            while (count < index) {
                // 현재 문자에서 다음 문자로 이동
                ch++;

                // 'z'를 넘어가는 경우 'a'로 순환
                if (ch > 'z') {
                    ch = 'a';
                }

                // 이동한 문자가 skip 문자인지 확인
                if (!set.contains(ch)) {
                    // skip 문자가 아니면 유효 이동 횟수 증가
                    count++;
                }
                // skip 문자이면 count는 증가시키지 않고 다음 반복으로 넘어감
            }

            // index 만큼 유효하게 이동한 최종 문자를 결과에 추가
            sb.append(ch);
        }

        return sb.toString();
    }
}