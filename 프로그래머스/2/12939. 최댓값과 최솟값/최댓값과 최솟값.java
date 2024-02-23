import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> ans = new ArrayList<>();
        while(st.hasMoreTokens()){
            ans.add(Integer.parseInt(st.nextToken()));   
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer number : ans){
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        return min + " "  + max;
    }
}