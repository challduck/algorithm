import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int[] arr = {4,6,4,10};
            for (int j = 0; j < 4; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();

                    if (word.equals("-")){
                        continue;
                    } else {
                        map.put(word, map.getOrDefault(word, 0) + arr[j]);
                    }
                }
            }
        }
        if (map.isEmpty()){
            System.out.println("Yes");
        } else {
            Collection<Integer> values = map.values();
            int max = Collections.max(values);
            int min = Collections.min(values);

            if (max - min > 12) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}