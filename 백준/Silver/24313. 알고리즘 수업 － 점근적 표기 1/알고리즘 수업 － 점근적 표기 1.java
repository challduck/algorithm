import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] a_num = reader.readLine().split(" ");
        int a1 = Integer.parseInt(a_num[0]);
        int a0 = Integer.parseInt(a_num[1]);
        int c = Integer.parseInt(reader.readLine());
        int n0 = Integer.parseInt(reader.readLine());

        if (a0 <= n0 * c - n0 * a1 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
