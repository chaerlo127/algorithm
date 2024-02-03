import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 입력값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = n;

        // 계산
        for(int i = m ; i <= n ; i ++){
            if(!checkDemical(i) || i == 1) continue;
            // 덧셈
            sum += i;
            // 최소값
            min = Math.min(min, i);
        }

        // 출력 값
        if (sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
    public static boolean checkDemical(int num){
        for(int i = 2; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}