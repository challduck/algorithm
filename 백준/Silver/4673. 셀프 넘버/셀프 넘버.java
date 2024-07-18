import java.util.*;

public class Main {
    public static void main(String[] args) {
        int capacity = 10000;
        boolean[] isSelf = new boolean[capacity + 1];
        Arrays.fill(isSelf, true);

        for (int i = 1; i <= capacity; i++) {
            int d = find(i);
            if (d <= capacity){
                isSelf[d] = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= capacity; i++) {
            if (isSelf[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static int find(int n){
        int sum = n;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
