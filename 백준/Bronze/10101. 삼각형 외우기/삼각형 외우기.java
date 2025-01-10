import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        int sum = a1 + a2 + a3;

        if (sum != 180) {
            System.out.println("Error");
        } else if (a1 == 60 && a2 == 60 && a3 == 60) {
            System.out.println("Equilateral");
        } else if (a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}