import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 입력
        ArrayList<Integer> sArray = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n ; i ++){
            sArray.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(sArray);
        
        StringBuilder sb = new StringBuilder();
        //출력
        for (int value : sArray){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}