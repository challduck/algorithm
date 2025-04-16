import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] words = str.split(" ");
            boolean flag = false;

            // 1번- 각 단어의 첫 글자부터 탐색
            for (String word : words) {
                char c = Character.toLowerCase(word.charAt(0));
                if (!set.contains(c)) {
                    set.add(c);
                    int idx = str.indexOf(word);
                    sb.append(str, 0, idx)
                            .append("[")
                            .append(word.charAt(0))
                            .append("]")
                            .append(str.substring(idx + 1))
                            .append("\n");
                    flag = true;
                    break;
                }
            }

            // 2번- 전체 문자열 왼쪽부터 탐색
            if (!flag) {
                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (c == ' ')
                        continue;
                    char lower = Character.toLowerCase(c);
                    if (!set.contains(lower)) {
                        set.add(lower);
                        sb.append(str, 0, j)
                                .append("[")
                                .append(str.charAt(j))
                                .append("]")
                                .append(str.substring(j + 1))
                                .append("\n");
                        flag = true;
                        break;
                    }
                }
            }

            // 아무 단축키도 지정하지 못한 경우
            if (!flag) {
                sb.append(str).append("\n");
            }
        }
        System.out.println(sb);
    }
}