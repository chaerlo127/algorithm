class Solution {
    public int solution(int n) {
        double answer = Math.sqrt(n);
        System.out.println(answer);
        return answer % (int) answer == 0 ? 1 : 2;
    }
}