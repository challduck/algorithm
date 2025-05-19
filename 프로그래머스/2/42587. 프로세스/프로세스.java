import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;
        Queue<Document> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            max = Math.max(max, priorities[i]);
            queue.add(new Document(i, priorities[i]));
        }
        while (!queue.isEmpty()) {
            Document doc = queue.poll();
            if (doc.priority == max) {
                answer++;
                if (doc.index == location) {
                    break;
                }
                max = 0;
                for (Document d : queue) {
                    max = Math.max(max, d.priority);
                }
            } else {
                queue.add(doc);
            }
        }
        return answer;
    }

    class Document {
        int index;
        int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}