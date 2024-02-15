import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        // 값 저장
        HashMap<String, Integer> hc = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            if(hc.containsKey(clothes[i][1])){
                hc.replace(clothes[i][1], hc.get(clothes[i][1]) + 1);
            }else{
                hc.put(clothes[i][1], 1);
            }
        }
        
        // 정답 계산
        // 경우의 수
        // (옷 종류) -> 한 개씩 입을 경우 + 입지 않을 경우 (n+1)
        // (옷 종류들의 곱셈) - 1 (아무것도 입지 않는 경우)
        int answer = 1;
        for (String key : hc.keySet()){
            answer *= (hc.get(key)+ 1);
        }
        return answer - 1;
    }
}