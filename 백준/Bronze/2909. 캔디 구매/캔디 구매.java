import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long c = Long.parseLong(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long round = (long) Math.pow(10, k);

        System.out.println(Math.round((double) c / round) * round);
    }
}