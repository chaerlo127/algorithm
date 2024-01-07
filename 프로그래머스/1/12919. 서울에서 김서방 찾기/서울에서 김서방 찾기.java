class Solution {
    public String solution(String[] seoul) {
        int answer = 0;
        
        for (int i = 0 ; i < seoul.length; i++){
            if (seoul[i].equals("Kim")) {
                answer = i;
                break;
            }
        }
        String answer1 = "김서방은 ";
        String answer2 = "에 있다";
        return answer1 + answer + answer2;
    }
}