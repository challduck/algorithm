import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> daysQueue = new LinkedList<>();

        // 각 작업이 완료되기까지 필요한 일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if (remain % speeds[i] != 0)
                day++; // 나머지가 있으면 하루 더 필요
            daysQueue.add(day);
        }

        List<Integer> result = new ArrayList<>();

        // 첫 작업의 완료일을 기준으로 배포 단위를 나눔
        int currentDeployDay = daysQueue.poll();
        int count = 1;

        while (!daysQueue.isEmpty()) {
            int nextDay = daysQueue.poll();
            if (nextDay <= currentDeployDay) {
                // 다음 작업이 현재 배포일 이전에 끝나면 같이 배포
                count++;
            } else {
                // 다음 작업이 늦으면 지금까지 카운트한 배포 개수를 기록하고 초기화
                result.add(count);
                count = 1;
                currentDeployDay = nextDay;
            }
        }
        // 마지막 배포 개수 추가
        result.add(count);

        // List를 int[]로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}