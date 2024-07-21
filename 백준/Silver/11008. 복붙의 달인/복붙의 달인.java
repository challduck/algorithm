import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String target = st.nextToken();
            String copyWord = st.nextToken();

            while (target.contains(copyWord)){
                target = target.replaceFirst(copyWord , " ");
                cnt++;
            }

            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) == ' '){
                    continue;
                } else {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

}
