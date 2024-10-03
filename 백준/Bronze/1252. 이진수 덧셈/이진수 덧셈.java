import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] binaries = br.readLine().split(" ");
        
        BigInteger num1 = new BigInteger(binaries[0], 2);
        BigInteger num2 = new BigInteger(binaries[1], 2);
        BigInteger sum = num1.add(num2);
        
        System.out.println(sum.toString(2));
    }
}