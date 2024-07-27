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

            if (str.equals("end")) {
                break;
            }

            if (!str.contains("a") && !str.contains("e") && !str.contains("i") &&
                    !str.contains("o")
                    && !str.contains("u")) {
                sb.append("<" + str + ">" + " is not acceptable.").append("\n");
                continue;
            }

            boolean flag = false;
            for (int i = 97; i <= 121; i++) {
                if (i == 101 || i == 111) {
                    continue;
                } else {
                    if (str.contains(Character.toString(i).repeat(2))) {
                        flag = true;
                        break;
                    }
                }
            }

            int cnt = 0;
            boolean is_three = false;

            int cnt2 = 0;
            boolean is_three2 = false;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ("aeiou".indexOf(ch) != -1) {
                    cnt++;
                    cnt2 = 0;
                    if (cnt >= 3) {
                        is_three = true;
                        break;
                    }
                } else {
                    cnt2++;
                    if (cnt2 >= 3) {
                        is_three2 = true;
                        break;
                    }
                    cnt = 0;
                }
            }

            if (flag || is_three || is_three2) {
                sb.append("<" + str + ">" + " is not acceptable.").append("\n");

            } else {
                sb.append("<" + str + ">" + " is acceptable.").append("\n");
            }
        }
        System.out.println(sb);
    }
}