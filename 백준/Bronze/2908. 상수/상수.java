import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = reader.readLine().split(" ");
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < 3; i++) {
            str1 += temp[0].charAt(2 - i);
            str2 += temp[1].charAt(2 - i);
        }

        System.out.println(Math.max(Integer.parseInt(str1), Integer.parseInt(str2)));
    }
}