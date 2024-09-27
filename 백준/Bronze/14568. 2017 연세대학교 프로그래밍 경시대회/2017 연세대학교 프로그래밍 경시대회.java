import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // "3명"이 주어진 조건에서 가장 적절한 경우의 수 를 찾는 문제
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        // 목적 -> 분배하기 위한 적절한 "경우의 수"를 찾는 문제

        for (int i = 1; i < n; i++) { // 택희
            for (int j = 1; j < n; j++) { // 영훈
                for (int k = 1; k < n; k++) { // 남규

                    if (n - i - j - k == 0 && k - j >= 2 && i % 2 == 0) {
                        cnt++;
                    }

                }
            }
        }
        System.out.println(cnt);
    }
}