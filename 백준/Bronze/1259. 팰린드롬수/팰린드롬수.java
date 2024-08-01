import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            if (str.length() % 2 == 0) {
                String before = "";
                String after = "";

                for (int i = 0; i < str.length() / 2; i++) {
                    before += Character.toString(str.charAt(i));
                }

                for (int i = str.length() - 1; i >= str.length() / 2; i--) {
                    after += Character.toString(str.charAt(i));
                }

                if (before.equals(after)) {
                    sb.append("yes").append("\n");
                } else {
                    sb.append("no").append("\n");
                }
            } else {
                String before = "";
                String after = "";

                for (int i = 0; i < str.length() / 2; i++) {
                    before += Character.toString(str.charAt(i));
                }

                for (int i = str.length() - 1; i > str.length() / 2; i--) {
                    after += Character.toString(str.charAt(i));
                }

                if (before.equals(after)) {
                    sb.append("yes").append("\n");
                } else {
                    sb.append("no").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}