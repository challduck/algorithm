import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qty = Integer.parseInt(br.readLine());
        int[][] area_arr = new int[6][2];
        int max_width = 0;
        int max_height = 0;
        int wid_index = 0;
        int hei_index = 0;

        for (int i = 0; i < area_arr.length; i++) {
            String[] str = br.readLine().split(" ");
            area_arr[i][0] = Integer.parseInt(str[0]);
            area_arr[i][1] = Integer.parseInt(str[1]);
            // 동, 서
            if (area_arr[i][0] == 1 || area_arr[i][0] == 2) {
                if (max_height < area_arr[i][1]) {
                    max_height = area_arr[i][1];
                    wid_index = i;
                }
            }
            // 남, 북
            if (area_arr[i][0] == 3 || area_arr[i][0] == 4) {
                if (max_width < area_arr[i][1]) {
                    max_width = area_arr[i][1];
                    hei_index = i;
                }
            }
        }

        int total_area = max_height * max_width;
        int blank_width_index = 0;
        int blank_height_index = 0;

        if (wid_index + 3 >= 6) {
            blank_width_index = wid_index - 3;
        } else {
            blank_width_index = wid_index + 3;
        }

        if (hei_index+ 3 >= 6) {
            blank_height_index = hei_index - 3;
        } else {
            blank_height_index = hei_index + 3;
        }
        System.out.println((total_area - (area_arr[blank_width_index][1] * area_arr[blank_height_index][1])) * qty);
    }
}