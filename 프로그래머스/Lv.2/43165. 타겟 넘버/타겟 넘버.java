class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    

    public void dfs(int[] numbers, int target, int sum, int depth){
        if (sum == target && depth == numbers.length){
            answer ++;
            return;
        }
        
        if(depth == numbers.length) return;
        
        dfs(numbers, target, sum + numbers[depth], depth + 1);
        dfs(numbers, target, sum - numbers[depth], depth + 1);
    }
}