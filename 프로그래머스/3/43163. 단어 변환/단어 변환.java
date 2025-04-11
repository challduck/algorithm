import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target))
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));
        Set<String> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.word.equals(target))
                return current.depth;

            for (String next : words) {
                if (!visited.contains(next) && isOneCharDiff(current.word, next)) {
                    visited.add(next);
                    queue.add(new Node(next, current.depth + 1));
                }
            }
        }

        return 0;
    }

    private boolean isOneCharDiff(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                diff++;
            if (diff > 1)
                return false;
        }
        return diff == 1;
    }

    static class Node {
        String word;
        int depth;

        Node(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
}