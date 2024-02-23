class Solution {
    public int solution(int a, int b) {
        int aAb = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int bAa = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return Math.max(aAb, bAa);
    }
}