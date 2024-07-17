import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        while (st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));    
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (Integer i : list) {
            cnt += (int) Math.ceil((double) i / T);
        }

        sb.append(cnt).append("\n");
        sb.append(n / P).append(" ").append(n % P);

        System.out.println(sb);
    }
}
