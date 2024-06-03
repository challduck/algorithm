import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] arr = new Character[5][15];
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);

                if (maxLength < str.length()) {
                    maxLength = str.length();
                }
            }
        }
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != null) {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
    
}