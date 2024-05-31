import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split("-");
        String str = "";
        for (int i = 0; i < num.length; i++) {
            str += num[i].charAt(0);
        }
        System.out.println(str);
    }
}