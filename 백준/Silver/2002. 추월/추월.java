import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        Queue<String> entrance = new LinkedList<>();
        Map<String, Integer> exit = new HashMap<>();

        for (int i = 0; i < n; i++) {
            entrance.add(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            exit.put(br.readLine(), i);
        }

        int exit_num = 0;
        while (!entrance.isEmpty()) {
            String entrance_car = entrance.poll();
            int entrance_num = exit.get(entrance_car);
            if (entrance_num < exit_num) {
                cnt++;
            }
            exit_num = Math.max(exit_num, entrance_num);
        }
        System.out.println(cnt);
    }

}
