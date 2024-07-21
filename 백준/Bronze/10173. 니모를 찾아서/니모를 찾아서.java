import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("EOI")) {
                break;
            } else {
                str = str.toLowerCase();
                if (str.contains("nemo")) {
                    sb.append("Found").append("\n");
                } else {
                    sb.append("Missing").append("\n");
                }
            }
                
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}