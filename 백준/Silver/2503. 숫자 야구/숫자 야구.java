import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] questions = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            questions[i][0] = num;
            questions[i][1] = ball;
            questions[i][2] = strike;
        }

        int answer = 0;

        List<int[]> possibleNumbers = new ArrayList<>();

        for (int i = 123; i <= 987; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            if (hundreds != tens && tens != units && hundreds != units && hundreds != 0 && tens != 0 && units != 0) {
                possibleNumbers.add(new int[] { hundreds, tens, units });
            }
        }

        for (int[] num : possibleNumbers) {
            boolean isValid = true;

            for (int j = 0; j < n; j++) {
                int guess = questions[j][0];
                int strike = questions[j][1];
                int ball = questions[j][2];

                int guessHundreds = guess / 100;
                int guessTens = (guess / 10) % 10;
                int guessUnits = guess % 10;

                int strikeCount = 0;
                int ballCount = 0;

                if (num[0] == guessHundreds)
                    strikeCount++;
                if (num[1] == guessTens)
                    strikeCount++;
                if (num[2] == guessUnits)
                    strikeCount++;

                if (num[0] == guessTens || num[0] == guessUnits)
                    ballCount++;
                if (num[1] == guessHundreds || num[1] == guessUnits)
                    ballCount++;
                if (num[2] == guessHundreds || num[2] == guessTens)
                    ballCount++;

                if (strikeCount != strike || ballCount != ball) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}