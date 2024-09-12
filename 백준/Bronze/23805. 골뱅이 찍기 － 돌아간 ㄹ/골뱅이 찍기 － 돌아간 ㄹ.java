import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 현재
        System.out.println(golbange(n));
    }

    static String golbange(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("@@@".repeat(n)).append(" ".repeat(n)).append("@".repeat(n)).append("\n");
        }
        for (int i = 0; i < 3 * n; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(n)).append("@".repeat(n)).append(" "
                    .repeat(n)).append("@".repeat(n)).append("\n");
        }
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(n)).append("@@@".repeat(n)).append("\n");

        }
        return sb.toString();
    }
}