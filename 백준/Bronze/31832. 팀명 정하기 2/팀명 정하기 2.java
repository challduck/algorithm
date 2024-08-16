import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String result = "";

        for (int i = 0; i < N; i++) {
            String teamName = br.readLine();

            if (conditionOne(teamName) && conditionTwo(teamName) && conditionThree(teamName)) {
                result = teamName; // 조건을 만족하는 팀명 저장
            }
        }

        System.out.println(result);
    }

    // 첫 번째 조건
    private static boolean conditionOne(String teamName) {
        int upperCase = 0, lowerCase = 0;
        for (char c : teamName.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                upperCase++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCase++;
            }
        }
        return lowerCase >= upperCase;
    }

    // 두 번째 조건
    private static boolean conditionTwo(String teamName) {
        return teamName.length() <= 10;
    }

    // 세 번째 조건
    private static boolean conditionThree(String teamName) {
        for (char c : teamName.toCharArray()) {
            if (c < '0' || c > '9') {
                return true; // 숫자가 아닌 문자가 하나 이상 존재
            }
        }
        return false;
    }
}
