import java.util.*;

class Solution {
    public String solution(String input_string) {
        String[] li = input_string.split("");
        String last_word = "";
        Map<String, Integer> words = new HashMap<>();
        String answer = "";
        
        for (String l : li){
            // 배열에 저장되어 있는 경우
            if(words.containsKey(l) && !l.equals(last_word)){
                // 이전 알파벳이랑 이어진 경우 -> 넘어감
                // 이전 알파벳이랑 이어지지 않은 경우
                words.replace(l, words.get(l) + 1);
            }
            if(!words.containsKey(l)){
                words.put(l, 1);
            }
            last_word = l;
        }
        
        System.out.println(words);
        
        for (String key : words.keySet()){
            if(words.get(key) > 1) answer += key;
        }
        
        return answer == "" ? "N" : answer;
    }
}
