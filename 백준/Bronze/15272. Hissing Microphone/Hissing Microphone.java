import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch = str.charAt(0);
        boolean isHiss = false;
        for (int i = 1; i < str.length(); i++) {

            if (ch == str.charAt(i) && ch == 's') {
                isHiss = true;
                break;
            } else {
                ch = str.charAt(i);
            }
        }

        System.out.println(isHiss ? "hiss" : "no hiss");
    }
}