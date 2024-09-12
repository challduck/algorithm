import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); // 현재
        int B = Integer.parseInt(br.readLine()); // 목표
        int C = Integer.parseInt(br.readLine()); // 냉동 기준 1℃ 해동 하는데 필요한 시간
        int D = Integer.parseInt(br.readLine()); // 0℃ 이거나 도달한 경우 해동하는데 필요한 시간
        int E = Integer.parseInt(br.readLine()); // 0℃ 또는 상온 기준 목표 온도까지 1℃ 올리는데 필요한 시간
        int answer = 0;
        if (A < 0) {
            answer += Math.abs(A) * C;
            A = 0;
        }

        if (A == 0) {
            answer += D;
        }

        answer += (B - A) * E;
        System.out.println(answer);

    }
}