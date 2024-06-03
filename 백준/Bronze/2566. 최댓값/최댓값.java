import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[9][9];
        int maxValue = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;
        
        // 행렬 입력 받기
        for (int i = 0; i < 9; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
                // 최댓값 및 위치 갱신
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i + 1; // 1부터 시작하는 행 번호
                    maxCol = j + 1; // 1부터 시작하는 열 번호
                }
            }
        }
        
        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);
    }
    
}