import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int num1 = b - a;
            int num2 = c - b;
            int answer = Math.max(num1, num2) - 1;
            System.out.println(answer);            
        }
        sc.close();
        
    }
}
