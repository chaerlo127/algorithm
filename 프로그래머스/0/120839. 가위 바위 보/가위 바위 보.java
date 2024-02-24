class Solution {
    public String solution(String rsp) {
        String[] rspL = rsp.split("");
        String answer = "";
        
        for (int i = 0 ; i < rspL.length; i++){
            if(rspL[i].equals("2")) answer += "0";
            else if(rspL[i].equals("0")) answer += "5";
            else answer += "2";
        }
        
        return answer;
    }
}