import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] formation_data = br.readLine().split(" ");
        String str = formation_data[0];
        int formation = Integer.parseInt(formation_data[1]);
        String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str2.indexOf(str.charAt(str.length() - 1 - i)) * Math.pow(formation, i);
        }
        System.out.println(sum);
    }
}