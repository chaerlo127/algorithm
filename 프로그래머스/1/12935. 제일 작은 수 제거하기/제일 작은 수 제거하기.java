import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length < 2) return new int[]{-1};
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            int temp = min;
            min = Math.min(min, arr[i]);
            if(min != temp){
                index = i;
            }
        }
        int[] ans = new int[arr.length-1];
        int index1 = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                ans[index1++] = arr[i];
            }
        }
        return ans;
    }
}