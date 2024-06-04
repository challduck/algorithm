import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }        
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int cnt = 0;
        for (int target : targets) {
            int index = 0;
            for (Integer value : deque) {
                if (value == target) {
                    break;
                }
                index++;
            }
            int left = index;
            int right = deque.size() - index;
            cnt += Math.min(left, right);
            if (left < right) {
                for (int i = 0; i < left; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < right; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
            deque.pollFirst();
        }

        System.out.println(cnt);
        

    }    
}
