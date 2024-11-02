import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.length()==2) {
            System.out.println(Character.getNumericValue(str.charAt(0)) + Character.getNumericValue(str.charAt(1)));
        } else if (str.length() == 4) {
            System.out.println(20);
        } else {
            int str1 = Integer.parseInt(str.substring(0, 1));
            int str2 = Integer.parseInt(str.substring(1, 3));
            int str3 = Integer.parseInt(str.substring(0, 2));
            int str4 = Integer.parseInt(str.substring(2, 3));
            if (str3 == 10) {
                System.out.println(str3 + str4);                
            } else if(str2 == 10) {
                System.out.println(str2 + str1);
            }
        }
    }
}
