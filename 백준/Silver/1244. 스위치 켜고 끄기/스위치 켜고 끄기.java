import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int students = sc.nextInt();
        for (int i = 0; i < students; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();

            if (gender == 1) {
                for (int j = num - 1; j < arr.length; j+= num) {
                    arr[j] = arr[j] == 1 ? 0 : 1;
                }
            } else {
                int center_index = num - 1;
                arr[center_index] = arr[center_index] == 1 ? 0 : 1;

                int left = center_index - 1;
                int right = center_index + 1;
                while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
                    arr[left] = arr[left] == 1 ? 0 : 1;
                    arr[right] = arr[right] == 1 ? 0 : 1;
                    left--;
                    right++;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1)  % 20 == 0) {
                System.out.print(arr[i]);
                System.out.println();
            } else{
                System.out.print(arr[i] + " ");
            }
        }
    }
}