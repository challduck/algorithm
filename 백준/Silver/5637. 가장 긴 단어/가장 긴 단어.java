import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (token.equals("E-N-D")) {
                    System.out.println(findLongestWord(input.toString()).toLowerCase());
                    return;
                }
                input.append(token).append("\n");
            }
        }
    }

    private static String findLongestWord(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z-]+");
        Matcher matcher = pattern.matcher(input);

        String longestWord = "";

        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
