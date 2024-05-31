import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int[] month_arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int sum = 0;

        if (month == 1) {
            sum = day;
        } else {
            for (int i = 0; i < month - 1; i++) {
                sum += month_arr[i];
            }
            sum += day;
        }

        switch (sum % 7) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;

            default:
                break;
        }
    }
}