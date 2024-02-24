class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        
        while(chicken >= 10){
            int num = chicken / 10;
            answer += num;
            chicken = chicken % 10 + chicken / 10;
        }
        return answer;
    }
}