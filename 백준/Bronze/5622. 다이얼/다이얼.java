import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            time += dialNumber(str.charAt(i));
        }
        System.out.println(time);
    }

    private static int dialNumber(char c) {
        if (c >= 'A' && c <= 'C')
            return 3; 
        if (c >= 'D' && c <= 'F')
            return 4;
        if (c >= 'G' && c <= 'I')
            return 5;
        if (c >= 'J' && c <= 'L')
            return 6;
        if (c >= 'M' && c <= 'O')
            return 7;
        if (c >= 'P' && c <= 'S')
            return 8;
        if (c >= 'T' && c <= 'V')
            return 9;
        if (c >= 'W' && c <= 'Z')
            return 10;
        return 0;
    }
}
