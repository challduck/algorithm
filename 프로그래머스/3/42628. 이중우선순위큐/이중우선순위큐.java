import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i].substring(0, 1);
            int num = Integer.parseInt(operations[i].substring(2));
            if (op.equals("I")) {
                minHeap.add(num);
                maxHeap.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if (op.equals("D")) {
                if (num == 1) {
                    validation(maxHeap, map);
                    if (!maxHeap.isEmpty()) {
                        int max = maxHeap.poll();
                        map.put(max, map.get(max) - 1);
                    }
                } else if (num == -1) {
                    validation(minHeap, map);
                    if (!minHeap.isEmpty()) {
                        int min = minHeap.poll();
                        map.put(min, map.get(min) - 1);
                    }
                }
            }
        }

        validation(maxHeap, map);
        validation(minHeap, map);
        if (minHeap.isEmpty() || maxHeap.isEmpty()) {
            return new int[] { 0, 0 };
        } else {
            int max = maxHeap.peek();
            int min = minHeap.peek();
            return new int[] { max, min };
        }
    }

    public void validation(PriorityQueue<Integer> heap, Map<Integer, Integer> map) {
        while (!heap.isEmpty() && map.get(heap.peek()) == 0) {
            heap.poll();
        }
    }
}