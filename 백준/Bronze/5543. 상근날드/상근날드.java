import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Math.min(Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())), Integer.parseInt(br.readLine())) + Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())) - 50);
    }
}
