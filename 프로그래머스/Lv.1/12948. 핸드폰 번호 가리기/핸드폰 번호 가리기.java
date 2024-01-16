class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0 ; i < phone_number.length() ; i ++){
            if(phone_number.length()-i>4) answer+= "*";
        }
        answer+= phone_number.substring(phone_number.length()-4);
        return answer;
    }
}