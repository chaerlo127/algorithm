class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i< numbers.length-1; i++){
            for (int j = i +1; j < numbers.length; j++){
                max = Math.max(max, numbers[i] * numbers[j]);
            }
        }
        return max;
    }
}