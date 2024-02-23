class Solution {
    public int solution(int[] num_list) {
        if(num_list.length > 10){
            int num = 0;
            for(int i = 0 ; i < num_list.length ; i++){
                num += num_list[i];
            }
            return num;
        }else {
            int num = 1;
            for(int i = 0 ; i < num_list.length ; i++){
                num *= num_list[i];
            }
            return num;
        }
    }
}