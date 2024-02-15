import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++){
            queue.offer(priorities[i]);
        }
        
        int answer = 0;
        while (!queue.isEmpty()){ // queue의 값이 없을 때까지
            for (int i = 0; i < priorities.length; i++){ // queue 와 우선순위 위치를 비교하기 위해
                if(queue.peek() == priorities[i]){ // 우선순위로 정렬된 queue와 우선순위 안에 있는 값이 일치한 경우
                    queue.poll(); // 삭제
                    answer++; // 정답 ++
                    if(i == location) return answer; // 우선순위로 뽑은 값이 알고 싶은 프로세스 위치인 경우
                    
                }
            }
        }
        return answer;
    }
    
    
}