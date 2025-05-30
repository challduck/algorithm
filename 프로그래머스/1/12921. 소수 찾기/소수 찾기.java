import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = primeList(n);
        int answer = list.size();
        return answer;
    }

    private static List<Integer> primeList(int end) {
        // 소수 판단의 boolean 배열
        boolean[] isPrime = new boolean[end + 1];
        // 전부 true로 변환
        for (int i = 2; i <= end; i++) {
            isPrime[i] = true;
        }
        // i의 배수가 되는 값은 소수가 아니다.
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // 소수를 담을 List
        List<Integer> list = new ArrayList<>();
        // 값을 찾으려고 하는 시작값부터 본인을 포함한 값까지 소수를 전부 넣고 반환
        for (int i = 2; i <= end; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }

        return list;
    }
}