import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int originalN = N;
        int cycleLength = 0;

        while (true) {
            cycleLength++;
            int tens = N / 10;
            int ones = N % 10;
            int newN = ones * 10 + (tens + ones) % 10;
            if (newN == originalN) {
                break;
            }
            N = newN;
        }
        System.out.println(cycleLength);
    }
}