import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();

        String[] schoolList = new String[] { "North London Collegiate School", "Branksome Hall Asia",
                "Korea International School", "St. Johnsbury Academy" };

        for (int i = 0; i < schoolList.length; i++) {
            String ss = schoolList[i].replaceAll("[^a-zA-Z]",
                    "").toLowerCase().substring(0, 10);

            for (int j = 0; j < 26; j++) {
                StringBuilder sb = new StringBuilder();

                for (int k = 0; k < ss.length(); k++) {
                    char ch = ss.charAt(k);
                    ch += j;
                    if (ch > 'z') {
                        ch -= 26;
                    }
                    sb.append(ch);
                }

                if (sb.toString().equals(target)) {
                    if (i == 0) {
                        System.out.println("NLCS");
                        return;
                    } else if (i == 1) {
                        System.out.println("BHA");
                        return;
                    } else if (i == 2) {
                        System.out.println("KIS");
                        return;
                    } else if (i == 3) {
                        System.out.println("SJA");
                        return;
                    }
                }
            }
        }
    }
}