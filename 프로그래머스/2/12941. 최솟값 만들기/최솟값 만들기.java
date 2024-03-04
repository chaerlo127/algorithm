import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        PriorityQueue<Integer> aq = new PriorityQueue<>();
        PriorityQueue<Integer> bq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i< A.length; i++){
            aq.add(A[i]);
            bq.add(B[i]);
        }
        int answer = 0;
        
        for (int i = 0 ; i < A.length ; i++){
            answer += aq.poll() * bq.poll();
        }

        return answer;
    }
}