import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int no = 0;
        int yes = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) == 1) {
                yes++;
            } else {
                no++;
            }
        }
        System.out.println(yes > no ? "Junhee is cute!" : "Junhee is not cute!");
    }
}