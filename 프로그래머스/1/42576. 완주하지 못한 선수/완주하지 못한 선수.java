import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> compMap = new HashMap<>();
        for (String comP: completion) {
            // 중복된 값이 있다면 => 그 값의 + 1 
            if(compMap.containsKey(comP)){
                compMap.replace(comP, compMap.get(comP) + 1);
            }else {
                compMap.put(comP, 1);
            }
        }
        
        String answer = null;
        for (String partP : participant){
            // 1이면 지우고, 2 이상이면 1을 차감
            if(compMap.containsKey(partP) && compMap.get(partP) != 0){
                compMap.replace(partP, compMap.get(partP) - 1);
            }else {
                answer = partP;
                break;
            }
        }
        return answer;
    }
}