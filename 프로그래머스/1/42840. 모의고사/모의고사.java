import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        // 초기 선언
        int[] answerArray = new int[4];
        
        int[] aArray = {1, 2, 3, 4, 5};
        int[] bArray = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cArray = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 완전 탐색
        for (int i = 0; i < answers.length ; i ++){
            if(check(aArray, answers[i], i)) answerArray[1]++;
            if(check(bArray, answers[i], i)) answerArray[2]++;
            if(check(cArray, answers[i], i)) answerArray[3]++;
        }
        
        // 결과 도출 및 오름차순 정렬
        int max = checkMax(answerArray);
        List<Integer> answer = new ArrayList();
        for (int i = 1; i < answerArray.length; i++){
            if(answerArray[i] == max) answer.add(i);
        }
        
        // arrayList to array
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    // 배열 내 값과 정답이 일치하는지 확인
    public boolean check(int[] array, int answer, int index){
        return array[index%array.length] == answer ? true : false;
    }
    
    public int checkMax(int[] answerArray){
        int max = Math.max(answerArray[1], Math.max(answerArray[2], answerArray[3]));
        return max;
    }
}