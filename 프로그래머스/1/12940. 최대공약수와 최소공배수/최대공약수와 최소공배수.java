class Solution {
    public int[] solution(int n, int m) {
        int a = gcd(n, m);
        int b = lcm(n, m);
        int[] answer = {a, b};
        
        return answer;
    }
    
    public int lcm (int a, int b){
        return a * b / gcd(a, b);
    }
    
    public int gcd (int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}