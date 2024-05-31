import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(reader.readLine());

        System.out.println((n * (n - 1) * (n - 2)) / 6);
        System.out.println(3);
    }
}
