import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            
            for (int j = 0; j < first.length(); j++) {
                arr1[first.charAt(j) - 'a']++;
            }
            
            for (int j = 0; j < second.length(); j++) {
                arr2[second.charAt(j) - 'a']++;
            }

            if (Arrays.equals(arr1, arr2)){
                return true;
            }
            return false;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
