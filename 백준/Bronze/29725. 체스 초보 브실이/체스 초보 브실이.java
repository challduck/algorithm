import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int[] scores = { 0, 1, 3, 3, 5, 9 };

        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                char piece = str.charAt(j);
                switch (piece) {
                    case 'K':
                        answer += scores[0];
                        break;
                    case 'P':
                        answer += scores[1];
                        break;
                    case 'N':
                        answer += scores[2];
                        break;
                    case 'B':
                        answer += scores[3];
                        break;
                    case 'R':
                        answer += scores[4];
                        break;
                    case 'Q':
                        answer += scores[5];
                        break;
                    case 'k':
                        answer -= scores[0];
                        break;
                    case 'p':
                        answer -= scores[1];
                        break;
                    case 'n':
                        answer -= scores[2];
                        break;
                    case 'b':
                        answer -= scores[3];
                        break;
                    case 'r':
                        answer -= scores[4];
                        break;
                    case 'q':
                        answer -= scores[5];
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(answer);
    }
}