import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = 0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) {
                System.out.println(sb.toString());
                break;
            }
            sb.append("Case ").append(++t).append(": ");
            int sum = 0;
            while (true) {
                if (V < P) {
                    if (V > L) {
                        sum += L;
                    } else {
                        sum += V;
                    }
                    sb.append(sum).append("\n");
                    break;
                }
                sum += L;
                V -= P;
            }
        }
    }
}