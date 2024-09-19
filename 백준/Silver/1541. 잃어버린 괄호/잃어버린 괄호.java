import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] minus_split = str.split("-");

        int res = calc(minus_split[0]);

        for (int i = 1; i < minus_split.length; i++) {
            res -= calc(minus_split[i]);
        }

        System.out.println(res);
    }

    private static int calc(String str) {
        String[] arr = str.split("\\+");
        int sum = 0;

        for (String string : arr) {
            sum += Integer.parseInt(string);
        }

        return sum;
    }
}