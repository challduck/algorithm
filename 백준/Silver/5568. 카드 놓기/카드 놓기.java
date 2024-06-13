import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        String[] cards = new String[n];
        for (int i = 0; i < n; i++) {
            cards[i] = br.readLine();
        }
        Set<String> set = new HashSet<>();
        sequence(cards, new boolean[n], "", 0, k, set);
        System.out.println(set.size());
    }

    public static void sequence (String[] cards, boolean[] visited, String str, int depth, int k, Set<String> set){
        if (depth == k){
            set.add(str);
            return;
        }

        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]){
                visited[i] = true;
                sequence(cards, visited, str + cards[i], depth + 1, k, set);
                visited[i] = false;
            }
        }
    }

}
