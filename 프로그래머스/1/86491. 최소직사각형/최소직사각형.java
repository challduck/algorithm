class Solution {
    public int solution(int[][] sizes) {
        int max_x = 0;
        int max_y = 0;
        
        for (int[] size : sizes) {
            int x = Math.max(size[0], size[1]);
            int y = Math.min(size[0], size[1]);
            
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
        }
        
        return max_x * max_y;
    }
}