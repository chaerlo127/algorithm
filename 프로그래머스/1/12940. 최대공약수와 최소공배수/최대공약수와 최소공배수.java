class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0; // 최대공약수
        int lcm = 0; // 최소공배수
        
        gcd = solveGCD(n, m);
        lcm = solveLCM(gcd, n * m);
        
        int[] answer = {gcd, lcm};
        return answer;
    }
    
    private int solveGCD(int a, int b){
        // 나머지가 0이면 return
        if (a % b == 0) return b;
        return solveGCD(b, a % b);
    }
    
    // 최소공배수 = 두수의 곱 / 최대공약수
    private int solveLCM(int gcd, int nm){
        return nm / gcd;
    }
}