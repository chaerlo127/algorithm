import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int num : numlist){
            if(num % n == 0){
                li.add(num);
            }
        }
        int[] answer = new int[li.size()];
        for (int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}