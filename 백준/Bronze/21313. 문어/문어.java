import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] hands = {1, 2, 3};

        for (int i = 0; i < n - 1; i++) {
            sb.append(hands[i % 2]);
            sb.append(" ");
        }

        int lastHand = (n - 1) % 2 == 0 ? 1 : 2;
        int usedFirstHand = hands[0];

        if (lastHand == usedFirstHand) {
            sb.append(hands[2]);
        } else {
            sb.append(lastHand);
        }

        System.out.println(sb.toString());
    }
}