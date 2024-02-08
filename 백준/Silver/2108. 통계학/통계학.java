import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        double sum = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            ar.add(num);
            sum += num;
            // 최빈값을 위해 저장
            if(map.containsKey(num)) map.replace(num, map.get(num) + 1);
            else map.put(num, 1);
        }

        // 최빈값 구하기
        int max = 0;
        for (int value : map.values()){
            max = Math.max(max, value);
        }
        List<Integer> li = new ArrayList<>();
        for (int key : map.keySet()){
            if(map.get(key) == max){
                li.add(key);
            }
        }
        Collections.sort(li);


        // 정렬
        Collections.sort(ar);
        // 산술 평균
        System.out.println(Math.round(sum/n));
        // 중앙값
        System.out.println(ar.get(((int)ar.size()/2)));
        // 최빈값
        System.out.println(li.size() == 0 ? 0 : (li.size() == 1 ? li.get(0) : li.get(1)));
        // 범위
        System.out.println(Math.abs(ar.get(ar.size()-1)-ar.get(0)));
    }
}