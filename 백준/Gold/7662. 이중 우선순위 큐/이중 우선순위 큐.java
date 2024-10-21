import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (command.equals("I")) {
                    minHeap.add(num);
                    maxHeap.add(num);
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                } else if (command.equals("D")) {
                    if (num == 1) {
                        validation(maxHeap, countMap);
                        if (!maxHeap.isEmpty()) {
                            int maxValue = maxHeap.poll();
                            countMap.put(maxValue, countMap.get(maxValue) - 1);
                        }
                    } else if (num == -1) {
                        validation(minHeap, countMap);
                        if (!minHeap.isEmpty()) {
                            int minValue = minHeap.poll();
                            countMap.put(minValue, countMap.get(minValue) - 1);
                        }
                    }
                }
            }

            validation(maxHeap, countMap);
            validation(minHeap, countMap);

            if (minHeap.isEmpty() || maxHeap.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
                sb.append(maxHeap.peek()).append(" ").append(minHeap.peek()).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static void validation(PriorityQueue<Integer> heap, Map<Integer, Integer> countMap) {
        while (!heap.isEmpty() && countMap.get(heap.peek()) == 0) {
            heap.poll();
        }
    }
}