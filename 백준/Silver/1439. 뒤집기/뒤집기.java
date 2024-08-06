import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        String[] zero = str.split("0");
        String[] one = str.split("1");

        int zero_cnt = 0;
        int one_cnt = 0;

        for (int i = 0; i < zero.length; i++) {
            if (!zero[i].equals("")) {
                zero_cnt++;
            }
        }

        for (int i = 0; i < one.length; i++) {
            if (!one[i].equals("")) {
                one_cnt++;
            }
        }

        System.out.println(one_cnt > zero_cnt ? zero_cnt : one_cnt);
    }
}
