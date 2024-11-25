import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                int n1 = solution(o1);
                int n2 = solution(o2);

                if (n1 != n2) {
                    return n1 - n2;
                }

                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String string : arr) {
            sb.append(string).append("\n");
        }
        System.out.print(sb);
    }

    private static int solution(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }
}