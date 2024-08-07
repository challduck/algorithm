import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (str.contains("Fizz") || str.contains("Buzz")) {
                continue;
            } else {
                flag = false;
                if (i == 0) {
                    System.out.println(fizzBuzz(Integer.parseInt(str) + 3));
                } else if (i == 1) {
                    System.out.println(fizzBuzz(Integer.parseInt(str) + 2));
                } else if (i == 2) {
                    System.out.println(fizzBuzz(Integer.parseInt(str) + 1));
                }
                return;
            }
        }

        if (flag) {
            System.out.println(0);
        }

    }

    public static String fizzBuzz(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return "FizzBuzz";
        } else if (a % 3 == 0) {
            return "Fizz";
        } else if (a % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(a);
        }

    }
}