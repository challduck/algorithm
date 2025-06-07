import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int drink = Integer.parseInt(st.nextToken()) / 2 + Integer.parseInt(st.nextToken());
        if (n > drink) {
            System.out.println(drink);
        } else {
            System.out.println(n);
        }

    }
}
