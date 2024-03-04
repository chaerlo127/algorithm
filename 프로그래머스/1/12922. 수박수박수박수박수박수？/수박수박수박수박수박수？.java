class Solution {
    public String solution(int n) {
        String first = "수";
        String second = "박";
        String answer = "";
        
        for (int i = 0; i < n ; i++){
            if(i % 2 == 0){
                answer+=first;
            }else answer+=second;
        }
        return answer;
    }
}