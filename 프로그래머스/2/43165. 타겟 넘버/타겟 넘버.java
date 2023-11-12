class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    private void dfs(int id, int sum, int[] numbers, int target){
        if(id == numbers.length && sum == target){
            answer++;
            return;
        }
        
        if (id == numbers.length){
            return;
        }
        
        dfs(id+1, sum + numbers[id], numbers, target);
        dfs(id+1, sum - numbers[id], numbers, target);
    }
}