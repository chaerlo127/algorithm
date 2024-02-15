import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> li = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
            li.add(arr[i]);
        }
        
        int[] answer = new int[li.size()];
        for(int i = 0 ; i < li.size() ; i++){
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}