class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1 ; i < n + 1 ; i++){
            int index = 0;
            for (int j = 1; j < i + 1; j++){
                if(i % j == 0) index++;
            }
            if(index >= 3) answer++;
        }
        return answer;
    }
}