import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String input = br.readLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += str.indexOf(input.charAt(i));
        }
        sum += input.length();
        System.out.println(isPrimeNum(sum) == true ? "It is a prime word." : "It is not a prime word.");
    }    
    
    private static boolean isPrimeNum (int n){
        boolean isPrime = true;
        if (n == 1 || n == 2 || n == 3) {
            return isPrime;
        } else if (n == 4) {
            isPrime = false;
        } else {
            for (int i = 5; i <= n / 2; i ++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}