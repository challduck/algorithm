import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());

        System.out.println(Math.min(h, w) * 100 / 2);
    }

}