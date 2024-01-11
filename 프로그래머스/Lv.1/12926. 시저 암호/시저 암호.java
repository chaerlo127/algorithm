class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(s.charAt(i) + n > 'z'){
                    answer += (char) (s.charAt(i) + n + 'a' - 'z' - 1);
                }else{
                    answer += (char) (s.charAt(i) + n);
                }
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                if(s.charAt(i) + n > 'Z'){
                    answer += (char) (s.charAt(i) + n + 'A' - 'Z' - 1);
                }else{
                    answer += (char) (s.charAt(i) + n);
                }
                
            }else if(s.charAt(i) == ' '){
                answer += " ";
            }
        }
        return answer;
    }
}