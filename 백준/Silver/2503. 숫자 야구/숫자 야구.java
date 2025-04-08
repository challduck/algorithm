import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        List<int[]> list = new ArrayList<>();

        for (int i = 123; i <= 987; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            if (hundreds != tens && tens != units && hundreds != units && hundreds != 0 && tens != 0 && units != 0) {
                list.add(new int[] { hundreds, tens, units });
            }
        }

        for (int[] num : list) {
            boolean flag = true;

            for (int j = 0; j < n; j++) {
                int guess = arr[j][0];
                int strike = arr[j][1];
                int ball = arr[j][2];

                int hundred = guess / 100;
                int ten = (guess / 10) % 10;
                int unit = guess % 10;

                int strikeCnt = 0;
                int ballCnt = 0;

                if (num[0] == hundred)
                    strikeCnt++;
                if (num[1] == ten)
                    strikeCnt++;
                if (num[2] == unit)
                    strikeCnt++;

                if (num[0] == ten || num[0] == unit)
                    ballCnt++;
                if (num[1] == hundred || num[1] == unit)
                    ballCnt++;
                if (num[2] == hundred || num[2] == ten)
                    ballCnt++;

                if (strikeCnt != strike || ballCnt != ball) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}