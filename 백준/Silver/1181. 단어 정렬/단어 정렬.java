import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!list.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);
        Collections.sort(list, (String a, String b) -> a.length() - b.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}